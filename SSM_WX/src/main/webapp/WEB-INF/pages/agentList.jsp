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
		<!-- BEGIN CONTENT -->
		<div class="page-content-wrapper">
			<div class="page-content">
				<!-- BEGIN PAGE HEADER-->
				<h3 class="page-title">客户管理</h3>
				<div class="page-bar">
					<ul class="page-breadcrumb">
						<li class="active">
							<i class="fa fa-home"></i>
							<a href="index.html">首页</a>
							<i class="fa fa-angle-right"></i>
						</li>
						<li>
							<a href="javascript:void(0)">代理商查询</a>
							<i class="fa fa-angle-right"></i>
						</li>
						<li>
							<a href="#">代理商查询</a>
						</li>
					</ul>
				</div>
				<!-- END PAGE HEADER-->
				<!-- BEGIN PAGE CONTENT-->
				<div class="row">
					<div class="col-md-12">
						<div class="portlet light">
							<div class="portlet-body">
								<div class="table-responsive">
									<form class="form-horizontal form-row-seperated" action="${pageContext.request.contextPath}/agent/query.html">
										<table class="table table-bordered table_sxcondition">
											<tr>
												<th width="13%">代理商姓名：</th>
												<td width="20%">
													<input type="text" class="form-control input-large" name="name" id="name" autofocus value="${name }">
												</td>
												<th width="13%">微信号：</th>
												<td width="20%">
													<input type="text" class="form-control input-large" name="weixin" id="weixin" autofocus value="${weixin }">
												</td>
												<th width="13%">代理商级别：</th>
												<td width="20%">
													<select class="bs-select form-control input-large" name="level" id="level">
														<option value="0">----全部----</option> 
														<option value="1">精英代理商</option>
														<option value="2">经理代理商</option>
													</select>
												</td>
											</tr>
											<tr>
												<td colspan="6" style="text-align:center;"><button type="button" onclick="onReset()" class="btn default"><i class="fa fa-reply"></i> 重置</button>&nbsp;&nbsp;&nbsp;&nbsp;
													&nbsp;&nbsp;&nbsp;&nbsp;<button type="submit" class="btn btn-primary"><i class="fa fa-search"></i> 查询</button></td>
												</tr>
											</table>
										</form>
									</div>
									<div class="table-container">
										<ul class="list-inline summary">
											<li>所有代理人数：<span class="highlight">${total }&nbsp;人</span></li><!-- 总交易笔数 -->
										</ul>
										<table class="table table-striped table-bordered table-hover"
										id="datatable_products">
										<thead>
											<tr class="heading">
												<th width="10%">姓名</th>
												<th width="15%">微信号</th>
												<th width="15%">属于哪一类</th>
												<th width="10">子代理数量</th>
												<th width="10%">客户成交量</th>
												<th width="10">直属领导</th>
												<th width="10%">团队领导</th>
												<th width="20%">操作</th> 
											</tr>
										</thead>
										<tbody>
											<c:forEach items="${pageBean.rows }" var="agent">
											<tr role="row" class="filter">
												<td>${agent.name }</td>
												<td>${agent.weixin }</td>
												<td >
													<c:if test="${agent.type==1 }">
													<label style="color: blue;">
													精英代理商
													</label>
													</c:if>
													<c:if test="${agent.type==2 }">
													<label style="color: green;">
													经理代理商
													</label></c:if>
												</td>
												<td>
													<c:if test="${agent.type==1 }">无</c:if>
													<c:if test="${agent.type==2 }">${agent.countSubAgents} 人</c:if>
												</td>
												<td>${agent.countUser}&nbsp;单</td>
												
												<td>
												${agent.leaderid1}
										</td>
										<td>
											<c:forEach items="${leaderList}" var="item">
											<c:if test="${item.id==agent.leaderid2}">
											${item.name}
										</c:if>
									</c:forEach>  
								</td>
								
								<td>
									<c:if test="${agent.type==2 }">
									<a class="btn btn-circle btn-icon-only btn-default tooltips" href="${pageContext.request.contextPath}/agent/agent1Detial.html?weixin=${agent.weixin }" data-toggle="tooltip" data-placement="bottom" data-html="true" data-original-title="查看子代理商详情")">
										<span class="fa fa-male"></span>
									</a>
								</c:if>
								<a class="btn btn-circle btn-icon-only btn-default tooltips" href="${pageContext.request.contextPath}/user/userList.html?agentId=${agent.id }" data-toggle="tooltip" data-placement="bottom" data-html="true" data-original-title="查看客户详情")">
									<span class="fa fa-users"></span>
								</a>
								<a class="btn btn-circle btn-icon-only btn-default tooltips" href="${pageContext.request.contextPath}/agent/toEdit.html?id=${agent.id}" data-toggle="tooltip" data-placement="bottom" data-html="true" data-original-title="编辑")">
									<span class="glyphicon glyphicon-pencil"></span>
								</a>
								<a class="btn btn-circle btn-icon-only btn-default tooltips" href="javascript:void(0);" onclick="javascript:showAlertModel('警告信息', '确认删除？','${pageContext.request.contextPath}/agent/delete.html?id=${agent.id}');" data-toggle="tooltip" data-placement="bottom" data-html="true" data-original-title="删除该用户">
									<i class="icon-trash"></i>
								</a>
								
							</td>
						</tr>
					</c:forEach>
					<jsp:include page="../base/agentPage.jsp"></jsp:include>
				</tbody>
			</table>
		</div>
	</div>					
</div>
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
		var level="${level }";
		if(level==1){
			var ss=$("#level").children().eq(1).attr("selected", "selected");
  			//alert(ss.html());
  		}else if(level==2){
  			$("#level").children().eq(2).attr("selected", "selected");
  		} else{
  			$("#level").children().eq(0).attr("selected", "selected");
  		}
  	});

	function onReset(){
		$("#name").val("");
		$("#weixin").val("");
		//遍历所有的  option元素
		$("#level").children().each(function(){
			$(this).removeAttr("selected");
		}).eq(0).attr("selected","selected");
	}

</script>