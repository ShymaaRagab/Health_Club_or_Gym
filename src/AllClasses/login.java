
package AllClasses;

import database.database;
import java.sql.*;

/**
 *
 * @author osama abdelrassoul
 */

public class login {
    ResultSet rs;
    public  login(){}
   public int log_in(String user,String password,String choose) throws SQLException{
       
       String sql="";
           if(choose=="member")
                     sql=("select count(1) from member where USERNAME='"+user+"'and password ='"+password+"'");
           else if(choose=="coach")
                     sql=("select count(1) from COACH where USERNAME='"+user+"'and password ='"+password+"'");
           else
                     sql=("select count(1) from ADMIN where USERNAME='"+user+"'and password ='"+password+"'");
   
     
        int count= 0;  
  
        try {
        rs = database.getInstance().getRecords(sql);
        } catch (SQLException ex) {
         Masseges.showErrorDialog("cannot access to database");
        }
            while (rs.next()) {
                count=rs.getInt("1");
                               }
           if (count==1){
           if(choose=="member")    
                    return 1;          
                                
           else if(choose=="coach")              
                     return 2;
           else
               
                     return 3;
        }
        else
                     return 4;
   }
}
