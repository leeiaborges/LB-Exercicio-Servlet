<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exercicio Servlet</title>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">
<form method="post" action="Servlet">
    <h1 class="d-flex justify-content-center">Calculadora Servlet</h1>
    
<br>

    <div class="input-form d-flex justify-content-center">
         <label for="valA" style="margin-right: 10px">Digite o valor de A</label>
         <input type="number" name="valA" >
    </div>    

<br>

     <div class="input-form d-flex justify-content-center">
          <label for="valB" style="margin-right: 10px">Digite o valor de B</label>
          <input type="number" name="valB">
     </div>    

<br>   

     <div class="input-form d-flex justify-content-center">
          <label for="valC" style="margin-right: 10px">Digite o valor de C</label>
          <input type="number" name="valC">
     </div>    

<br>
      <div class="input-form d-flex justify-content-center space-between">
           <button type="reset" class="btn btn-outline-dark" style="margin-right: 10px">LIMPAR</button>
           <button type="submit" class="btn btn-outline-dark">ENCONTRE O RESULTADO</button>
      </div>
</form>
</div>

</body>
</html>