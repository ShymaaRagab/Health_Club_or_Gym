/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllClasses;

import database.database;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

public class TimeLineChanged {
    public static void SubmitTesting(int checkSubmit){
        if(checkSubmit==1)
            Masseges.showInformationDialog("the element updated successfully");
        else
            Masseges.showErrorDialog("cannot update the element");
    }
    public void ChangeState(JLabel textTime,JSpinner timeValue){
        int getTime = (Integer) timeValue.getValue();
        if (getTime >= 0 && getTime <= 12) {
            textTime.setText(getTime + ":00Am");
        } else {
            textTime.setText((getTime - 12) + ":00Pm");
        }
    }
    public void setNewTimeLine(String username,JSpinner startTimeValue,JSpinner endTimeValue,JComboBox startDayValue,JComboBox endDayValue) throws SQLException{
           int id = 0;
            String dayFrom = startDayValue.getSelectedItem().toString();
            String dayTo = endDayValue.getSelectedItem().toString();
            int startTime = (Integer) startTimeValue.getValue();
            int endTime = (Integer) endTimeValue.getValue();
            ResultSet rs = database.getInstance().getRecords("SELECT COURSE_ID FROM COACH where NAME ='" +username+ "'");
            while (rs.next()) {
                id = rs.getInt("COURSE_ID");
            }
            int result = database.getInstance().update("update COURSE set START_TIME=" + startTime + ",END_TIME=" + endTime + ",DAY_FROM='" + dayFrom + "',DAY_TILL='" + dayTo + "' where COURSE_ID=" + id + "");
           SubmitTesting(result);
    }  
    
}
