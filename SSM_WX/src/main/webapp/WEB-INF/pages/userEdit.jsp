<%@ page contentType="text/html;charset=utf-8" %>
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
					<h3 class="page-title">客户管理</h3>
					<div class="page-bar">
						<ul class="page-breadcrumb">
							<li class="active">
								<i class="fa fa-home"></i>
								<a href="index.html">MSC首页</a>
								<i class="fa fa-angle-right"></i>
							</li>
							<li>
								<a href="javascript:void(0)">客户管理</a>
								<i class="fa fa-angle-right"></i>
							</li>
							<li>
								<a href="#">客户添加</a>
							</li>
						</ul>
					</div>
					<!-- END PAGE HEADER-->
					<!-- BEGIN PAGE CONTENT-->
					<div class="row">
						<div class="col-md-12">
							 <form class="form-horizontal form-row-seperated" action="#">
								<div class="portlet light">
									<div class="portlet-body">
										<div class="table-responsive">
										<table class="table table-bordered table_sxcondition">			
											<tr>										
												<th width="25%">登录名：</th>
												<td width="75%"><input type="text" class="form-control input-large" value="" autofocus></td>	
											</tr>
											<tr>										
												<th width="25%">密码：</th>
												<td width="75%"><input type="password" class="form-control input-large" value=""></td>
											</tr>
											<tr>										
												<th width="25%">再次输入密码：</th>
												<td width="75%"><input type="password" class="form-control input-large" value=""></td>			
											</tr>
											<tr>										
												<th width="25%">用户姓名：</th>
												<td width="75%"><input type="text" class="form-control input-large" value=""></td>					
											</tr>	
											<tr>										
												<th width="25%">状态：</th>
												<td width="75%">
													<select class="bs-select form-control input-large" required="true" data-placeholder="正常">
														<option value="正常">正常</option>
														<option value="停用">停用</option>													
													</select>  
												</td>						
											</tr>	
											<tr>										
												<th width="25%">后台角色：</th>
												<td width="75%">
													<select class="bs-select form-control input-large" required="true" data-placeholder="主管">
														<option value="主管">主管</option>
														<option value="收银员">收银员</option>													
														<option value="非收银员">非收银员</option>	
														<option value="撤销专员">撤销专员</option>	
													</select>  
												</td>						
											</tr>				
											<tr>
												<th>&nbsp;</th>											
												<td>
													<button type="button" onclick="window.history.back()" class="btn default"><i class="fa fa-reply"></i> 后退</button>
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
		function onSubmit() {
			if ($.trim($("#name").val()) == "") {
				$('.alert-none').addClass("login-alert");
				$('.login-alert').text("用户名不能为空");
				//document.getElementById("j_username") = "";
				$("#error-info").show();
				return false;
			}
			if ($.trim($("#weixin").val()) == "") {
				$('.alert-none').addClass("login-alert");
				$('.login-alert').text("微信号不能为空");
				//document.getElementById("j_username") = "";
				$("#error-info").show();
				return false;
			}
			if ($.trim($("#tel").val()) == "") {
				$('.alert-none').addClass("login-alert");
				$('.login-alert').text("电话号码不能为空");
				if (/^1[34578]\d{9}$/.test(tel)) {
					$('.login-alert').text("电话号码不正确！");
				}
				$("#error-info").show();
				return false;
			}
			if ($.trim($("#refereeWeixin").val()) == "") {
				$('.alert-none').addClass("login-alert");
				$('.login-alert').text("推荐人微信号不能为空");
				//document.getElementById("j_username") = "";
				$("#error-info").show();
				return false;
			}
			//TODO: 表单校验
			$("form")[0].submit();
			return true;
		}
	</script>
	<script type="text/javascript">
		var explorer = window.navigator.userAgent;
	
		if (explorer.indexOf("Chrome") >= 0) {
			$("#feel").hide();
		}
		function refreshCaptcha() {
			$('#captchaImg').hide().attr('src', '<c:url value="/commons/jcaptcha.jpg"/>?' + Math.floor(Math.random() * 100)).fadeIn();
		}
	</script>