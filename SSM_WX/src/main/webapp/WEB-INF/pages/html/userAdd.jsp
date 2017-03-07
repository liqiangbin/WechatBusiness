<%@ page contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta content="initial-scale=1.0,user-scalable=no,maximum-scale=1,width=device-width" name="viewport" />
<meta content="yes" name="apple-mobile-web-app-capable" />
<meta content="black" name="apple-mobile-web-app-status-bar-style" />
<meta content="telephone=no" name="format-detection" />
<title>客户报单</title>
<script src="${pageContext.request.contextPath}/assets/regeist/js/jquery-2.1.4.min.js"></script>
 <script type="text/javascript" src="${pageContext.request.contextPath}/assets/regeist/js/mobilebone.js"></script>
<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/assets/regeist/js/jquery.cityselect.js"></script> --%>
<link  href="${pageContext.request.contextPath}/assets/regeist/css/common.css" rel="stylesheet" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/regeist/css/mobilebone.css">
</head>

<body ontouchstart class="bg_gray">
	 <form  action="${pageContext.request.contextPath}/user/userAdd.html" method="post" id="formUser">
	<div class="page in pageHome" id="homePage">
	<header class="header">
		<img src="${pageContext.request.contextPath}/assets/regeist/images/logo5.png">
	</header>
	<div style="width: 100%; text-align: center;" id="error">
		<br> <label style="color: red;" id="successMsg">${errMsg}</label>
	</div>
	<section class="merchant_info">
		<p></p>
		<a href="#&yewu"><div class="merchant_info_detail">
			<label>业务选择</label>
			<input type="hidden" name="yewuid"  placeholder="" readonly="true" id="yewuid" >
			<input type="hidden"  name="packageid" id="packageid"  placeholder="" readonly="true"  >
			<input type="text"  name="packageLabel" id="packageLabel"  placeholder="" readonly="true"  >
			<span></span>
		</div></a>
		<div class="merchant_info_detail">
			<label>单价￥</label>
			<input type="hidden" name="price" id="price" class="form-control"  style="width:50px;" value="0" readonly="readonly"	 onchange="calSum();" > 
			<input type="text" class="blue arial" name="priceLabel" id="priceLabel" value="0" readonly="readonly" onchange="calSum();">
		</div>
		<div class="merchant_info_detail">
			<label>数量(份)</label>
			<input type="number" class="blue arial" id="num" name="num" value="1"  required="required" onchange="calSum();">
		</div>
		<div class="merchant_info_detail">
			<label>总金额(米)</label>
			<input type="hidden" class="blue arial" id="sum" name="sum" value="0"  required="required">
			<input type="text" class="blue arial" id="sumLabel" name="sumLabel" value="0" readonly="readonly" required="required">
		</div>
	</section>
	<section class="merchant_info">
		<p></p>
		<div class="merchant_info_detail">
			<label>姓名</label>
			<input type="text" id="name" name="name" required="required" placeholder="购买人姓名">
		</div>
		<div class="merchant_info_detail">
			<label>微信</label>
			<input type="text" id="weixin" name="weixin" required="required" placeholder="购买人微信">
		</div>
		<div class="merchant_info_detail">
			<label>电话</label>
			<input type="tel" id="tel" name="tel"  required="required"  placeholder="购买人电话">
		</div>
		
		<div class="merchant_info_detail">
			<label>代理商微信</label>
			<input type="text" id="agentweixin" name="agentweixin" required="required" placeholder="客户直接代理商微信">
		</div>
		
			<div class="merchant_info_detail">
			<label>直属领导</label>
			<input type="text" id="refereeWeixin" name="refereeWeixin" required="required" placeholder="代理商的直属领导">
		</div>
		
		
		<a href="#&leader"><div class="merchant_info_detail">
			<label>团队总领导</label>
			<input type="hidden" name="leaderid" id="leaderid" placeholder="请选择" readonly="readonly" >
			<input type="text" name="leaderLabel" id="leaderLabel" placeholder="请选择" readonly="readonly" >
			<span></span>
		</div></a>
	</section>
		<div style="width: 100%; text-align: center;" id="error">
		<br> <label style="color: red;" id="errorMsg"></label>
	</div>
	<div class="row_btn">
		<a class="blue btn"  onclick="subForm()">提交</a>
	</div>
	</div>
	</form>
		<div class="page icon out" id="yewu">
		<div class="province_list" id="yewuList"> 
		 <c:forEach var="business" items="${businessList}"> 
	    <a href="#&amp;taocan" onclick="chooseYewu('${business.id }','${business.name}')">
		<section data-distcode="${business.id }" data-diststr="${business.name}" class="address merchant_info_detail">
		<label>${business.name}</label>
		<span></span>
		</section></a>
		</c:forEach> 
	</div>
	</div>
	
			<div class="page icon out" id="taocan">
		<div class="province_list" id="taocanList"> 
	</div>
	</div>
	
	
	 <div class="page icon out" id="leader">
		<div class="province_list" id="leaderList">
		<c:forEach var="leader" items="${leaderList}" varStatus="status" > 
		 <a href="#&amp;homePage" onclick="chooseLeader('${leader.id }','${leader.name}');">
		<section data-distcode="${leader.id }" data-diststr="${leader.name}" class="address merchant_info_detail">
		<label>${leader.name}</label>
		<span></span>
		</section></a>
		 </c:forEach>	
	</div>
	</div>
	<script type="text/javascript">
	function calSum(){
		console.log("开始计算价格");
		 var price=$("#price").val();
		 var num=$("#num").val();
		 console.log("计算价格-->"+price+"|"+num);
		 var sum=price*num;
		 $("#sum").val(sum);
		 $("#sumLabel").val(sum);
	 }
	</script>
	<script>
	
	function chooseYewu(id,name){
		console.log("业务选择："+id+"|"+name);
	    $("#packageLabel").val(name+"--");
		$("#yewuid").val(id);
		$("#taocanList").empty();
		<c:forEach var="taocan" items="${packageList}" varStatus="status" > 
		 if(${taocan.type}==id){
			 $("#taocanList").append("<a href='#&amp;homePage' onclick='chooseTaocan("+${taocan.id}+","+${taocan.price}+");'><section data-citycode='${taocan.id}' data-citystr='${taocan.name}' class='address merchant_info_detail'><label>${taocan.name}</label><span></span></section></a>");
		 }
		 </c:forEach> 
	}
	
	function chooseLeader(id,name){
		$("#leaderLabel").val(name);
		$("#leaderid").val(id);
		console.log("领导选择："+id+"|"+name);
	}
	
	function subForm(){
		$("#successMsg").html("");
		var errMsg="";
		if($("#yewuid").val()==""){
			errMsg="请选择业务";
		}else if($("#packageid").val()==""){
			errMsg="请选择套餐";
		}else if($("#price").val()==""){
			errMsg="价格有误，请重选套餐";
		}else if($("#num").val()==""||isNaN($("#num").val())){
			errMsg="请输入合法的数量";
		}else if($("#name").val()==""){
			errMsg="请填写姓名";
		}else if($("#weixin").val()==""){
			errMsg="请填写微信";
		}else if($("#tel").val()==""||isNaN($("#tel").val())){
			errMsg="请正确填写电话号码";
		}else if($("#agentweixin").val()==""){
			errMsg="请填写代理商微信";
		}else if($("#refereeWeixin").val()==""){
			errMsg="请填写直属领导姓名";
		}else if($("#leaderid").val()==""){
			errMsg="请选择团队领导";
		}
		$("#errorMsg").html(errMsg);
		if(errMsg==""){
			$("#formUser").submit();
		}
		
	}
	
	function bodySize(){
			var screenWidth = screen.width;
			$("html").css("font-size", Math.floor( screenWidth *0.1*2.677)+"px")
		}
		bodySize();
		$(window).resize(function(){
			bodySize();
		})
		
		function chooseTaocan(id,price){
			$("#packageid").val(id);
			 $("#price").val(price);
			  $("#priceLabel").val(price);
			  console.log("tancanxuanze--id"+id);
		 <c:forEach var="taocan" items="${packageList}" > 
		 var taocanName='${taocan.name}';
		 console.log(${taocan.type}+"|"+${taocan.id}+"|"+taocanName);
		 if(${taocan.id}==id){
			  console.log("###$"+${taocan.price});
 				  $("#price").val('${taocan.price}');
				  $("#priceLabel").val('${taocan.price}');
				  taocanName=$("#packageLabel").val()+taocanName;
				  $("#packageLabel").val(taocanName);
		 }
		 </c:forEach>  
		 calSum();
	}
		
	</script>
</body>
</html>
   
	