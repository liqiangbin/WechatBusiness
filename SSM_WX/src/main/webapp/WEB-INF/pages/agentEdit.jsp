<%@ page contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../base/base.jsp"></jsp:include>

	<body class="page-container-bg-solid page-sidebar-closed-hide-logo page-header-fixed ">
		
		<!-- -修改密码，用户信息 -->
		<jsp:include page="../base/bodycomm.jsp"></jsp:include>
	
		<!-- END HEADER -->
		<div class="clearfix"></div>
		<!-- BEGIN CONTAINER -->
		<div class="page-container">
			<jsp:include page="../base/left.jsp"></jsp:include>
			<!-- BEGIN SIDEBAR -->
			<div class="page-sidebar-wrapper">
				<div class="page-sidebar navbar-collapse collapse">
					<!-- BEGIN SIDEBAR MENU -->
					<ul class="page-sidebar-menu page-sidebar-menu-hover-submenu " data-keep-expanded="false" data-auto-scroll="true" data-slide-speed="200">
						<li class="start active ">
							<a href="index.html">
								<i class="icon-home"></i>
								<span class="title">客户管理</span>
								<span class="selected"></span>
							</a>
						</li>
						<li>
							<a href="dailishangoperation.html">
								<i class="fa fa-list-ul"></i>
								<span class="title">代理商查询</span>
								<span class="arrow"></span>
							</a>
						</li>
				
					</ul>
					<!-- END SIDEBAR MENU -->
				</div>
			</div>
			<!-- END SIDEBAR -->
			<!-- BEGIN CONTENT -->
			<div class="page-content-wrapper">
				<div class="page-content">
					<!-- BEGIN PAGE HEADER-->
					<h3 class="page-title">库户入住</h3>
					<div class="page-bar">
						<ul class="page-breadcrumb">
							<li class="active">
								<i class="fa fa-home"></i>
								<a href="index.html">MSC首页</a>
								<i class="fa fa-angle-right"></i>
							</li>
							<li>
								<a href="javascript:void(0)">库户入住</a>
								<i class="fa fa-angle-right"></i>
							</li>
							<li>
								<a href="#">代理商修改</a>
							</li>
						</ul>
					</div>
					<!-- END PAGE HEADER-->
					<!-- BEGIN PAGE CONTENT-->
					<div class="row">
						<div class="col-md-12">
							 <form id="formagent" class="form-horizontal form-row-seperated" action="${pageContext.request.contextPath}/agent/agentEdit.html">
								<input type="hidden" name="level" value="1">
								<div class="portlet light">
									<div class="portlet-body">
										<div class="table-responsive">
										<table class="table table-bordered table_sxcondition">			
											<tr>										
												<th width="25%">用户姓名：</th>
												<td width="75%"><input type="text" id="name" name="name" class="form-control input-large" value="${agent.name }" required="true" ></td>					
											</tr>
											<tr>										
												<th width="25%">微信号：</th>
												<td width="75%"><input type="text" id="weixin" name="weixin" class="form-control input-large" value="${agent.weixin }" required="true" ></td>					
											</tr>	
											<tr>										
												<th width="25%">电话：</th>
												<td width="75%"><input type="text" id="tel"  name="tel" class="form-control input-large" value="${agent.tel }" required="true" ></td>					
											</tr>	
											<tr>										
												<th width="25%">推荐人微信：</th>
												<td width="75%"><input type="text" id="refereeWeixin" name="refereeWeixin" class="form-control input-large" required="true"  value="${agent.refereeWeixin }"></td>					
											</tr>
											<tr>										
												<th width="25%">直属团队领导：</th>
												<td width="75%">
													<select class="bs-select form-control input-large" id="leaderid1"  name="leaderid1" required="true">
														<option value="">---请选择---</option>
														<c:forEach items="${list }" var="leader">
															<option value="${leader.id }">${leader.name }</option>
														</c:forEach>												
													</select>  
												</td>					
											</tr>	
											<tr>										
												<th width="25%">团队领导：</th>
												<td width="75%">
													<select class="bs-select form-control input-large" id="leaderid2" name="leaderid2" required="true">
														<option value="">---请选择---</option>
														<c:forEach items="${list }" var="leader">
															<option value="${leader.id }">${leader.name }</option>
														</c:forEach>													
													</select>  
												</td>					
											</tr>	
											<tr>										
												<th width="25%">代理商类型：</th>
												<td width="75%">
													<select class="bs-select form-control input-large" id="type" name="type" required="true">
														<option value="">---请选择---</option>
														<option value="0">精英代理商</option>
														<option value="1">经理代理商</option>													
													</select>  
												</td>					
											</tr>	
											<tr>
												<th>&nbsp;</th>											
												<td>
													<button type="button" onclick="window.history.back()" class="btn default"><i class="fa fa-reply"></i>后退</button>
													<button type="submit" class="btn btn-primary"><i class="fa fa fa-check"></i> 提交</button>
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

	<!-- 尾部公共部分 -->
	<jsp:include page="../base/foot.jsp"></jsp:include>
<script type="text/javascript">

	$(document).ready(function(){
		var leaderid1="${agent.leaderid1}";
		$("#leaderid1").children().each(function(){
			var val=$(this).attr("value");
			if(val==leaderid1){
				$(this).attr("selected", "selected");
			}
		});
		
		var leaderid2="${agent.leaderid2}";
		$("#leaderid2").children().each(function(){
			var val=$(this).attr("value");
			if(val==leaderid2){
				$(this).attr("selected", "selected");
			}
		});
		
		var type="${agent.type}";
		$("#type").children().each(function(){
			$(this).removeAttr("selected");
		}).eq(type).attr("selected","selected");
	});

</script>
	
