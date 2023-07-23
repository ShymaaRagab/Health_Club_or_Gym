/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllClasses;

import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class MemberPlan {
    
     public int memberBPlan(String memberPlan) throws SQLException{
        int bPlan = 0;
                switch (memberPlan){
                    case "Silver (1 Month)":
                        bPlan = 1;
                        break;
                    case "Gold (3 Months)":
                        bPlan = 2;
                        break;
                    case "Platinum (6 Months)":
                        bPlan = 3;
                        break;
                    case "Diamond (12 Months)":
                        bPlan = 4;
                        break;
                    default:
                        break;
            }
        return bPlan;
    }
    
    
}
