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
			<div class="page-content-wrapper">
				<div class="page-content" style="min-height:645px">
					<!-- BEGIN PAGE HEADER-->
					<h3 class="page-title">套餐管理</h3>
					<div class="page-bar">
						<ul class="page-breadcrumb">
							<li class="active">
								<i class="fa fa-home"></i>
								<a href="index.html">首页</a>
								<i class="fa fa-angle-right"></i>
							</li>
							<li>
								<a href="#">套餐管理</a>
							</li>
						</ul>
					</div>
					<!-- END PAGE HEADER-->
					<!-- BEGIN PAGE CONTENT-->
					<div class="row">
						<div class="col-md-12">
							<form class="form-horizontal form-row-seperated" action="#">
								<div class="portlet light">
									<div class="portlet-title">
										<div class="caption">
											<i class="fa fa-search font-green-sharp"></i>
											<span class="caption-subject font-green-sharp bold">查询列表</span>
										</div>
										<div class="actions form-inline">
											<a href="${pageContext.request.contextPath}/package_/toAdd.html" class="btn btn-circle btn-primary margin-left5" onclick="javascript:;">
												<i class="fa fa-plus"></i>
												<span class="hidden-480">添加套餐</span>
											</a>
										</div>
									</div>
									<div class="portlet-body">
										<div class="table-container">
											<div id="datatable_products_wrapper" class="dataTables_wrapper dataTables_extended_wrapper no-footer">
												<div class="table-scrollable">
													<table class="table table-striped table-bordered table-hover dataTable no-footer" id="datatable_products" aria-describedby="datatable_products_info" role="grid">
														<thead>
															<tr role="row" class="heading">
																<th width="30%" class="sorting_disabled" rowspan="1" colspan="1">套餐名称</th>
																<th width="25%" class="sorting" tabindex="0" aria-controls="datatable_products" rowspan="1" colspan="1">套餐价格</th>
																<th width="25%" class="sorting" tabindex="0" aria-controls="datatable_products" rowspan="1" colspan="1">套餐类型</th>
																<th width="20%" class="sorting" tabindex="0" aria-controls="datatable_products" rowspan="1" colspan="1">操作</th>
															</tr>
														</thead>
														<tbody>
														<c:forEach items="${pageBean.rows }" var="item">
															<tr role="row" class="filter">
																<td>${item.name }</td>
																<td>${item.price }</td>
																<td>
															<c:forEach var="business" items="${businessList}" varStatus="status" > 
														 <c:if test="${item.type==business.id }">${business.name}</c:if>
														 </c:forEach>
																</td>
																<td>
																	<a class="btn btn-circle btn-icon-only btn-default tooltips" href="${pageContext.request.contextPath}/package_/taocanEdit.html?id=${item.id}" data-toggle="tooltip" data-placement="bottom" data-html="true" data-original-title="修改套餐">
																		<i class="icon-pencil"></i>
																	</a>
																	<a class="btn btn-circle btn-icon-only btn-default tooltips" href="javascript:void(0);" onclick="javascript:showAlertModel('警告信息', '确认删除？','${pageContext.request.contextPath}/package_/delete.html?id=${item.id}');" data-toggle="tooltip" data-placement="bottom" data-html="true" data-original-title="删除套餐">
																		<i class="icon-trash"></i>
																	</a>
																</td>
															</tr>
															</c:forEach>
															<jsp:include page="../base/page.jsp"></jsp:include>
														</tbody>
													</table>
												</div>
											</div>
										</div>
									</div>
								</div>
							</form>
						</div>
					</div>
					<!-- END PAGE CONTENT-->
				</div>
			</div>
			<!-- END CONTAINER -->

	<!-- 尾部公共部分 -->
	<jsp:include page="../base/foot.jsp"></jsp:include>