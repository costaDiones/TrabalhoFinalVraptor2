<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib 
 	uri="http://java.sun.com/jsp/jstl/core" 
 	prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastra Consulta</title>
</head>
<body>


<form action="${ linkTo[ConsultaController].salvar }" method="post">


<input type="hidden" name="consulta.codigo" value="${consulta.codigo }" >
<br>
<br>Valor da Consulta
<br><input type="text" name="consulta.valor" value="${consulta.valor}">
<br>
<br>Data da Consulta
<br>
<br><input type="text" name="consulta.data" value="${consulta.data}">


<br>
<br/>Paciente
<br><select name="consulta.paciente.codigo" > 
	<c:forEach items="${listaDePacientes}" var="paciente">
		<option value="${paciente.codigo}">
		${paciente.nome}
		</option>
	</c:forEach>

</select>



<br>
<br/>Médico
<br><select name="consulta.medico.codigo" > 
	<c:forEach items="${listaDeMedico}" var="medico">
		<option value="${medico.codigo }">
		${medico.nome}
		</option>
	</c:forEach>
	</select>
	
	<br>
	
	
<br/>Medicamento
<br><select name="consulta.medicamento.codigo" > 
	<c:forEach items="${listaDeMedicamento}" var="medicamento">
		<option value="${medicamento.codigo}">
		${medicamento.nome}
		</option>
	</c:forEach>

</select>


<br>
<br>
<input type="submit" name="Salvar">
</form>




</body>
</html>