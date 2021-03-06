/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import edu.pitt.Utils.DBConnect;
import edu.pitt.beans.userBasicInfoBean;
import edu.pitt.beans.userBean;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/**
 *
 * @author zhangqian
 */
public class userSignUpServlet extends HttpServlet {

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
//       String toJSP;
       response.setContentType("text/html");
       
       String username = request.getParameter("form-username");
       String email  = request.getParameter("form-email1");
       String password = request.getParameter("form-password");
       int type = 0;
       
//       System.out.println("Test================Test"+username);
       
       userBean user = new userBean(username, email, password, type);
       userBasicInfoBean userBasicInfo = new userBasicInfoBean(username,null,null,null,null);
       
       request.getSession().setAttribute("user", user);
       request.getSession().setAttribute("userBasicInfo", userBasicInfo);
       request.getSession().setAttribute("username", username);
       
       DBConnect db = new DBConnect();
       //check for unique by email address
//       String checkEmail = "SELECT * FROM  USER	 WHERE Email = '"+email+"'";
//       ArrayList<userBean> arrUser = new ArrayList<userBean>();
//       
//       arrUser = db.search(checkEmail);
//       if(arrUser.size()==0){
//           
//       }
       String insertQuery = "INSERT INTO USER(UserName,Password,Email,TYPE) VALUES('"+username+"','"+password+"','"+email+"','"+type+"')";
       String insertBasicInfoQuery = "INSERT INTO user_basic_info(UserName,firstname,lastname,institution,domain_of_interests) VALUES('"+username+"','null','null','null','null')";
       try{ 
          db.query(insertQuery);
          db.query(insertBasicInfoQuery);
        } catch(Exception e) {
          System.out.println("insert failed");
        }
       //db.query(insertQuery);
//       toJSP = "usermainpage.jsp";
       RequestDispatcher rd = request.getRequestDispatcher("usermainpage.jsp");
       rd.forward(request, response);
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
            Logger.getLogger(userSignUpServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(userSignUpServlet.class.getName()).log(Level.SEVERE, null, ex);
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

