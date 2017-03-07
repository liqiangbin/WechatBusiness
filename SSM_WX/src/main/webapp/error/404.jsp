<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
<meta charset="utf-8"/>
<title>优客服务平台</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1.0" name="viewport"/>
<meta http-equiv="Content-type" content="text/html; charset=utf-8">
<meta content="MSC是商酷服务的客户服务平台，它是商酷服务的综合平台，也是客户使用最多的平台。" name="description">
<meta content="酷云-技术研发团队" name="author">
<!-- BEGIN PACE PLUGIN FILES -->

<script src='<c:url value="/assets/global/plugins/pace/pace.min.js"></c:url>' type="text/javascript"></script>
<link href='<c:url value="/assets/global/plugins/pace/themes/pace-theme-flash.css"></c:url>' rel="stylesheet" type="text/css"/>
<!-- END PACE PLUGIN FILES -->
<!-- BEGIN GLOBAL MANDATORY STYLES -->
<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css">
<link href='<c:url value="/assets/global/plugins/font-awesome/css/font-awesome.min.css"></c:url>' rel="stylesheet" type="text/css">
<link href='<c:url value="/assets/global/plugins/simple-line-icons/simple-line-icons.min.css"></c:url>' rel="stylesheet" type="text/css">
<link href='<c:url value="/assets/global/plugins/bootstrap/css/bootstrap.min.css"></c:url>' rel="stylesheet" type="text/css">
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN PAGE LEVEL STYLES -->
<link href='<c:url value="/assets/admin/pages/css/error.css"></c:url>' rel="stylesheet" type="text/css"/>
<!-- END PAGE LEVEL STYLES -->
<!-- BEGIN THEME STYLES -->
<link href='<c:url value="/assets/global/css/components.css"></c:url>' id="style_components" rel="stylesheet" type="text/css"/>
<link href='<c:url value="/assets/global/css/plugins.css"></c:url>' rel="stylesheet" type="text/css"/>
<link href='<c:url value="/assets/admin/layout2/css/layout.css"></c:url>' rel="stylesheet" type="text/css"/>
<link id="style_color" href='<c:url value="/assets/admin/layout2/css/themes/grey.css"></c:url>' rel="stylesheet" type="text/css"/>
<link href='<c:url value="/assets/admin/layout2/css/custom.css"></c:url>' rel="stylesheet" type="text/css"/>
<!-- END THEME STYLES -->
<link rel="shortcut icon" href="favicon.ico"/>
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="page-container-bg-solid page-sidebar-closed-hide-logo page-header-fixed ">
<!-- BEGIN HEADER -->
<div class="page-header navbar navbar-fixed-top">
	<!-- BEGIN HEADER INNER -->
	<div class="page-header-inner">
		<!-- BEGIN LOGO -->
		<div class="page-logo">
			<a href="javascript:history.go(-1);">
				<img src="${pageContext.request.contextPath}/assets/admin/layout2/img/logo.png" alt="logo" class="logo-default"/>
			</a>
			<div class="menu-toggler sidebar-toggler"></div>
		</div>
		<!-- END LOGO -->
		<!-- BEGIN RESPONSIVE MENU TOGGLER -->
		<a href="javascript:void(-1);" class="menu-toggler responsive-toggler" data-toggle="collapse" data-target=".navbar-collapse"></a>
		<!-- END RESPONSIVE MENU TOGGLER -->
		<!-- BEGIN PAGE ACTIONS -->	
		<a href="javascripts:void(-1);">	
		<div class="page-actions page-actions-cn"></div>
		</a>
		<!-- END PAGE ACTIONS -->
		<!-- BEGIN PAGE TOP -->
		<div class="page-top">			
			<!-- BEGIN TOP NAVIGATION MENU -->
			<div class="top-menu">
				
			</div>
			<!-- END TOP NAVIGATION MENU -->
		</div>
		<!-- END PAGE TOP -->
	</div>
	<!-- END HEADER INNER -->
</div>
<!-- END HEADER -->
<div class="clearfix"></div>
<!-- BEGIN CONTAINER -->
<div class="page-content">		
    <!-- BEGIN CONTENT -->		
    <div class="container" style="margin-top:68px;">	
        <!-- BEGIN PAGE 404 -->
        <div class="row">
            <div class="col-md-12 page-404">
                <div class="number">404</div>
                <div class="details">
                    <h3>糟糕，您输入的网址无法访问</h3>
                    <p>请几分钟后刷新页面。</p>
                    <p><i class="fa fa-home"></i>&nbsp;&nbsp;<a href="javascript:history.go(-1);">返回</a></p>						
                </div>
            </div>
        </div>
        <!-- END PAGE 404 -->
    </div>		
    <!-- END CONTENT -->		
</div>
<!-- END CONTAINER -->
<%-- <%@ include file="/commons/foot.jsp"%> --%>
<!-- BEGIN SCROLL-TO -->
<div class="scroll-to-top">
	<i class="icon-arrow-up"></i>
</div>

<link href='<c:url value="/assets/admin/layout2/css/custom.css"></c:url>' rel="stylesheet" type="text/css"/>
<script src='<c:url value="/assets/global/plugins/jquery.min.js"></c:url>' type="text/javascript"></script>
<script src='<c:url value="/assets/global/plugins/jquery-migrate.min.js"></c:url>' type="text/javascript"></script>
<script src='<c:url value="/assets/global/plugins/jquery-ui/jquery-ui.min.js"></c:url>' type="text/javascript"></script>
<script src='<c:url value="/assets/global/plugins/bootstrap/js/bootstrap.min.js"></c:url>' type="text/javascript"></script>
<script src='<c:url value="/assets/global/plugins/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js"></c:url>' type="text/javascript"></script>
<script src='<c:url value="/assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js"></c:url>' type="text/javascript"></script>
<script src='<c:url value="/assets/global/plugins/jquery.blockui.min.js"></c:url>' type="text/javascript"></script>
<!-- END CORE PLUGINS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script src='<c:url value="/assets/global/scripts/metronic.js"></c:url>' type="text/javascript"></script>
<script src='<c:url value="/assets/admin/layout2/scripts/layout.js"></c:url>' type="text/javascript"></script>
<script src='<c:url value="/assets/admin/pages/scripts/lanswitch.js"></c:url>' type="text/javascript"></script>
<!-- END PAGE LEVEL SCRIPTS -->
<script>
    jQuery(document).ready(function() {    
        Metronic.init(); // init metronic core components
		Layout.init(); // init current layout				
    });
    </script>
<!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>