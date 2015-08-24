<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib 
 	uri="http://java.sun.com/jsp/jstl/core" 
 	prefix="c" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<table border="1">


<tr>
	<td>Código</td>
	<td>Nome</td>
	<td>Excluir</td>
	<td>Editar</td>
</tr>
<c:forEach var='medico' items='${listaDePessoas}'>
<tr>
	<td>${medico.codigo}</td>
	<td>${medico.nome}</td>
	
<td>
<a href="<c:url value='/medico/excluir/${medico.codigo}'/>" > 
Excluir
</a>
</td>


<td>
<a href="<c:url value='/medico/editar/${medico.codigo}'/>" > 
Editar
</a>


</td>

</tr>
</c:forEach>
</table>


</body>
</html>