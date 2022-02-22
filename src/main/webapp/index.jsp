<!DOCTYPE html>
<html>
    <head>
        <title>Ejemplo MVC 2</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Ejemplo MVC 2</h1>
        <br/>

        <div style="color: red">${mensaje}</div>
        <br/>
        <a href="${pageContext.request.contextPath}/ServletControlador">
            Link al Servlet controlador sin parametros:</a>

        <br/> <br/>
        <a href="${pageContext.request.contextPath}/ServletControlador?accion=agregaVariables">
<%--?accion=agregaVariables con el accion le estamos pasando un parametro que es:agregaVariables --%>
            Link al Servlet controlador para agregar las variables</a>

        <br/> <br/>
        <a href="${pageContext.request.contextPath}/ServletControlador?accion=listarVariables">
            Link al Servlet controlador para listar variables</a>



    </body>
</html>
