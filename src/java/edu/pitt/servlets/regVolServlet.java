/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.servlets;

import edu.pitt.Utils.DBConnect;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "regVolServlet", urlPatterns = {"/regVolServlet"})
public class regVolServlet extends HttpServlet {

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
         String username = (String)request.getSession().getAttribute("username");
         //System.out.println("username = "+ username);
         String avatime = request.getParameter("form-avatime");
         
         String[] time = request.getParameterValues("expTime");
         String[] details = request.getParameterValues("expDes");
         String[]  domainArr = request.getParameterValues("domainCheckbox");
         String[]  strengthArr = request.getParameterValues("strengthCheckbox");
         DBConnect db = new DBConnect();
         int UserID=0;
         for(String str : time){
             System.out.println(str);
         }
         for(String str1 : domainArr){
             System.out.println(str1);
         }
        try {
            UserID = db.getUserId(username);
            System.out.println(username);
            //System.out.println(UserID+"=========");
        } catch (Exception ex) {
            Logger.getLogger(GetRequestsServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
         String insertVol = "INSERT INTO vol_main(UserID, availtime) VALUES ("+UserID+",'"+avatime+"')";
         String updateUserType  = "UPDATE `USER` SET `TYPE`=1  WHERE `UserID` = "+UserID+"";
         int volid = 0;
         try
            {
            db.query(insertVol);
            db.query(updateUserType);
            volid = db.getVolID(UserID);
            System.out.println("volid = " + volid);
            
            }
            catch(Exception e)
            {
                System.out.println("insert failed");
            }
         
         String insertDomain = "";
         String insertStrength = "";
         int cs = 0,is=0,lis=0;
         for(int i = 0 ; i < domainArr.length; i++){
             if(domainArr[i].equals("1")){
                 cs = 1;
             }else if (domainArr[i].equals("2")){
                 is = 1;
             }else{
                 lis =1;
             }
         }
         int lan = 0, con = 0 , gra = 0;
         for(int i = 0;i < strengthArr.length;i++){
             if(strengthArr[i].equals("1")){
                 lan = 1;
             }else if (strengthArr[i].equals("2")){
                 con = 1;
             }else{
                 gra = 1;
             }
         }
         
         insertDomain = "INSERT INTO vol_interest(VolID,csdomain, isdomain, lisdomain) VALUES ("+volid+","+cs+","+is+","+lis+")";
         
         insertStrength = "INSERT INTO `vol_strength`(`VolID`, `lan_edit`, `con_edit`, `gra_edit`) VALUES ("+volid+","+lan+","+con+","+gra+")";
        
         try
            {
            db.query(insertDomain);
            db.query(insertStrength);
            }
            catch(Exception e)
            {
                System.out.println("insert strength and interest failed");
            }
         
         for(int i = 0 ; i < time.length ; i++){
             String insertExp = "INSERT INTO `vol_exp`(`volid`, `exp_time`, `exp_detail`) VALUES ("+volid+",'"+time[i]+"','"+details[i]+"')";
              try
            {
                db.query(insertExp);
            
             }
             catch(Exception e)
            {
                System.out.println("insert experiences failed");
            }
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
