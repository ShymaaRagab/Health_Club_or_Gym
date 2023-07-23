/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllClasses;

import database.database;
import java.sql.*;
import java.util.ArrayList;
public class ShowMember {
    
     private String query;
     
       public ArrayList<String> showMember() throws SQLException{

    ArrayList<String> arrayList = new ArrayList<>();
    query = "SELECT * FROM ROOT.MEMBER";

    int counter = 0;
    ResultSet rs = database.getInstance().getRecords(query);
    String str = null;
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
    }
    return arrayList;        
    }
     
    public ArrayList<String> Member(String username)throws SQLException {
         int course_id=0;
            ArrayList<String> memberData = new ArrayList<>();
            String sql="SELECT * FROM MEMBER WHERE USERNAME='"+username+"'";
           
            ResultSet memberRecord= database.getInstance().getRecords(sql);
            int counter = 0;
            
                while(memberRecord.next()){
                memberData.add(counter,""+memberRecord.getInt("ID"));
                counter++;
                memberData.add(counter, memberRecord.getString("NAME"));
                counter++;
                memberData.add(counter, ""+memberRecord.getInt("AGE"));
                counter++;
                memberData.add(counter, username);
                counter++;
                memberData.add(counter, memberRecord.getString("ENDDATE"));
                course_id= memberRecord.getInt("COURSE_ID");
                counter++;
                memberData.add(counter, memberRecord.getString("COACH_NAME"));
                counter++;
                memberData.add(counter,memberRecord.getString("MASSAGE"));
                counter++;}
                ArrayList<String> courseData = new ArrayList<>();
                courseData=GetCourseRecord(course_id);
                memberData.addAll(courseData);
        return memberData;       
    }
    
 public ArrayList<String> GetCourseRecord(int id)throws SQLException {
             
            int counter=0;
            ArrayList<String> arrayList = new ArrayList<>();
            String sql;
            sql="SELECT * FROM COURSE WHERE COURSE_ID="+id+"";
                   ResultSet courseRecord= database.getInstance().getRecords(sql);
             while(courseRecord.next()){
                   arrayList.add(counter, courseRecord.getString("DAY_FROM"));
                   counter++;
                   arrayList.add(counter, courseRecord.getString("DAY_TILL"));
                   counter++;
                   arrayList.add(counter,"" + courseRecord.getInt("START_TIME"));
                   counter++;
                   arrayList.add(counter,"" +courseRecord.getInt("END_TIME"));
                   counter++;
             }
     return arrayList;
 }


public ArrayList<String> memberr(String username)throws SQLException {
         int course_id=0;
            ArrayList<String> arrayList = new ArrayList<>();
            String sql="SELECT * FROM MEMBER WHERE NAME='"+username+"'";
            ResultSet rs= database.getInstance().getRecords(sql);
            int counter = 0;
            
                while(rs.next()){
                arrayList.add(counter,""+rs.getInt("ID"));
                counter++;
                arrayList.add(counter,rs.getString("NAME"));
                counter++;
                arrayList.add(counter, ""+rs.getInt("AGE"));
                counter++;
                arrayList.add(counter, username);
                //arrayList.add(counter, rs.getString("USERNAME"));
                counter++;
                arrayList.add(counter, rs.getString("ENDDATE"));
                course_id= rs.getInt("COURSE_ID");
                counter++;
                arrayList.add(counter, rs.getString("COACH_NAME"));
                counter++;
                arrayList.add(counter,rs.getString("MASSAGE"));
                counter++;}
             
                   sql="SELECT * FROM COURSE WHERE COURSE_ID="+course_id+"";
                   ResultSet rs2= database.getInstance().getRecords(sql);
             while(rs2.next()){
                   arrayList.add(counter, rs2.getString("DAY_FROM"));
                   counter++;
                   arrayList.add(counter, rs2.getString("DAY_TILL"));
                   counter++;
                   arrayList.add(counter,"" + rs2.getInt("START_TIME"));
                   counter++;
                   arrayList.add(counter,"" +rs2.getInt("END_TIME"));
                   counter++;
             }
        return arrayList;    
    
    }
  
}
