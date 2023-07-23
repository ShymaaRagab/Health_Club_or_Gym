
package AllClasses;

import database.database;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

public class CoachSendingMassage {
    
    public static void SubmitSending(int checkSending){
        if(checkSending!=1){
                Masseges.showInformationDialog("Successfully send");
                
            }else{
                Masseges.showErrorDialog("Invalid send");
            }
    }
    
    public void sendMassage(String name,JTextArea massageCoach) throws SQLException{
        String sql="update MEMBER set MASSAGE='"+massageCoach.getText()+"' where COACH_NAME='"+name+"'";
            int result= database.getInstance().update(sql);
            SubmitSending(result);
    }
    
}
