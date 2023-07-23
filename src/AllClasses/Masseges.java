/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllClasses;

import javax.swing.JOptionPane;

public class Masseges {
    
    public static final String errorEmptyField = "Empty field";
    public static final String errorUpdatingDatabase = "Error during updating the database";
    
    public static void showErrorDialog(String errorMessage) {
        JOptionPane.showMessageDialog(null,errorMessage,"Error",JOptionPane.ERROR_MESSAGE);
    }
    
    public static void showInformationDialog(String informationMessage) {
        JOptionPane.showMessageDialog(null,informationMessage,"Information",JOptionPane.INFORMATION_MESSAGE);
    }
}
