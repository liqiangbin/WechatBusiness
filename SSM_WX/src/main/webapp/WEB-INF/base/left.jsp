<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="page-sidebar-wrapper">
				<div class="page-sidebar navbar-collapse collapse">
					<!-- BEGIN SIDEBAR MENU -->
					<ul class="page-sidebar-menu page-sidebar-menu-hover-submenu " data-keep-expanded="false" data-auto-scroll="true" data-slide-speed="200">
						<c:if test="${ sessionScope.manager!=null }">
						<li class="start active ">
							<a href="${pageContext.request.contextPath}/order/tradeQueryParams.html">
								<i class="icon-home"></i>
								<span class="title">首页</span>
								<span class="selected"></span>
							</a>
						</li>
						<li>
							<a href="${pageContext.request.contextPath}/agent/agentList.html">
								<i class="fa fa-users"></i>
								<span class="title">代理信息查询</span>
								<span class="arrow"></span>
							</a>
						</li>
						<li>
							<a href="${pageContext.request.contextPath}/order/tradeQueryParams.html">
								<i class="fa fa-line-chart"></i>
								<span class="title">交易统计</span>
								<span class="arrow"></span>
							</a>
						</li>
						<li>
							<a href="javascript:void(0);">
								<i class="fa fa-gift"></i>
								<span class="title">业务套餐管理</span>
								<span class="arrow"></span>
							</a>
							<ul class="sub-menu">
						<li><a
							href="${pageContext.request.contextPath}/business/businessList.html">
								<i class="fa fa-user"></i> 业务管理
						</a></li>
						<li><a
							href="${pageContext.request.contextPath}/package_/tancanList.html">
								<i class="fa fa-user"></i> 套餐管理
						</a></li>
						</ul>
						</li>
					<li>
							<a href="${pageContext.request.contextPath}/leader/leaderList.html">
								<i class="fa fa-user"></i>
								<span class="title">领导管理</span>
								<span class="arrow"></span>
							</a>
						</li>
											<li>
							<a href="${pageContext.request.contextPath}/user/passwordEdit.html">
								<i class="icon-lock"></i>
								<span class="title">密码修改</span>
								<span class="arrow"></span>
							</a>
						</li>
						</c:if>
						<c:if test="${ sessionScope.manager ==null }">
                  <li>
                    <a href="#">
					<i class="fa fa-plus"></i> <span class="title">客户入驻</span> <span
					class="arrow"></span>
					</a>
					<ul class="sub-menu">
						<li id="userLi"><a
							href="${pageContext.request.contextPath}/user/toUserAdd.html">
								<i class="fa fa-user"></i> 客户信息录入
						</a></li>
						<li id="agent1Li"><a
							href="${pageContext.request.contextPath}/agent/agent1.html">
								<i class="fa fa-users"></i> 一级代理商信息录入
						</a></li>
						<li id="agent2Li"><a href="${pageContext.request.contextPath}/agent/agent2.html">
								<i class="fa fa-users"></i> 二级代理商信息录入
						</a></li>
					</ul>
		           </li>
		           </c:if>
		</ul>
		<!-- END SIDEBAR MENU -->
	</div>
</div>