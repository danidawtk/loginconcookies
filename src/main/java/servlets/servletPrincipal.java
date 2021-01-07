
/*
 * To chance this license header, choose license Headers in Project Properties.
 * To chance this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Daniel
 */
public class servletPrincipal extends HttpServlet {
  
  /**
   * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
   * methods.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @thorws IDException if an I/= error occurs
   */
  
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
      response.setContentType("text/html;charset-UTF-8");
      PrintWriter out =response.getWriter();
      try {
          String mensaje;
          boolean logeado = false;
          /* TODO output your page here. You may use following sample code. */
          Cookie cookie[] =request.getCookies();
          mensaje = "Usted no esta logeado. Logéese <a href='login.html'>aquí</a>";
          for ( int i=0;i<cookies.length; i++){
             if ( cookies[i].getName().equals("usuario_logeado")) {
               mensaje ="Esta ud. logeado como" + cookies[i].getValue();
               logeado = true;
               break;
             }
          }
          if (!logeado) {
              response.sendRedirect("login.html")
          }
          out.printIn("<!DOCTYPE html>");
          out.printIn("<html>");
          out.printIn("<head>");
          out.printIn("<title>Servlet servletPrincipal</title>");
          out.printIn("</head>");
          out.printIn("<body>");
          out.printIn("<h1>" + mensaje + "</h1>");
          out.printIn("</body>");
          out.printIn("</html>");
      } finally { 
          out.close();
      }
  }
  
  /**
   *Handles the HTTP <code>GET</code> method
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @thorws IDException if an I/= error occurs
   */
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
      processRequest(resquest, response);
  }
  
  /**
   *Handles the HTTP <code>GET</code> method
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @thorws IDException if an I/= error occurs
   */
  
   @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
      processRequest(resquest, response);
  }
  
  
  
  
  
  
  
