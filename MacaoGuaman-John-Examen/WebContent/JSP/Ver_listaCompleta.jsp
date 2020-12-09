<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Lista Completa</title>
</head>
<body>



	<c:set var="listaU" scope="request" value="${listaUsuarios}" />
	
	
	<label for="user"> Busquedas </label> <br/>
	
	<form class="form" action="/MacaoGuaman-John-Examen/Filtrado method="post">
        <label for="user"> Por Cédula: </label>
        <input type="text" name="cedula" placeholder="Buscar por cédula">
        
        <label for="user"> Por Teléfono: </label>
        <input type="text" name="telefono" placeholder="Buscar por teléfono">
        
        <input type="submit" value="Buscar ">
    </form>
	
	
	<table class="table">
		<tr>
			<td class="titulo"><strong>Nombres </strong></td>
			<td class="titulo"><strong>Apellidos </strong></td>
			<td class="titulo"><strong>Cédula</strong></td>
			<td class="titulo"><strong>Correo</strong></td>
			
		</tr>
		<c:forEach var="t" items="${listaUsuarios}">
			<tr>
				<td>${t.nombre}</td>
				<td>${t.apellido}</td>
				<td>${t.cedula}</td>
				<td>${t.correo}</td>
				
				<td> <a href="/MacaoGuaman-John-Examen/ListarNumerosController?u_id=${t.id}"   > Ver telefonos</a> </td>
				
			</tr>
		</c:forEach>
	
	
	</table>
	
	
	<form class="form" action="/MacaoGuaman-John-Examen/HTML/index.html" method="post">
    
        <input type="submit" value=" Regresar">
    </form>
	

</body>
</html>