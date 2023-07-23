/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllClasses;

import java.sql.*;
import java.text.*;
import java.util.ArrayList;
import java.util.Date;
import database.database;

public class adminTasks {
    private String query;
    private SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
    
    
    public adminTasks(){
    }
    
     public static adminTasks admin;

    
    public static adminTasks getInstance() throws SQLException {
        if(admin == null)
            admin = new adminTasks();
        
        return admin;    
    }
    public String getEndDate(int bPlan){
    
        long x = (long) System.currentTimeMillis();
        
        switch(bPlan){
            case 1:
                x+=2.628*Math.pow(10,9);
                break;
            case 2:
                x +=7.884*Math.pow(10,9);
                break;
            case 3:
                x +=1.577*Math.pow(10,10);
                break;
            case 4:
                x +=3.154*Math.pow(10,10);
                break;
            default:
                break;
        }
        
        java.util.Date date = new java.util.Date(x);
        String endDate = formatter.format(date).toString();
        
        return endDate;
        
    }
 public void addMember( String name, int age, String username, String password, int bPlan) throws SQLException{
        
        Date date = new Date();
        String startDate = formatter.format(date).toString();
        String endDate = admin.getEndDate(bPlan);
        
        query = "INSERT INTO MEMBER (NAME, AGE, USERNAME, PASSWORD, B_PlAN, STARTDATE, ENDDATE) VALUES ('"+name+"',"+age+",'"+username+"','"+password+"',"+bPlan+",'"+startDate+"','"+endDate+"')";
        
        int result = database.getInstance().update(query);
        
        System.out.println(result);
        // return result;
    }
    public int assignCoach(int memberID, int coachID) throws SQLException{
    
        query = "SELECT COURSE_ID FROM COACH WHERE ID = "+coachID+" ";
        
        String query1 = "SELECT NAME FROM COACH WHERE ID = "+coachID+" ";

        ResultSet rs =  database.getInstance().getRecords(query);
        int courseId=0;
        while (rs.next()) {
            String str = rs.getString("COURSE_ID");
             courseId = Integer.parseInt(str);
        }
        rs =  database.getInstance().getRecords(query1);
        String str = null;
        while (rs.next()) {
             str = rs.getString("NAME");
        }
        
        query = "UPDATE MEMBER SET  COURSE_ID = "+courseId+" WHERE ID = "+memberID+"";
        query1 = "UPDATE MEMBER SET  COACH_NAME = '"+str+"' WHERE ID = "+memberID+"";

        int result = database.getInstance().update(query);
        int result1 = database.getInstance().update(query1);
        return result;
    }
    
    public String oldPass(int coachID, String table) throws SQLException{
    
        query = "SELECT PASSWORD FROM ROOT."+table+" WHERE ID ="+coachID+"";
        ResultSet rs =  database.getInstance().getRecords(query);
        String password = null;
        while(rs.next()){
            password = rs.getString("PASSWORD"); 
        }
        
        return password;
    }
   
    public ArrayList<String> searchUpdateAdmin (String username,String pass) throws SQLException{
    
        int counter = 0;
        ArrayList<String> arrayList = new ArrayList<>();
        query = "SELECT * FROM ROOT.ADMIN WHERE USERNAME = '"+username+"' AND PASSWORD = '"+pass+"'";
        
        ResultSet rs = database.getInstance().getRecords(query);

        while(rs.next()){
            arrayList.add(counter,""+rs.getInt("ID"));
            counter++;
            arrayList.add(counter,rs.getString("NAME"));
            counter++;
            arrayList.add(counter,""+rs.getInt("AGE"));
            counter++;
            arrayList.add(counter,rs.getString("USERNAME"));
            counter++;
        }
        return arrayList;
    
    }

}
