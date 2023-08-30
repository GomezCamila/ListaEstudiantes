<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Formateo fechas (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- Formulario form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- para errores de renderizado en rutas PUT -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AQUI EL TITULO DE TU PLNATILLA</title>
<!-- BOOTSTRAP  -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<!-- cambiar para que coincida con Tu archivo/estructura de nombres -->
<link rel="stylesheet" href="/css/main.css">
<script type="text/javascript" src="/js/app.js"></script>

</head>
<body>
<div
		class="container p-5 border rounded-lg p-4 mt-4 bg-success p-2 text-dark bg-opacity-10">
		<div class="row justify-content-center">
			<div class="col-md-6">
				<h2 class="text-center display-3">New Student</h2>
				<form:form action="/students/new" method="POST"
					modelAttribute="estudiante">
					<div class="form-group">
						<form:label class="form-label" path="firstName">First Name:</form:label>
						<form:errors class="text-danger" path="firstName" />
						<form:input class="form-control" path="firstName" />
					</div>
					<div class="form-group">
						<form:label class="form-label" path="lastName">Last Name:</form:label>
						<form:errors class="text-danger" path="lastName" />
						<form:input class="form-control" path="lastName" />
					</div>
					<div class="form-group">
						<form:label class="form-label" path="age">Age:</form:label>
						<form:errors class="text-danger" path="age" />
						<form:input class="form-control" path="age" />
					</div>
					<div class="text-center">
						<button class="btn btn-dark m-3"  >Create</button>
					</div>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>