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
public abstract class Price {
    
            public abstract int changePrice(int bPlan, int newPrice) throws SQLException;
            public abstract int getPrice(int bPlan) throws SQLException;

}
