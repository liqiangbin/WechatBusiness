<%@ page contentType="text/html;charset=utf-8" %>
<jsp:include page="../base/base.jsp"></jsp:include>

	<body class="page-container-bg-solid page-sidebar-closed-hide-logo page-header-fixed ">
		<!-- -修改密码，用户信息 -->
		<jsp:include page="../base/bodycomm.jsp"></jsp:include>
		
		<div class="clearfix"></div>
		<!-- BEGIN CONTAINER -->
		<div class="page-container">
			<jsp:include page="../base/left.jsp"></jsp:include>
			<!-- BEGIN CONTENT -->
			<div class="page-content-wrapper">
<div class="page-content" style="min-height:801px">	
	<!-- BEGIN PAGE HEADER-->
	<h3 class="page-title">领导管理</h3>
	<div class="page-bar">
		<ul class="page-breadcrumb">
			<li>
				<i class="fa fa-home"></i>
				<a href="/msc/main/index.do">
					首页</a>
					<i class="fa fa-angle-right"></i>
				</li>
				<li>
					<a href="javascript:void(0);" onclick="turnTo('/coupon/cashcoupon')">领导管理</a>   
					<i class="fa fa-angle-right"></i>         			
				</li>
				<li class="active">
					<a href="javascript:void(0);">添加领导</a>  		
				</li>

			</ul>
	</div>
	<!-- END PAGE HEADER-->
	<!-- BEGIN PAGE CONTENT-->
	<div class="row">
		<div class="col-md-12">
			<div class="portlet light">
				<div class="portlet-title">
					<div class="caption">
						<i class="fa fa-stumbleupon-circle font-green-sharp"></i>
						<span class="caption-subject font-green-sharp bold">领导添加</span>										
					</div>	
				</div>
				<div class="portlet-body">
					<div class="table-responsive">
						<form class="form-horizontal form-row-seperated form-inline" action="${pageContext.request.contextPath}/leader/leaderAdd.html" method="post" id="businessForm" novalidate="novalidate">
							<!-- <input type="hidden" name="genType" value=""/> -->
							<table class="table table-bordered table_sxcondition ">
								<tbody>
								<tr>
									<th width="25%">领导姓名：<label style="color:red;">&nbsp;*&nbsp;</label></th>
									<td width="75%" class="lineheight34">
										<input  id="name" name="name" type="text" class="form-control input-large-plus" value="" required="true"  autofocus="">
									</td>
								</tr>
								<tr>
									<th width="25%">电话：<label style="color:red;">&nbsp;*&nbsp;</label></th>
									<td width="75%" class="lineheight34">
										<input  id="tel" name="tel" type="text" class="form-control input-large-plus" value="" required="true"  autofocus="">
									</td>
								</tr>
								<tr>
									<th width="25%">领导所属部门：<label style="color:red;">&nbsp;*&nbsp;</label></th>
									<td width="75%" class="lineheight34">
										<input  id="department" name="department" type="text" class="form-control input-large-plus" value=""  autofocus="">
									</td>
								</tr>
								<tr>
									<th></th>
									<td>
										<button type="button" onclick="window.history.back()" class="btn default"><i class="fa fa-angle-left"></i>  后退</button>
										<button type="submit" id="submitBtn" class="btn btn-primary"><i class="fa fa-save"></i>  保存</button>
									</td>
								</tr>
							</tbody></table>
						</form>
					</div>		
				</div>						
			</div>
		</div>
	</div>
		<!-- 尾部公共部分 -->
	<jsp:include page="../base/foot.jsp"></jsp:include>
	<script type="text/javascript">
	$("#businessForm").validate(
					{
						errorClass : "notice",
						rules : {
							name : {
								required : true,
							},
							tel:{
								required : true,
							}
						},
						messages : {
							name : {
								required : "名称不能为空"
							},
						tel:{
							required : "电话不能为空"
						}
						},
						focusInvalid : true,
					});
</script>
