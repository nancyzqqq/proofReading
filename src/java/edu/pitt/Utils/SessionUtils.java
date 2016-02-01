/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.Utils;

import edu.pitt.beans.userBasicInfoBean;
import edu.pitt.beans.userBean;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author zhangqian
 */
public class SessionUtils {
    public static void updateSession(HttpServletRequest request,
            userBean userbean ,userBasicInfoBean userinfo,
            String username){
        request.getSession().setAttribute("user", userbean);
        request.getSession().setAttribute("userBasicInfo", userinfo);
        request.getSession().setAttribute("username", username);
        
    }
    public static void addSession(){
        
    }
}
