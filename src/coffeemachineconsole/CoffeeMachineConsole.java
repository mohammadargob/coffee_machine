/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeemachineconsole;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author moham
 */
public class CoffeeMachineConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Machine machine= new Machine();
        while (true){
            
                try { 
            machine.displayinfo();
            System.out.println("a- Add Water\nb- Add Beans\nc- Clean\n1- Espresso\n2- Espresso Double\n3- Amricano\n4- Amricano Double\n5- Exit");
            Scanner input = new Scanner(System.in);
            System.out.print("Chose: ");
            char ch = input.next().charAt(0);
            if(ch =='1'){
                System.out.print("Grinder: ");
                int grinder = input.nextInt();
                    machine.Water().findWater(30);
                
                    machine.Beans().findBeans(7);
                
                    machine.clean().findClean(2);
                    machine.mackCaffee("Espresso",30,7,2,grinder);
                            
            }
            else if (ch =='2'){
                System.out.print("Grinder: ");
                int grinder = input.nextInt();
                    machine.Water().findWater(60);
                
                    machine.Beans().findBeans(14);
                
                    machine.clean().findClean(2);
                    machine.mackCaffee("Espresso",60,14,2,grinder);
            }
            else if (ch == '3'){
                System.out.print("Grinder: ");
                int grinder = input.nextInt();
                    machine.Water().findWater(170);
                
                    machine.Beans().findBeans(7);
                
                    machine.clean().findClean(2);
                    machine.mackCaffee("Espresso",170,7,2,grinder);
            }
            else if (ch == '4'){
                System.out.print("Grinder: ");
                int grinder = input.nextInt();
                    machine.Water().findWater(210);
                
                    machine.Beans().findBeans(14);
                
                    machine.clean().findClean(2);
                    machine.mackCaffee("Espresso",210,14,2,grinder);
            }
            else if (ch == '5'){
                    break;
                }
            else if (ch == 'a'){
                machine.Water().setLevel(5000);
            }
            else if (ch == 'b'){
                machine.Beans().setLevel(1000);
            }
            else if (ch == 'c'){
                machine.clean().setLevel(100);
            }
            } catch (WaterException ex) {
                    System.out.println("your haven't water");
                } catch (BeansException ex) {
                    System.out.println("yout haven't beans");
                } catch (CleanException ex) {
                    System.out.println("your machine need clean");
                }
        }
    } 
}
