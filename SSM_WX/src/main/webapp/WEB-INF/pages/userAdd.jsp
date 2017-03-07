<%@ page contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../base/base.jsp"></jsp:include>
	<jsp:include page="../base/bodycomm.jsp"></jsp:include>
	<body class="page-container-bg-solid page-sidebar-closed-hide-logo page-header-fixed ">
		
		<!-- -修改密码，用户信息 -->
	<%-- 	<jsp:include page="../base/alert_modal.jsp"></jsp:include> --%>
	
		<!-- END HEADER -->
		<div class="clearfix"></div>
		<!-- BEGIN CONTAINER -->
		<div class="page-container">
			<jsp:include page="../base/left.jsp"></jsp:include>
			<!-- END SIDEBAR -->
			<!-- BEGIN CONTENT -->
			<div class="page-content-wrapper">
				<div class="page-content">
					<!-- BEGIN PAGE HEADER-->
					<h3 class="page-title">客户报单</h3>
					<div class="page-bar">
						<ul class="page-breadcrumb">
							<li class="active">
								<i class="fa fa-home"></i>
								<a href="index.html">首页</a>
								<i class="fa fa-angle-right"></i>
							</li>
							<li>
								<a href="javascript:void(0)">客户入驻</a>
								<i class="fa fa-angle-right"></i>
							</li>
							<li>
								<a href="#">客户报单</a>
							</li>
						</ul>
					</div>
					<!-- END PAGE HEADER-->
					<!-- BEGIN PAGE CONTENT-->
					<div class="row">
						<div class="col-md-12">
							 <form class="form-horizontal form-row-seperated" action="${pageContext.request.contextPath}/user/userAdd.html" method="post" id="formUser">
								<div class="portlet light">
									<div class="portlet-body">
										<div class="table-responsive">
										<table class="table table-bordered table_sxcondition">			
											<tr>	
											<!-- businessList packageList agentList leaderList -->									
												<th width="25%">业务选择：</th>
												<td width="75%">
													<select class="bs-select form-control input-large" id="yewuid" name="yewuid" data-placeholder="正常" required="true" onchange="businessChange();">
														<option value="">请选择 </option>
														 <c:forEach var="business" items="${businessList}"> 
														 <option value="${business.id }">${business.name}</option>
														 </c:forEach>
													</select>  
												</td>
											</tr>
											<tr>										
												<th width="25%">套餐选择：</th>
												<td width="50%">
													<select class="bs-select form-control input-large" data-placeholder="正常" name="packageid" id="packageid" required="true" onchange="packageChange();" >
														<option value="">请选择</option>
															 <c:forEach var="taocan" items="${packageList}" varStatus="status" > 
														 <option value="${taocan.id }">${taocan.name} </option>
														 </c:forEach>											
													</select>  
												</td>
											</tr>
											<tr>										
												<th width="25%"> 套餐单价：</th>
												<td width="75%" class="form-inline" >
													<input type="hidden" name="price" id="price" class="form-control"  style="width:50px;" value="0" onchange="calSum();" > 
												<label class="lineheight34" name="priceLabel" id="priceLabel" style="color:gray;" onchange="calSum();">0</label>&nbsp;米
												</td>
											</tr>
												<tr>										
												<th width="25%">购买 数量：</th>
												<td width="75%" class="form-inline">
												<input type="text" id="num" name="num" class="form-control" style="width:50px;" required="true" value="1" onchange="calSum();"> 套
											
												</td>
											</tr>
											<tr>										
												<th width="25%">总金额：</th>
												<td width="75%" class="form-inline">
												<input type="hidden" id="sum" name="sum" value="0">
												<label class="lineheight34" name="sumLabel" id="sumLabel" style="color:gray;"  onchange="calSum();">0</label>&nbsp;&nbsp;米
												</td>
											</tr>
											
											<tr>										
												<th width="25%">姓名：</th>
												<td width="75%"><input type="text" id="name" name="name" required="true" class="form-control input-large" placeholder="请输入姓名" value=""></td>					
											</tr>	
											<tr>										
												<th width="25%">微信号：</th>
												<td width="75%"><input type="text" id="weixin" name="weixin" required="true" class="form-control input-large" placeholder="请输入微信号" value=""></td>					
											</tr>
											<tr>										
												<th width="25%">电话号：</th>
												<td width="75%"><input type="tel" id="tel" name="tel"  required="true" class="form-control input-large" placeholder="请输入电话"></td>					
											</tr>			
											<tr>										
												<th width="25%">代理商微信：</th>
													<td width="75%"><input type="text"  required="true" id="agentweixin" name="agentweixin" class="form-control input-large" value="" placeholder="输入代理商微信"></td>					
											</tr>	
											<tr>										
												<th width="25%">直属领导：</th>
												<td width="75%"><input type="text" id="refereeWeixin"  name="refereeWeixin" class="form-control input-large" value="" placeholder="没有可以不填写"></td>					
											</tr>
											<tr>										
												<th width="25%">团队领导：</th>
												<td width="75%">
													<select class="bs-select form-control input-large" id="leaderid" name="leaderid" data-placeholder="正常" required="true">
														<option value="">请选择</option>
															 <c:forEach var="leader" items="${leaderList}" varStatus="status" > 
														 <option value="${leader.id }">${leader.name}</option>
														 </c:forEach>													
													</select>  
												</td>						
											</tr>				
											<tr>
												<th>&nbsp;</th>											
												<td>
													<button type="button" onclick="window.history.back()" class="btn default"><i class="fa fa-reply"></i> 后退</button>
													<button type="submit"  class="btn btn-primary"><i class="fa fa fa-check"></i> 提交</button>
												</td>
											</tr>
										</table>
										</div>									
									</div>						
								</div>
							</form>
						</div>
					</div>
					<!-- END PAGE CONTENT-->
				</div>
			</div>
			<!-- END CONTENT -->
		</div>
		<!-- END CONTAINER -->
		<input type="hidden" id="errMsg" value="${errMsg}">
		<script type="text/javascript">
		setTimeout(function() {
			 var errMsg=$("#errMsg").val();
		     if(""==errMsg){
		     }else{
		    		showAlertModel("提示信息", errMsg, null);
		     }
		}, 500);
    
	</script>
<script type="text/javascript">
	 function businessChange(){
		 var businessId=$("#yewuid").val();
		 var count=0;
		 $("#packageid").empty();
		  <c:forEach var="taocan" items="${packageList}" varStatus="status" > 
		 if(${taocan.type}==businessId){
			  $("#packageid").append('<option value="'+${taocan.id}+'" >${taocan.name}</option>'); 
			  var pr=${taocan.price};
			  console.log(${taocan.price});
			  if(count==0){
				  $("#price").val(pr);
				  $("#priceLabel").html(pr);
				  calSum();
			  }
			  count++;
		 }
		 </c:forEach>  
	 }
	 function packageChange(){
		 var packageId=$("#packageid").val();
		  <c:forEach var="taocan" items="${packageList}" varStatus="status" > 
		 if(${taocan.id}==packageId){
			 $("#price").val(${taocan.price});
			 $("#priceLabel").html("${taocan.price}");
			 calSum();
		 }
		 </c:forEach>  
	 }
	 
	 function calSum(){
		 var price=$("#price").val();
		 var num=$("#num").val();
		 var sum=price*num;
		 $("#sum").val(sum);
		 $("#sumLabel").html(sum);
	 }
	 
	</script>
	<script type="text/javascript">
	$("#userLi").show();
	$("#agent1Li").hide();
	$("#agent2Li").hide();
		var explorer = window.navigator.userAgent;
	
		if (explorer.indexOf("Chrome") >= 0) {
			$("#feel").hide();
		}
		function refreshCaptcha() {
			$('#captchaImg').hide().attr('src', '<c:url value="/commons/jcaptcha.jpg"/>?' + Math.floor(Math.random() * 100)).fadeIn();
		}
	</script>
		<!-- 尾部公共部分 -->
	<jsp:include page="../base/foot.jsp"></jsp:include>
	