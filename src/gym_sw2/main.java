
package gym_sw2;

import AllGui.login;
import java.awt.*;
import java.sql.*;


/**
 *
 * @author dell
 */

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
       

        AllGui.login frame2=new login();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        frame2.setLocation(dimension.width/2-frame2.getSize().width/2, dimension.height/2-frame2.getSize().height/2);
        
        frame2.setVisible(true);  
        
    }
    
}

