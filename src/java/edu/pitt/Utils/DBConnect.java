/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.Utils;

import edu.pitt.beans.taskBean;
import edu.pitt.beans.userBasicInfoBean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import edu.pitt.beans.userBean;
import java.util.ArrayList;
/**
 *
 * @author zhangqian
 */
public class DBConnect {
    private String DBDriver="com.mysql.jdbc.Driver";
    private String url="jdbc:mysql://localhost:8889/PReading";
    private String uid="root";
    private String pwd="root";
    public Connection conn=null;
    public ResultSet rs=null;

    public String getDBDriver() {
        return DBDriver;
    }

    public void setDBDriver(String DBDriver) {
        this.DBDriver = DBDriver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public DBConnect() {
    }
    
    
    //update database, include update, insert, delete....
    public void query(String query) throws Exception{
         try
        {
           Class.forName(DBDriver);
           conn=DriverManager.getConnection(url,uid,pwd);
           Statement stmt=conn.createStatement();
           stmt.executeUpdate(query);
           stmt.close();
           conn.close();
           
        }
        catch(SQLException ee)
        {
            System.out.println(ee.getMessage());
        }
    }
    //search for a result set in the database//excute a query and return user objects
    public ArrayList<userBean> search(String query) throws Exception{
        
        ArrayList<userBean> arr = new ArrayList<userBean>();
        
         try
        {
           Class.forName(DBDriver);
           conn=DriverManager.getConnection(url,uid,pwd);
           Statement stmt=conn.createStatement();
           rs = stmt.executeQuery(query);
           while (rs.next()) {
                userBean user;
                int userid = rs.getInt("userid");
                String username = rs.getString("username");
                String email = rs.getString("email");
                int type = rs.getInt("type");
                String password = rs.getString("password");
                user = new userBean(userid,username, password, email, type);
                arr.add(user);
            }
           rs.close();
           stmt.close();
           conn.close();
           
        }
        catch(SQLException ee)
        {
            System.out.println(ee.getMessage());
        }
        
        
        return arr;
    }

    public ArrayList<userBasicInfoBean> searchBasicInfo(String query) throws Exception{
        
        ArrayList<userBasicInfoBean> arr = new ArrayList<userBasicInfoBean>();
        
         try
        {
           Class.forName(DBDriver);
           conn=DriverManager.getConnection(url,uid,pwd);
           Statement stmt=conn.createStatement();
           rs = stmt.executeQuery(query);
           while (rs.next()) {
            System.out.println("====="+"mark");
                userBasicInfoBean userInfo;
                String username = rs.getString("UserName");
                String firstname=rs.getString("firstname");
                String lastname=rs.getString("lastname");
                String institution=rs.getString("institution");
                String domainInterests=rs.getString("domain_of_interests");
               
                userInfo = new userBasicInfoBean(username, firstname, lastname,institution, domainInterests);
                arr.add(userInfo);
            }
           rs.close();
           stmt.close();
           conn.close();
           
        }
        catch(SQLException ee)
        {
            System.out.println(ee.getMessage());
        }
        
        
        return arr;
    }
    public int getUserId(String username)throws Exception{
        int userid=0;
         try
        {
           Class.forName(DBDriver);
           conn=DriverManager.getConnection(url,uid,pwd);
           Statement stmt=conn.createStatement();
           String query = "SELECT userid FROM USER WHERE username = '"+username+"'";
           rs = stmt.executeQuery(query);
           while (rs.next()) {
                
                userid = rs.getInt("userid");
              
                String email = rs.getString("email");
                int type = rs.getInt("type");
                String password = rs.getString("password");
               
            }
            
           rs.close();
           stmt.close();
           conn.close();
           
           
        }
        catch(SQLException ee)
        {
            System.out.println(ee.getMessage());
        }
         return userid;
    }
   
     public ArrayList<taskBean> searchAllTask(String query) throws Exception{
        
        ArrayList<taskBean> arr = new ArrayList<taskBean>();
        
         try
        {
           Class.forName(DBDriver);
           conn=DriverManager.getConnection(url,uid,pwd);
           Statement stmt=conn.createStatement();
           rs = stmt.executeQuery(query);
           while (rs.next()) {
                taskBean task;
                int userid = rs.getInt("userid");
                String paperName = rs.getString("taskName");
                String paperDeadline = rs.getString("taskDeadline");
                String paperDescription = rs.getString("taskDescription");
                String paperRequirement = rs.getString("taskRequirement");
                int domain = rs.getInt("taskDomain");
                //String password = rs.getString("password");
                task = new taskBean(userid, paperName, paperDeadline, paperDescription,  paperRequirement, domain);
                arr.add(task);
            }
           rs.close();
           stmt.close();
           conn.close();
           
        }
        catch(SQLException ee)
        {
            System.out.println(ee.getMessage());
        }
        
        
        return arr;
    }
    
}
