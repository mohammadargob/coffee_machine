/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeemachineconsole;

/**
 *
 * @author moham
 */
public class WaterCapacity {
     private int level;
    
    WaterCapacity(){
        level = 5000;
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
        level = 1000;
    }
    boolean findWater(int amount) throws WaterException{
        if (level < amount){
            throw new WaterException("Your haven;t Beans");
        }
        return false;
    }
}
