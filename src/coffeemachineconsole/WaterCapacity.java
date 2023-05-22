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
public class WaterCapacity {
     private int level;
    
    WaterCapacity() throws SQLException, ClassNotFoundException{
        level = new DBLogger().Water();
    }
    int getLevel(){
        return level;
    }
    void setLevel(int amount){
        level=amount;
    }
    void drain(int amount){
        level-=amount;
    }
    void fill(){
        level = 5000;
    }
    boolean findWater(int amount) throws WaterException{
        if (level < amount){
            throw new WaterException("Your haven;t Water");
        }
        return false;
    }
}
