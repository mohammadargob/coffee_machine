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
public class Clean {
     private int level;
    
    Clean(){
        level = 100;
    }
    int getLevel(){
        return level;
    }
    void setLevel(int amount){
        level=amount;
    }
    void clean(){
        level = 100;
    }
    boolean findClean(int amount) throws CleanException{
        if (level < amount){
            throw new CleanException("Your haven;t Beans");
        }
        return false;
    }

}
