<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>alcance variables</title>
    </head>
    <body>
        <h1>alcance variables</h1>
        <br/>
        Variable request:
        <%-- rectanguloRequest.base llama indirectamente al metodo getBase de modelo Rectangulo  --%>
        Base:${rectanguloRequest.base}
        <%-- rectanguloRequest.base llama indirectamente al metodo getBase de modelo Rectangulo  --%>
        Altura:${rectanguloRequest.altura}
        <%-- rectanguloRequest.base llama indirectamente al metodo getBase de modelo Rectangulo  --%>
        Area:${rectanguloRequest.area}
        <br/><br/>
        
        Variable session
        <%-- rectanguloSesion accede al ServletControlador para tomar los datos pasados en el ServletControlador  --%>
        Base:${rectanguloSesion.base}
        Altura:${rectanguloSesion.altura}
        Area:${rectanguloSesion.area}
        <br/><br/>  
        Variable aplicacion
        Base:${rectanguloAplicacion.base}
        Altura:${rectanguloAplicacion.altura}
        Area:${rectanguloAplicacion.area}
        <br/><br/>  
        <a href="${pageContext.request.contextPath}/index.jsp">Regregar</a>



    </body>
</html>
