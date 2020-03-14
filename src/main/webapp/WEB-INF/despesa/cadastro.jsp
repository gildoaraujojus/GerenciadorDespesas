<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<meta charset="UTF-8">
<title>Cadastro de Despesas</title>
<link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css">
</head>
<body>
<nav class="navbar navbar-inverse navbar-static-top" ></nav>
<form class="form-horizontal" method="post" action="/despesas/salvar">
	<c:if test="${!empty mensagem}">
		<div class="alert alert-success" >
			<span>${mensagem}</span>
		</div>
	</c:if>
    
    <div class="form-group">
        <label for="descricao" class="col-sm-2 control-label">Descrição</label>
        <div class="col-sm-4">
            <input type="text" class="form-control" name="descricao">
        </div>  
    </div>

    <div class="form-group">
        <label for="categoria" class="col-sm-2 control-label">categoria</label>
        <div class="col-sm-2">
        <select class="form-control" name="categoria">
           <c:forEach items="${todasCategorias}" var="categoria">
           		<option value="${categoria}">${categoria.nome}</option>	
           </c:forEach>
        </select>    
        </div>  
    </div>    

    <div class="form-group">
        <label for="data" class="col-sm-2 control-label">Data</label>
        <div class="col-sm-2">
            <input type="text" class="form-control" name="data">
        </div>  
    </div>    

    <div class="form-group">
        <label for="valor" class="col-sm-2 control-label">Valor</label>
        <div class="col-sm-2">
            <input type="text" class="form-control" name="valor">
        </div>  
    </div>    

    <div class="form-group">
        <label for="observacoes" class="col-sm-2 control-label">Observações</label>
        <div class="col-sm-2">
            <input type="text" class="form-control" name="observacoes">
        </div>  
    </div>    

    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn-btn-primary">Salvar</button>
        </div>  
    </div>    

</form>

<button></button>

<script src="/js/bootstrap.min.js"></script>
</body>
</html>