<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="../base/base.jsp"></jsp:include>

<body
	class="page-container-bg-solid page-sidebar-closed-hide-logo page-header-fixed ">

	<!-- -修改密码，用户信息 -->
	<jsp:include page="../base/bodycomm.jsp"></jsp:include>

	<div class="clearfix"></div>
	<!-- BEGIN CONTAINER -->
	<div class="page-container">
		<jsp:include page="../base/left.jsp"></jsp:include>
		<!-- BEGIN CONTENT -->
		<div class="page-content-wrapper">
			<div class="page-content">
				<!-- BEGIN PAGE HEADER-->
				<h3 class="page-title">子代理商列表</h3>
				<div class="page-bar">
					<ul class="page-breadcrumb">
						<li class="active"><i class="fa fa-home"></i> <a
							href="#">首页</a> <i class="fa fa-angle-right"></i></li>
							<li class="active"><a
							href="#">代理商查询</a> <i class="fa fa-angle-right"></i></li>
						<li><a href="#">子代理商列表</a></li>
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
										<i class="fa fa-user font-green-sharp"></i> <span
											class="caption-subject font-green-sharp bold">子代理商列表</span>
									</div>
									<div class="actions btn-set">
							<a class="btn btn-default btn-circle" href="javascript:void(0);" onclick="history.go(-1)">
								<i class="fa fa-angle-left"></i>
								后 退
							</a>

						</div>
								</div>
								<div class="portlet-body">
									<div class="table-responsive">
									</div>
									<div class="table-container">
									
									<ul class="list-inline summary">
						<li>代理商姓名：<span class="highlight">${agent.name }</span></li>
						<li>代理商类别：<span class="highlight">
							<c:if test="${agent.type==1 }">精英代理商</c:if>
							<c:if test="${agent.type==2 }">经理代理商</c:if>
						</span></li>
						<li>共拥子代理商：<span class="highlight">${pageBean.total }&nbsp;人</span></li>
						<li>直属领导：<span class="highlight">	${agent.leaderid1}</span></li>
						<li>团队总领导：
						<c:forEach items="${leaderList}" var="item">
						<c:if test="${item.id==agent.leaderid2}">
						<span class="highlight">
						${item.name}
						</span>
						</c:if>
						</c:forEach>
						</li>
						
					</ul>
										<table class="table table-striped table-bordered table-hover"
											id="datatable_products">
											<thead>
												<tr role="row" class="heading">
													<th width="15%">子代理姓名</th>
													<th width="15%">微信号</th>
													<th width="15%">电话</th>
													<th width="15%">直属领导</th>
													<th width="15%">团队领导</th>
													<th width="20%">加入时间</th>
												</tr>
											</thead>
											<tbody>
											<c:forEach items="${pageBean.rows }" var="item">
												<tr role="row" class="filter">
													<td>${item.name}</td>
													<td>${item.weixin}</td>
													<td>${item.tel}</td>
													<td>
													${agent.leaderid1}
													</td>
														<td>
													<c:forEach items="${leaderList}" var="leader">
					           	                 <c:if test="${leader.id==item.leaderid2}">
						                          ${leader.name}
						                          </c:if>
						                            </c:forEach>
													</td>
													<td><fmt:formatDate value="${item.createtime}"/></td>
												</tr>
												</c:forEach>
												<jsp:include page="../base/page.jsp"></jsp:include>
											</tbody>
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

	<!-- 尾部公共部分 -->
	<jsp:include page="../base/foot.jsp"></jsp:include>