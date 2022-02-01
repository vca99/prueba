<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>Añade Receta</title>
<%--         <link href="<c:url value="/css/common.css"/>" rel="stylesheet" type="text/css"> --%>

        <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
        
        
         <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>
    
    <body>
    
     <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    


	<div class="container">
	
	 <h1>Añadir receta</h1>
     <label>Añadir su recta</label>
    
<%--         <c:url var="add_receta_url" value="addReceta"/> --%>
<!--          <form:form action="addReceta" method="post" modelAttribute="receta"> -->
<!--             <form:label path="id">Id: </form:label> <form:input type="text" path="id"/> -->
<!--             <form:label path="nombre">Nombre: </form:label> <form:input type="text" path="nombre"/> -->
<!--             <form:label path="ingredientes">Ingredientes: </form:label> <form:input path="ingredientes"/> -->
<!--             <form:label path="pasos">Pasos: </form:label> <form:input path="pasos"/> -->
<!--             <input type="submit" value="Añadir"/> -->
<!--         </form:form> -->
        
 <form>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="nombre">Nombre</label>
      <input type="text" class="form-control" id="nombre" placeholder="nombre">
    </div>
   </div>
   
   <div class="form-row">
    <div class="form-group col-md-6">
      <label for="ingredientes">Ingredientes</label>
<!--       <input type="text" class="form-control" id="ingredientes" placeholder="ingredientes"> -->
      <textarea class="form-control" id="ingredientes" rows="5"  placeholder="ingredientes"></textarea>
    </div>
  </div>
   
   <div class="form-row" col-md-6>
	  <div class="form-group">
	    <label for="pasos">Pasos</label>
<!-- 	    <input type="text" class="form-control" id="pasos" placeholder="pasos"> -->
	    <textarea class="form-control" id="pasos" rows="6"  placeholder="pasos"></textarea>
 
	  </div>
  </div>
 
  <button type="submit" class="btn btn-primary">Añade</button>
  
</form>
        
     </div>
    </body>
</html>