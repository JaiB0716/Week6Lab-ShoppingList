/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Owner
 */
public class ShoppingListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/register.jsp")
                .forward(request,response);
        
        String username = request.getParameter("user");
    
        if(username == null || username.equals("")) {
            getServletContext().getRequestDispatcher("/WEB-INF/register.jsp")
                .forward(request,response);
            }
        else {
            HttpSession session = request.getSession();
         
            session.setAttribute("user", username);
            
            getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp")
                .forward(request,response);
        }
    }
     
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            }

}
