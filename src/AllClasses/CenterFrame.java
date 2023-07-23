/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllClasses;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author dell
 */
public class CenterFrame {
    
        public static void setCenterScreen(JFrame frame1,JFrame frame2) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        frame2.setLocation(dimension.width/2-frame2.getSize().width/2, dimension.height/2-frame2.getSize().height/2);
        frame1.dispose();
        frame2.setVisible(true);
    }
}
