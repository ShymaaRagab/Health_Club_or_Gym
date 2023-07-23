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
public class AddCoach {
    
    private String query;
    
    public int addCoach( String name, int age, String username, String password) throws SQLException{
        
        query = "INSERT INTO COACH (NAME, AGE, USERNAME, PASSWORD ) VALUES ('"+name+"',"+age+",'"+username+"','"+password+"')";
        int result = database.getInstance().update(query);
        
        
        return result;
    }
    
}
