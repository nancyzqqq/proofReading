/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.servlets;

import edu.pitt.Utils.DBConnect;
import edu.pitt.Utils.SessionUtils;
import edu.pitt.beans.userBasicInfoBean;
import edu.pitt.beans.userBean;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "userSettingServlet", urlPatterns = {"/userSettingServlet"})
public class userSettingServlet extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String  tojsp="userBasicInfoSetting.jsp";
        String username;
        username = (String)request.getSession().getAttribute("username");
        userBasicInfoBean user_info = (userBasicInfoBean)request.getSession().getAttribute("userBasicInfo");
        String or_firstname = user_info.getFirstname();
        String or_lastname = user_info.getLastname();
        String or_institution = user_info.getInstitution();
        String or_domain= user_info.getDomainInterests();

        String firstname = request.getParameter("form_firstname");
        String lastname = request.getParameter("form_lastname");
        String institution = request.getParameter("form_institution");
        String domainIn = "";
        String[]  domainArr = request.getParameterValues("domainCheckbox");
       
        if(firstname == null || firstname.equals("")){
            firstname = or_firstname;
        }
        if(lastname == null || lastname.equals("")){
            lastname = or_lastname;

        }
        if (institution == null || institution.equals("")) {
            institution = or_institution;
        }
        StringBuilder domain = new StringBuilder("");
        for(String domainElement : domainArr) {
            domain.append(domainElement + "###");
        }
        
        if(domainArr.length == 0){
            domainIn = or_domain;
        }else{
            domainIn = domain.toString();
        }
        
        //System.out.println("!!!!!!!"+ domain[0]);
        String insertBasicInfoQuery = "update user_basic_info set firstname ='"+firstname+"',lastname ='"+lastname+"',institution ='"+institution+"',domain_of_interests ='"+domain+"' where username = '"+username+"'";

        
        DBConnect db = new DBConnect();
        try
            {
            db.query(insertBasicInfoQuery);
            
            }
            catch(Exception e)
            {
                System.out.println("insert failed");
            }
        userBean user = (userBean)request.getSession().getAttribute("user");
        userBasicInfoBean user_info_new = new userBasicInfoBean(username,firstname,lastname,institution,domainIn);
        SessionUtils.updateSession(request, user, user_info_new, username);
        
        RequestDispatcher rd = request.getRequestDispatcher(tojsp);
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
