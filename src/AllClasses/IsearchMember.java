/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllClasses;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public interface IsearchMember extends Search{
    public ArrayList<String> searchMember(int meberID) throws SQLException;
}
