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

    
    <form class="form" action="/MacaoGuaman-John-Examen/AgregarUController" method="post">
    
        <label for="user">Cédula: </label>
        <input type="text" name="cedula" value="123">
        
        <label for="user">Nombre: </label>
        <input type="text" name="nombre">
        
        <label for="user">Apellido: </label>
        <input type="text" name="apellido">
        
        <label for="user">Correo: </label>
        <input type="text" name="correo">
        
        <label for="user">Contraseña : </label>
        <input type="password" name="contrasena">
        
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
        
        <input type="submit" value="Añadir Telefono ">
    </form>
    
    
    <form class="form" action="/MacaoGuaman-John-Examen/HTML/index.html" method="post">
    
        <input type="submit" value=" Regresar">
    </form>


</body>
</html>