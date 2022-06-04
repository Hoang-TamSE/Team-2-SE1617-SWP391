/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hoang Tam
 */
public class MainController extends HttpServlet {

    private static final String ERROR="error.jsp";
    private static final String LOGIN="Login";
    private static final String LOGIN_CONTROLLER="LoginController";
    private static final String SEARCH="Search";
    private static final String SEARCH_CONTROLLER="SearchStudentController";
    private static final String DELETESTUDENT="deleteStudent";
    private static final String DELETE_CONTROLLER="DeleteStudentController";
    private static final String UPDATE="Update";
    private static final String UPDATE_CONTROLLER="UpdateController";
    private static final String PAGEUPDATESTUDENT="pageUpdateStudent";
    private static final String PAGEUPDATESTUDENT_CONTROLLER="PageUpdateStudentController";
    private static final String LOGOUT="Logout";
    private static final String LOGOUT_CONTROLLER="LogoutController";
    private static final String CREATE="Create";
    private static final String CREATE_CONTROLLER="CreateController";
    private static final String VIEW="View";
    private static final String VIEW_CONTROLLER="viewCart.jsp";
    private static final String REMOVE="Remove";
    private static final String REMOVE_CONTROLLER="RemoveController";
    private static final String EDIT="Edit";
    private static final String EDIT_CONTROLLER="EditController";
    private static final String SEARCHFORUSER="SearchForUser";
    private static final String SEARCHFORUSER_CONTROLLER="SearchForUserController";
    private static final String DETAIL="Detail";
    private static final String DETAIL_CONTROLLER="DetailController";
    private static final String ADDTOCART="AddToCart";
    private static final String ADDTOCART_CONTROLLER="AddToCartController";
    private static final String VIEWCART="ViewCart";
    private static final String VIEWCART_CONTROLLER="ViewCartController";
    private static final String CHECKOUT="CheckOut";
    private static final String CHECKOUT_CONTROLLER="CheckOutController";
    private static final String SENDMAIL="SendMail";
    private static final String SENDMAIL_CONTROLLER="SendMailController";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            String action= request.getParameter("action");
            if(LOGIN.equals(action)){
                url=LOGIN_CONTROLLER;
            }else if(SEARCH.equals(action)){
                    url= SEARCH_CONTROLLER;
            
            }else if(DELETESTUDENT.equals(action)){
                    url= DELETE_CONTROLLER;
            
            }else if(UPDATE.equals(action)){
                    url= UPDATE_CONTROLLER;
            }
            else if(PAGEUPDATESTUDENT.equals(action)){
                    url= PAGEUPDATESTUDENT_CONTROLLER;
            }
            else if(LOGOUT.equals(action)){
                    url= LOGOUT_CONTROLLER;
            }
            else if(CREATE.equals(action)){
                    url= CREATE_CONTROLLER;
            }
            
            else if(VIEW.equals(action)){
                    url= VIEW_CONTROLLER;
            }
            else if(REMOVE.equals(action)){
                    url= REMOVE_CONTROLLER;
            }
            else if(EDIT.equals(action)){
                    url= EDIT_CONTROLLER;
            }
            else if(SEARCHFORUSER.equals(action)){
                    url= SEARCHFORUSER_CONTROLLER;
            }
            else if(DETAIL.equals(action)){
                    url= DETAIL_CONTROLLER;
            }
            else if(ADDTOCART.equals(action)){
                    url= ADDTOCART_CONTROLLER;
            }
            else if(VIEWCART.equals(action)){
                    url= VIEWCART_CONTROLLER;
            }
            else if(CHECKOUT.equals(action)){
                    url= CHECKOUT_CONTROLLER;
            }
            else if(SENDMAIL.equals(action)){
                    url= SENDMAIL_CONTROLLER;
            }
        } catch (Exception e) {
            log("Error at MainController: "+ e.toString());
        }finally{
            request.getRequestDispatcher(url).forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
