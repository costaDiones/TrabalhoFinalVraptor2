<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastra Medicamento</title>
<style type="text/css">
<%@ include file="css/style.css"%>
<%@ include file="css/bootstrap.min.css"%>
<%@ include file="css/bootstrap.min.css"%>
<%@ include file="css/bootstrap.css.map"%>
<%@ include file="css/bootstrap.css"%>


</style>
</head>
<body>


<form action="${linkTo[MedicamentoController].salvar }" method="post">

<input type="hidden" name="medicameto.codigo" value="${medicamento.codigo}"/>
<div class="container">
    <div class="row">
        <div class="col-sm-6 col-md-4 col-md-offset-4">
            <h1 class="text-center login-title">Cadastro de Medicamento</h1>
            <div class="account-wall">
                <img class="profile-img" src="http://www.dietaja.org/wp-content/uploads/2015/05/remedios-para-emagrecer-64x64.jpg"
                    alt="">
                <form class="form-signin">
                <input type="text" class="form-control" name="medicamento.nome" value="${medicamento.nome}">
                <input type="text" class="form-control" name="medicamento.preco" value="${medicamento.preco}">
                <button class="btn btn-lg btn-primary btn-block" type="submit" value="Salvar" >
                   Cadastrar</button>
                
                </form>
            </div>
        </div>
    </div>
</div>

</form>

</body>
</html>