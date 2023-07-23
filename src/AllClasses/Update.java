/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllClasses;

import database.database;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class Update {
    
    private String query;
     public int update(int id,String newFeild,String attribute,String table) throws SQLException{
            
        query = "UPDATE "+table+" SET  "+attribute+" = '"+newFeild+"' WHERE ID = "+id+""; 
        int result = database.getInstance().update(query);
        return result;
        
    }
     
         public int updateAge(int coachId,int age,String table) throws SQLException{
    
        query = "UPDATE "+table+" SET  AGE = "+age+" WHERE ID = "+coachId+""; 
        int result = database.getInstance().update(query);
        return result;
        
    }
    
}
