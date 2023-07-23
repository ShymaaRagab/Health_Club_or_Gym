/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllClasses;

import java.sql.SQLException;

public class UpdateMember {
    
    public int updateUserName(int id,String username) throws SQLException{
        String sql="UPDATE MEMBER SET USERNAME ='"+username+"' WHERE ID ="+id+"";         
        return database.database.getInstance().update(sql);
    }
    
    
    public int updatePassword(int id,String password) throws SQLException{
        String sql="UPDATE MEMBER SET PASSWORD ='"+password+"' WHERE ID ="+id+"";         
        return database.database.getInstance().update(sql);
    }
    
    public int updateAge(int id,String age) throws SQLException{
        String sql="UPDATE MEMBER SET age ="+Integer.parseInt(age)+" WHERE ID ="+id+"";         
            return database.database.getInstance().update(sql);
    }
    
    
    public int updateName(int id,String name) throws SQLException{
    String sql="UPDATE MEMBER SET NAME ='"+name+"' WHERE ID ="+id+"";         
            return database.database.getInstance().update(sql);
    }
}
