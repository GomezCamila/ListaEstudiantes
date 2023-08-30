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
<title>VISTA</title>
<!-- BOOTSTRAP  -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<!-- cambiar para que coincida con Tu archivo/estructura de nombres -->
<link rel="stylesheet" href="/css/main.css">
<script type="text/javascript" src="/js/app.js"></script>

</head>
<body>
<br>
	<br>
	<div class="container mt-4 border rounded-lg p-4 mt-4 bg-success p-2 text-dark bg-opacity-50">
		<h1 class="mb-4 text-center display-3 text-white">Bienvenidos a la Lista de Estudiantes</h1>
		<div class="mb-5 text-center">
			<a href="/students/new" class="btn btn-dark">Agrega una nuevo estudiante</a>
			<a href="/contact/new" class="btn btn-dark">Agrega una nueva informacion de contacto</a>
		</div>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Name</th>
					<th>Age</th>
					<th>Address</th>
					<th>City</th>
					<th>State</th>
				</tr>
			</thead>
			
			<tbody>
				<c:forEach items="${todos}" var="estudiante">
					<tr>
						<td>${estudiante.firstName} ${estudiante.lastName}</td>
						<td>${estudiante.age}</td>
						<td>${estudiante.getContactoModel().getAddress()}</td>
						<td>${estudiante.getContactoModel().getCity()}</td>
						<td>${estudiante.getContactoModel().getState()}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>