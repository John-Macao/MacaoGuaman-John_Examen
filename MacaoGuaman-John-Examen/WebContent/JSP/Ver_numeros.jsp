<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de Numeros</title>
</head>
<body>

	<c:set var="listaT" scope="request" value="${listaTelefonos2}" />
	
	<table class="table">
		<tr>
			<td class="titulo"><strong>Teléfono </strong></td>
			<td class="titulo"><strong>Tipo </strong></td>
			<td class="titulo"><strong>Operadora</strong></td>
			
		</tr>
		<c:forEach var="t" items="${listaTelefonos2}">
			<tr>
				<td>${t.tel}</td>
				<td>${t.tipo.getTip()}</td>
				<td>${t.operadora.getOper()}</td>
			</tr>
		</c:forEach>
	
	
	</table>
	
	
	<form class="form" action="/MacaoGuaman-John-Examen/ListadoGeneral" method="post">
    
        <input type="submit" value=" Regresar">
    </form>
	




</body>
</html>