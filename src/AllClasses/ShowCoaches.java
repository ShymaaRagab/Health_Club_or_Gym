/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllClasses;

import database.database;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class ShowCoaches implements IshowCoach {
    
    private String query;
    
    public ArrayList<String> showCoaches() throws SQLException{

    ArrayList<String> arrayList = new ArrayList<>();
    query = "SELECT * FROM ROOT.COACH";
    int counter = 0;
    ResultSet rs = database.getInstance().getRecords(query);
    while(rs.next()){
        arrayList.add(counter,""+rs.getInt("ID"));
        counter++;
        arrayList.add(counter,rs.getString("NAME"));
        counter++;
        arrayList.add(counter,""+rs.getInt("AGE"));
        counter++;
    }
    return arrayList;        
    }
    
}
