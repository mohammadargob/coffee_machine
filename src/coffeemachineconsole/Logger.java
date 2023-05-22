/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeemachineconsole;

import java.sql.SQLException;

/**
 *
 * @author moham
 */
public interface Logger {
    public void log(String coffeename , int water , int beans)throws ClassNotFoundException, SQLException;

  
    
}
