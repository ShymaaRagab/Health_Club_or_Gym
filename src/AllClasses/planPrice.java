/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllClasses;

import java.sql.SQLException;
import database.database;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class planPrice extends Price{
    
    
    private String query;

    @Override
    public int changePrice(int bPlan, int newPrice) throws SQLException {
        query = "UPDATE BILLING SET  PRICE = "+newPrice+" WHERE B_PLAN = "+bPlan+"";
        int result = database.getInstance().update(query);
        return result;
    }

    @Override
    public int getPrice(int bPlan) throws SQLException {
        query = "SELECT PRICE FROM BILLING WHERE B_PLAN = "+bPlan+" ";
        ResultSet rs =  database.getInstance().getRecords(query);
        int price=0;
        while(rs.next()){
            String str = rs.getString("PRICE");
            price = Integer.parseInt(str);

        }
        return price;
    }
    public ArrayList<String> showPrices() throws SQLException{
    
        ArrayList<String> arrayList = new ArrayList<>();
        query = "SELECT * FROM ROOT.BILLING";
        int counter = 0;
        ResultSet rs = database.getInstance().getRecords(query);
        while(rs.next()){
            arrayList.add(counter,""+rs.getInt("B_PLAN"));
            counter++;
            arrayList.add(counter,""+rs.getInt("NO_MONTHS"));
            counter++;
            arrayList.add(counter,""+rs.getInt("PRICE"));
            counter++;
        }
        return arrayList;}
}
