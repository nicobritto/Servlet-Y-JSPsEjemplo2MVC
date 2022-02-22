package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.Procesamos los parametros(en este ejemeplo no procesamos ningun parametro)
        //aca recuperamos los parametros  de el index }/ServletControlador?accion=
        String accion = request.getParameter("accion");

        //2.Creamos los JavaBeans
        //definimos los JavaBeans que vamos a compratir en el alcanse request session y aplication
        
        Rectangulo recRequest = new Rectangulo(1, 2);
        Rectangulo recSesion = new Rectangulo(3, 4);
        Rectangulo recAplicacion = new Rectangulo(5, 6);
        
        //3. Agregamos el JavaBeans a algun alcanse
        //revisamos la accion proporsionada que seria la que esta en el index :/ServletControlador?accion=agregaVariables
      
        if ("agregaVariables".equals(accion)) {
            //Alcense request
            request.setAttribute("rectanguloRequest", recRequest);
            // Alcanse de session
            HttpSession sesion = request.getSession();
            sesion.setAttribute("rectanguloSesion", recSesion);
            
            //Alcense de application
            //   ServletContext application no regresa una instancia de ServletContext
            ServletContext application = this.getServletContext();
            application.setAttribute("rectanguloAplicacion", recAplicacion);

            //agregamos un mje para saber que se ejecuto
            request.setAttribute("mensaje", "las variables fueron agregadas");
            
            //4,redireccionado al jsp index
            request.getRequestDispatcher("index.jsp").forward(request, response);
              //forward enviar los objetos request y response que estos contiene la info que agregamos
            
            
        } else if ("listarVariables".equals(accion)) {
            //4.Redireccionamos al jsp  que desplega las variables
            request.getRequestDispatcher("WEB-INF/alcanceVariables.jsp").forward(request, response);
            //forward enviar los objetos request y response que estos contiene la info que agregamos
            
            
        } else {
            //4.Redireccionamos ala paguina de inicio
            request.setAttribute("mensaje", "accion no proporcionada o desconocida");
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
            //esta linia no agregaria informacion al jsp ya que no proapga los objetos reques y response
            //response.sendRedirect("index.jsp");
        }

    }

}
