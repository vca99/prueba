<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>View Books</title>
        <link href="<c:url value="/css/common.css"/>" rel="stylesheet" type="text/css">
        
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        
    </head>
    <body>
        <table>
            <thead>
                <tr>
                	<th>Nombre</th>
                    <th>Ingredientes</th>
                    <th>Pasos</th>
                 
                </tr>
            </thead>
            <tbody>
<%--                 <c:forEach items="${listaresetas}" var="resetas"> --%>
<!--                     <tr> -->
<%--                         <td>${resetas.ingredientes}</td> --%>
<%--                         <td>${resetas.pasos}</td> --%>
                     
<!--                     </tr> -->
<%--                 </c:forEach> --%>
            </tbody>
        </table>
    </body>
</html>