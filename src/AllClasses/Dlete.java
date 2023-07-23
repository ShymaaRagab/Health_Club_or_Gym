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
public class Dlete {
    
      private String query;
    
     public int delete(int coachId,String table) throws SQLException{
    
        query = "Delete FROM ROOT."+table+" WHERE ID = "+coachId+"";
        int result = database.getInstance().update(query);
        
        return result;
          
    }
    
}
