<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<base href="<%=basePath%>">
<title>个人中心</title>
<!-- Modal插件 -->
<link rel="stylesheet"
	href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js">
</script>
<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js">
</script>
<!--dataTables css-->
<link href="<%=basePath%>static/css/bootstrap.min.css" rel="stylesheet" />
<link href="<%=basePath%>static/css/dataTables.bootstrap.css"
	rel="stylesheet" />
<!--css-->
<link href="<%=basePath%>static/css/index.css" rel="stylesheet" />
<!--dataTables js-->
<script src="<%=basePath%>static/js/jquery-1.10.2.min.js">
</script>
<script src="<%=basePath%>static/js/jquery.dataTables.min.js">
</script>
<script src="<%=basePath%>static/js/dataTables.bootstrap.js">
</script>
<!-- js-->
<script src="<%=basePath%>static/js/index.js">
</script>
</head>
<body>