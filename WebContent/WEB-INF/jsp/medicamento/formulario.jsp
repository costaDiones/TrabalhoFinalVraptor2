<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastra Medicamento</title>
</head>
<body>






<form action="${linkTo[MedicamentoController].salvar }" method="post">

<br>

<input type="hidden" name="medicameto.codigo" value="${medicamento.codigo}"/>

<br>Nome
<input type="text" name="medicamento.nome" value="${medicamento.nome}"/>
<br>
<br>Preço
<input type="text" name="medicamento.preco" value="${medicamento.preco}">

<input type="submit" value="Salvar"/>
</form>







</body>
</html>