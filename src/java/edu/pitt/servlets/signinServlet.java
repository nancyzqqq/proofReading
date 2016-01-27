/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.servlets;

import edu.pitt.Utils.DBConnect;
import edu.pitt.beans.userBasicInfoBean;
import edu.pitt.beans.userBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author zhangqian
 */
@WebServlet(name = "signinServlet", urlPatterns = {"/signinServlet"})
public class signinServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        String tojsp;
        response.setContentType("text/html");
        
        String username = request.getParameter("form-username");
        String password = request.getParameter("form-password");
        DBConnect db = new DBConnect();
        System.out.println(username+"!!!!!!!!!!!!!!!!!!!!!!!");
        String query = "select * from user where username = '"+username+"'";
        
        ArrayList<userBean> arr = new ArrayList<userBean>();

        arr =  db.search(query);
        userBean user = arr.get(0);
        System.out.println(arr.size()+"size");
        String passwordDB = user.getPassword();
        String email = user.getEmail();
        // System.out.println(email+"-email");
        // System.out.println(passwordDB+"-password");
        // System.out.println(user.getUername()+"-username");
        // System.out.println(user.getUserID()+"-userid");
        // System.out.println(user.getType()+"-usertype");
        
        // System.out.println(password+"===============");
        if (passwordDB.equals(password)){
        tojsp = "usermainpage.jsp";
        //String query1 =   "select * from user_basic_info where username = '"+username+"'";
        String query1 =   "SELECT * FROM user_basic_info WHERE UserName = 'Test2'";
        ArrayList<userBasicInfoBean> arrInfo = new ArrayList<userBasicInfoBean>();
        arrInfo =db.searchBasicInfo(query1);
        //System.out.println("-----"+arrInfo.size());
        userBasicInfoBean userInfo = arrInfo.get(0);
        String firstname = userInfo.getFirstname();
        System.out.println(firstname+"~~~~~~~~~~");
        request.getSession().setAttribute("user", user);
        request.getSession().setAttribute("userBasicInfo", userInfo);
        request.getSession().setAttribute("username", username);
        RequestDispatcher rd = request.getRequestDispatcher(tojsp);
        rd.forward(request, response);

       
       }else{
            request.setAttribute("error", "Unknown user, please try again");
            request.getRequestDispatcher("index.jsp").forward(request, response);
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(signinServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(signinServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
