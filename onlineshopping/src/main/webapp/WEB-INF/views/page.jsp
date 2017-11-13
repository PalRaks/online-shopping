<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />
<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Online Shopping - ${title}</title>

<script type="text/javascript">
	window.menu = '${title}';
</script>

<!-- Bootstrap core CSS -->

<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap Cerulean theme CSS -->

<link href="${css}/bootstrap-cerulean-theme.css" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">

<script type="text/javascript"
	src="https://gc.kis.v2.scr.kaspersky-labs.com/F9F69943-4FE7-B542-B927-E7622732A522/main.js"
	charset="UTF-8"></script>
<link rel="stylesheet" crossorigin="anonymous"
	href="https://gc.kis.v2.scr.kaspersky-labs.com/225A2372267E-729B-245B-7EF4-34996F9F/abn/main.css" />
</head>

<body>

	<div class="wrapper">
		<!-- Navigation -->
		<%@include file="./shared/navbar.jsp"%>

		<div class="content">
			<!-- Loading the home Content -->
			<c:if test="${clickHome == true }">
				<%@include file="home.jsp"%>

			</c:if>
			<!-- Loading the about Content -->
			<c:if test="${clickAbout == true }">
				<%@include file="about.jsp"%>

			</c:if>
			<!-- Loading the Contact Content -->
			<c:if test="${clickContact == true }">
				<%@include file="contact.jsp"%>

			</c:if>

			<!-- Loading the View product Content -->
			<c:if test="${clickAllProducts==true or clickCategoryProducts==true}">
				<%@include file="listProducts.jsp"%>
			</c:if>

		</div>
		<!-- Footer -->
		<%@include file="./shared/footer.jsp"%>

		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery.min.js"></script>
		<%-- <script src="vendor/bootstrap/${js}/bootstrap.bundle.min.js"></script> --%>
		<script src="${js}/bootstrap.bundle.min.js"></script>

		<!-- Self coded javascript -->
		<script src="${js}/myapp.js"></script>
	</div>
</body>

</html>
