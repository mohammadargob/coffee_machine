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
public class Machine {

    private WaterCapacity water;
    private BeansCapacity beans;
    private Clean clean;
    private Grinder grinder;
    private Logger log;

    Machine(Logger log) throws SQLException, ClassNotFoundException {
        this.log = log;
        this.water = new WaterCapacity();
        this.beans = new BeansCapacity();
        this.clean = new Clean();
        this.grinder = new Grinder();
    }

    Logger logger() {
        return log;
    }

    WaterCapacity Water() {
        return water;
    }

    BeansCapacity Beans() {
        return beans;
    }

    Clean clean() {
        return clean;
    }

    void displayinfo() {
        System.out.println("Water: " + water.getLevel());
        System.out.println("Beans: " + beans.getLevel());
        System.out.println("Clean: " + clean.getLevel());
    }

    void mackCaffee(String coffeeName, int waterAmount, int beansAmount, int cln, int grind) throws SQLException, ClassNotFoundException {
        grinder.grinder(grind);
        water.drain(waterAmount);
        beans.drain(beansAmount);
        clean.setLevel(clean.getLevel() - cln);
        log.log(coffeeName, water.getLevel(), beans.getLevel());
    }

}
