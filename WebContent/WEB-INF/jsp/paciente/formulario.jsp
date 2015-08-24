<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastra Pciente</title>
</head>
<body>


<form  action="${ linkTo[PacienteController].salvar }" 
		method="post">
		<br/>
<input type="hidden" name="paciente.codigo" value="${paciente.codigo }" >
<br/>Nome:
<input type="text" name="paciente.nome" 
	value="${paciente.nome}"/>
	<br/>
<br/>CPF:
<input type="text" name="paciente.cpf" 
	value="${paciente.cpf}"/>
	<br/>
	<br/>Endereco:
<input type="text" name="paciente.endereco" 
	value="${paciente.endereco}"/>
<br/>
<input type="submit" value="Salvar "/>
</form>

</body>
</html>