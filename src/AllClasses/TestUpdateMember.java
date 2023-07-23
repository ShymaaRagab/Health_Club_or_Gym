/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllClasses;


public class TestUpdateMember {
    public static void updateTesting(int checkUpdate){
        if(checkUpdate==1)
            Masseges.showInformationDialog("the element updated successfully");
        else
            Masseges.showErrorDialog("cannot update the element");
    }
}
