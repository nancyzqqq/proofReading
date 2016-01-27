/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.servlets;

import DataTable.DataTablesParamUtility;
import DataTable.JQueryDataTableParamModel;
import edu.pitt.Utils.DBConnect;
import edu.pitt.beans.taskBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author zhangqian
 */
@WebServlet(name = "GetRequestsServlet", urlPatterns = {"/GetRequestsServlet"})
public class GetRequestsServlet extends HttpServlet {

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
       // response.setContentType("text/html;charset=UTF-8");
       
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
         PrintWriter out = response.getWriter(); 
        response.setContentType("text/html;charset=UTF-8");
        String username = request.getParameter("username");
        System.out.println(username+"=========");
        DBConnect db = new DBConnect();
        int UserID=0;
        try {
            UserID = db.getUserId(username);
            System.out.println(UserID+"=========");
        } catch (Exception ex) {
            Logger.getLogger(GetRequestsServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        String query = "SELECT * FROM task WHERE `UserID` = '"+UserID+"'";
        ArrayList<taskBean>  arr = new ArrayList<taskBean>();
        try {
            arr = db.searchAllTask(query);
        } catch (Exception ex) {
            Logger.getLogger(GetRequestsServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sub = "";
        String dataset  = "";
        for(int i =0 ;i < arr.size();i++){
            taskBean task;
            task = arr.get(i);
            //int userId = UserID;
            String paperName = task.getPaperName();
            String paperDeadline = task.getPaperDeadline();
            String paperDescription = task.getPaperDescription();
            String paperRequirement = task.getPaperRequirement();
            int domain = task.getDomain();
            String domain_1 = "";
            if(domain == 0){
                domain_1 = "Computer Science";
                
            }else if(domain == 1){
                domain_1 = "Information Scicence";
            }else{
                domain_1 = "Library Information Science";
            }
            sub = "["+paperName+","+paperDeadline+","+paperDescription+","+paperRequirement+","+domain_1+"]";
            dataset = dataset +";" +sub; 
            
        }
        dataset = dataset.substring(1, dataset.length());
        
        out.println(dataset);

        
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
