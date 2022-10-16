/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.util.ArrayList;
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
        getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
        
              HttpSession session = request.getSession();
              
              String username = (String) session.getAttribute("name");
              session.setAttribute("username", username);
              
              String logout = request.getParameter("action");
              
              if(logout != null) {
                  
                  session.invalidate();
                  
                  request.setAttribute("loggedOut", true);
                  
                  getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
              }
              else if (username != null) {
                  
                  getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
              }
              else {
                  
                  getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
              }
    }
    
    ArrayList<String> iList = new ArrayList();
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            HttpSession session = request.getSession();
            String uName = request.getParameter("username");
            String action = request.getParameter("action");
            String listI = request.getParameter("item");
            
            if(action.equals("register")) {
                if(uName == null || uName.equals("")) {
                    request.setAttribute("invalid", true);
                    
                    getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
                    return;
                }
                session.setAttribute("username", uName);
            }
            else if(action.equals("add")) {
                iList.add(listI);
                session.setAttribute("item", listI);
            }
            else if (action.equals("delete")) {
                String selectedItem = request.getParameter("item");
                iList = (ArrayList) session.getAttribute("iList");
                
                iList.remove(selectedItem);
                session.setAttribute("list", iList);
             if(iList.isEmpty()) {
                 session.removeAttribute("iList");
             }
            }
            getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
            }

}
