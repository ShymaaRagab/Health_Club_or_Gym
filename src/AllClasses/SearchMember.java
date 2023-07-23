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
public class SearchMember {
    
    
    private String query;
    
        public ArrayList<String> searchMember(int meberID) throws SQLException{
    
        int counter = 0;
        ArrayList<String> arrayList = new ArrayList<>();
        query = "SELECT * FROM ROOT.MEMBER WHERE ID = "+meberID+"";

        ResultSet rs = database.getInstance().getRecords(query);

        while(rs.next()){
            arrayList.add(counter,""+rs.getInt("ID"));
            counter++;
            arrayList.add(counter,rs.getString("NAME"));
            counter++;
            arrayList.add(counter,""+rs.getInt("AGE"));
            counter++;
            arrayList.add(counter,rs.getString("COACH_NAME"));
            counter++;        
            arrayList.add(counter,rs.getString("ENDDATE"));
            counter++;
            arrayList.add(counter,rs.getString("USERNAME"));
            counter++;
        }
       
        return arrayList;
    }
    
}
