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
<title>经理代理商</title>
<script src="${pageContext.request.contextPath}/assets/regeist/js/jquery-2.1.4.min.js"></script>
 <script type="text/javascript" src="${pageContext.request.contextPath}/assets/regeist/js/mobilebone.js"></script>
<link  href="${pageContext.request.contextPath}/assets/regeist/css/common.css" rel="stylesheet" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/regeist/css/mobilebone.css">
</head>

<body ontouchstart class="bg_gray">
	 <form  action="${pageContext.request.contextPath}/agent/agent1Add.html" method="post" id="formUser">
	<div class="page in pageHome" id="homePage">
	<header class="header">
		<img src="${pageContext.request.contextPath}/assets/regeist/images/logo5.png">
	</header>
	<div style="width: 100%; text-align: center;" id="error">
		<br> <label style="color: red;" id="successMsg">${errMsg}</label>
	</div>
	<section class="merchant_info">
		<p></p>
		<div class="merchant_info_detail">
			<label></label>
		<input type="text" class="blue arial" style="text-align: center;" value="经理代理商" readonly="readonly" required="required" >
		<input type="hidden" id="type" name="type"  class="blue arial" style="text-align: center;" value="2" readonly="readonly" required="required" >
		</div>
		<div class="merchant_info_detail">
			<label>用户姓名</label>
			<input type="text" id="name" name="name" required="required" placeholder="报单人姓名">
		</div>
		<div class="merchant_info_detail">
			<label>微信</label>
			<input type="text" id="weixin" name="weixin" required="required" placeholder="报单人微信">
		</div>
		<div class="merchant_info_detail">
			<label>电话</label>
			<input type="tel" id="tel" name="tel"  required="required"  placeholder="报单人电话">
		</div>
		<div class="merchant_info_detail">
			<label>师父微信</label>
			<input type="text" id="refereeWeixin" name="refereeWeixin"  required="required"  placeholder="师父微信(务必正确填写)">
		</div>
		<div class="merchant_info_detail">
			<label>直属领导姓名</label>
			<input type="text" name="leaderid1" id="leaderid1"  required="required"  placeholder="填写直属领导姓名">
		</div>
		
		<a href="#&leader"><div class="merchant_info_detail">
			<label>团队总领导</label>
			<input type="hidden" name="leaderid2" id="leaderid2" placeholder="请选择" readonly="readonly" >
			<input type="text" name="leader2Label" id="leader2Label" placeholder="请选择" readonly="readonly" >
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
	
	
	
	
	<div class="page icon out" id="leader">
		<div class="province_list" id="leaderList">
			<c:forEach var="leader" items="${leaderList}" varStatus="status" > 
				<a href="#&amp;homePage" onclick="chooseLeader('${leader.id }','${leader.name}');">
					<section data-distcode="${leader.id }" data-diststr="${leader.name}" class="address merchant_info_detail">
						<label>${leader.name}</label>
						<span></span>
					</section>
				</a>
			</c:forEach>
		</div>	
	</div>
	<%--  <div class="page icon out" id="leader1">
		<div class="province_list" id="leader1List">
			<c:forEach var="leader" items="${leaderList}" varStatus="status" > 
				<a href="#&amp;homePage" onclick="chooseLeader1('${leader.id }','${leader.name}');">
					<section data-distcode="${leader.id }" data-diststr="${leader.name}" class="address merchant_info_detail">
						<label>${leader.name}</label>
						<span></span>
					</section>
				</a>
			</c:forEach>
		</div>
	</div> --%>
	
	
	<script type="text/javascript">

	function chooseLeader(id,name){
		$("#leader2Label").val(name);
		$("#leaderid2").val(id);
		console.log("团队领导选择："+id+"|"+name);
	}
	
	/* function chooseLeader1(id,name){
		$("#leaderid1Label").val(name);
		$("#leaderid1").val(id);
		console.log("团队领导选择："+id+"|"+name);
	} */
	
	function subForm(){
		$("#successMsg").html("");
		var errMsg="";
		if($("#name").val()==""){
			errMsg="请填写姓名";
		}else if($("#weixin").val()==""){
			errMsg="请填写微信";
		}else if($("#tel").val()==""||isNaN($("#tel").val())){
			errMsg="请正确填写电话号码";
		}else if($("#leaderid2").val()==""){
			errMsg="请选择团队领导";
		}else if($("#leaderid1").val()==""){
			errMsg="请填写直属领导";
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
	</script>
</body>
</html>
   
	