<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro Médico</title>
</head>
<body>

<form  action="${ linkTo[MedicoController].salvar }" 
		method="post">
		<br/>
<input type="hidden" name="medico.codigo" value="${medico.codigo }" >
<br/>Nome:
<input type="text" name="medico.nome" 
	value="${medico.nome}"/>
	<br/>
<br/>CRM:
<input type="text" name="medico.crm" 
	value="${medico.crm}"/>
	<br/>
	<br/>Endereco:
<input type="text" name="medico.endereco" 
	value="${medico.endereco}"/>
<br/>
<input type="submit" value="Salvar "/>
</form>



</body>
</html>