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
			<div class="page-content" style="min-height:645px">
				<!-- BEGIN PAGE HEADER-->
				<h3 class="page-title">交易统计</h3>
				<div class="page-bar">
					<ul class="page-breadcrumb">
						<li class="active"><i class="fa fa-home"></i> <a
							href="index.html">首页</a> <i class="fa fa-angle-right"></i></li>

						<li><a href="#">交易统计</a></li>
					</ul>
				</div>
				<!-- END PAGE HEADER-->
				<div class="row">
					<div class="col-md-12">
						<div class="portlet light ">
							<div class="portlet-title" style="min-height:43px;">
								<div class="tabbable-line">
									<ul class="nav nav-tabs ">
										<li class="active"><a href="#tab_1_1" data-toggle="tab">交易查询&nbsp;条件</a>
										</li>
									</ul>
								</div>
							</div>
							<div class="portlet-body">
								<div class="tabbable-line tabs-below">
									<div class="tab-content">
										<div class="tab-pane active" id="tab_1_1">
											<form class="form-horizontal form-row-seperated" action="${pageContext.request.contextPath}/order/tradeQueryParams.html" method="post">
												<div class="table-responsive">
													<table class="table table-bordered table_sxcondition"
														style="margin-bottom:0;">
														<tr>
															<th width="13.3%">起始日期：</th>
															<td width="20%">
																<div class="input-group date form_date input-large">
																	<input type="text" class="form-control" id="startDate"
																		name="startDate"  readonly="true" value='<fmt:formatDate value="${tradeQuery.startDate}"/>' /> <span
																		class="input-group-addon"><span
																		class="glyphicon glyphicon-calendar"></span></span>
																</div>

															</td>
															<th width="13.3%">结束日期：</th>
															<td width="20%">
																<div class="input-group date form_date input-large">
																	<input type="text" class="form-control" id="endDate"
																		name="endDate"  readonly="true" value='<fmt:formatDate value="${tradeQuery.endDate}"/>' /> <span
																		class="input-group-addon"><span
																		class="glyphicon glyphicon-calendar"></span></span>
																</div>
															</td>
															<th width="13.3%">业务类型 :</th>
															<td width="20%"><select
																class="form-control input-large" data-placeholder="全部" id="yewuId" name="yewuId">
																	<option value="0">全部</option>
																	<c:forEach var="business" items="${businessList}"> 
														 <option value="${business.id}" <c:if test="${business.id==tradeQuery.yewuId}">selected='selected'</c:if>>${business.name}</option>
														 </c:forEach>
															</select></td>
														</tr>
														<tr>
															<td colspan="6" style="text-align: center;">
																<button type="reset" class="btn default">
																	<i class="fa fa-close"></i> 重置
																</button>
																<button type="submit" class="btn btn-primary">
																	<i class="fa fa-search"></i> 查询
																</button>
															</td>
														</tr>
													</table>
												</div>
											</form>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- BEGIN 消费成功金额...总入账金额汇总 -->
				<div class="row">
					<div class="col-md-12">
						<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12"
							style="padding-left:0">
							<div class="dashboard-stat blue-soft" href="javascript:;">
								<div class="visual">
									<i class="fa fa-rmb"></i>
								</div>
								<div class="details">
									<div class="number">
										<fmt:formatNumber value="${tradeQuery.money}" pattern="0.00" />
										<span class="desc">&nbsp;米</span>
									</div>
									<div class="desc">${tradeQuery.moneyTitle }</div>
								</div>
								<a class="more" href="#">查看更多<i
									class="m-icon-swapright m-icon-white"></i></a>
							</div>
						</div>
						<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
							<div class="dashboard-stat red-soft" href="javascript:;">
								<div class="visual">
									<i class="fa fa-trophy"></i>
								</div>
								<div class="details">
									<div class="number">
										${tradeQuery.num}<span class="desc">&nbsp;条</span>
									</div>
									<div class="desc">${tradeQuery.numTitle}</div>
								</div>
								<a class="more" href="#">查看更多<i
									class="m-icon-swapright m-icon-white"></i></a>
							</div>
						</div>
						<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
							<div class="dashboard-stat green-soft" href="javascript:;">
								<div class="visual">
									<i class="fa fa-shopping-cart"></i>
								</div>
								<div class="details">
									<div class="number">
									<fmt:formatNumber value="${tradeQuery.totalMoney}" pattern="0.00" />
										<span class="desc">&nbsp;米</span>  </span>
									</div>
									<div class="desc">总交易金额</div>
								</div>
								<a class="more" href="transstatistic-skfw.html">查看更多<i
									class="m-icon-swapright m-icon-white"></i></a>
							</div>
						</div>
						<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12"
							style="padding-right:0">
							<div class="dashboard-stat purple-soft" href="javascript:;">
								<div class="visual">
									<i class="fa fa-database"></i>
								</div>
								<div class="details">
									<div class="number">
										${tradeQuery.totalNum}<span class="desc">&nbsp;条</span>
									</div>
									<div class="desc">总订单数量</div>
								</div>
								<a class="more" href="transstatistic-skfw.html">查看更多<i
									class="m-icon-swapright m-icon-white"></i></a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- END CONTENT -->
	</div>
	<!-- END CONTAINER -->

	<!-- END CONTAINER -->

	<!-- 尾部公共部分 -->
	<jsp:include page="../base/foot.jsp"></jsp:include>
	<script type="text/javascript">
		$('.form_date').datetimepicker({
			format : 'yyyy-mm-dd',
			language : 'zh_CN',
			autoclose : true,
			viewSelect : 'decade',
			forceParse : 0,
			pickerPosition : 'bottom-left'
		});
	</script>