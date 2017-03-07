<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<style>
.error-main {
    padding-left: 100px;
	padding-top: 140px;
	
}

.error-icon {
	width: 300px;
	height: 300px;
	padding-left: 200px;
	float: left;
	text-align: center;
}

.error-info {
	height: 300px;
	float: left;
	text-align: left;
	margin-top: 50px;
}

.error-code {
padding-left: 200px;
	font-size: 56px;
	color: #8DBECB;
}

.error-message {
	font-size: 38px;
	color: #A2A2A2;
}
</style>
<html>
<body>
<%-- <%@ include file="/commons/head.jsp"%></body> --%>
<%-- <%@ include file="/commons/top.jsp"%></body> --%>
<div class="page-content" style="margin-top:500px;"> 
			<div class="error-main">
				<div class="error-icon">
					<img src="${pageContext.request.contextPath}/scripts/images/500.png">
				</div>
				<div class="error-info">
					<div class="error-code">500 ERROR</div>
					<a href="javascript:history.go(-1);"><div class="error-code" style="font-size: 18px;">&nbsp;&nbsp;《《返回</div></a>
				</div>
			</div>
	</div>
</body>
</html>