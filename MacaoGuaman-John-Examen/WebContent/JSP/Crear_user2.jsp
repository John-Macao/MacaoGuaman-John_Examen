<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear Usuario</title>
</head>
<body>


	<header>
        <h1>Crear Usuario</h1>
 
    </header> 


	<c:set var="listaO" scope="request" value="${listaOperadora}" />
	<c:set var="listaT" scope="request" value="${listaTipo}" />
	<c:set var="usuario_id" scope="request" value="${usuario_id}" />
	
	<c:set var="ced" scope="request" value="${ced}" />
	<c:set var="nom" scope="request" value="${nom}" />
	<c:set var="ape" scope="request" value="${ape}" />
	<c:set var="corr" scope="request" value="${corr}" />
	<c:set var="contra" scope="request" value="${contra}" />
	
	
	
	
	
	<c:set var="number" scope="request" value="${number1}" />
	
    
    <form class="form" action="/MacaoGuaman-John-Examen/AgregarUController2" method="post">
    
        <label for="user">Cédula: </label>
        <input type="text" name="cedula" value="${ced}">
        
        <label for="user">Nombre: </label>
        <input type="text" name="nombre" value="${nom}">
        
        <label for="user">Apellido: </label>
        <input type="text" name="apellido" value="${ape}">
        
        <label for="user">Correo: </label>
        <input type="text" name="correo" value="${corr}">
        
        <label for="user">Contraseña : </label>
        <input type="password" name="contrasena" value="${contra}">
        
        <label for="user">Numero Telefónico : </label>
        <input type="text" name="telefono">
        
        
		<select name="item1">
			<option value="- Seleccionar Tipo -" selected>- Seleccionar Tipo -</option>
			<c:forEach items="${listaTipo}" var="id">
       			<option> ${id.tip}</option>
			</c:forEach>
		</select>
		
        <select name="item2">
			<option value="- Seleccionar Operadora -" selected>- Seleccionar Operadora -</option>
			<c:forEach items="${listaOperadora}" var="id">
       			<option> ${id.oper}</option>
			</c:forEach>
		</select>
        
        
        <input type="text" value="${number}"  name="number1" style="display:none">
        <input type="text" value="${usuario_id}"  name="usuario_id" style="display:none">
        
        
        <input type="submit" value="Añadir Telefono ">
    </form>
    
    
    <h3> Teléfonos agregados : ${number}  </h3>
    
    <form class="form" action="/MacaoGuaman-John-Examen/HTML/index.html" method="post">
    
        <input type="submit" value=" Regresar">
    </form>



</body>
</html>