/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Samee
 */
import java.time.Duration;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UIManager {
                                                //Settings\\
    private static int battlePlaces = 8;
    private static final double easingThreadSpeed = 100;
    
                                             //Initalization\\
    
    private static javax.swing.JLabel[] positions = new javax.swing.JLabel[battlePlaces];
    
    public static void AddLabelPosition(javax.swing.JLabel label, int pos) 
    {
        positions[pos] = label;
    }
    
    public static void SwapPosition(int pos1, int pos2, int dur) 
    {
        /*
        
        */
        
        //tweenLabel(positions[pos1], positions[pos2].getLocation().x, positions[pos2].getLocation().y, dur);
    }
    
    /*      Easing labels is not possible
    
    The labels update location after the method is done, so you can't really ease them, and idk how to do a subroutine 
            
    private static void tweenLabel(javax.swing.JLabel label, int goalX, int goalY, double dur)
    {
        double time = 0;
        int startX= label.getLocation().x, startY = label.getLocation().y;
        while (time < dur) {
            try {
                Thread.sleep((long)easingThreadSpeed);    //Waiting thread time
                time += easingThreadSpeed;  //This will increase time to update it
            } catch (InterruptedException ex) {
                Logger.getLogger(UIManager.class.getName()).log(Level.SEVERE, null, ex);
            }
            //Updating location
            double easeTime = easeStyles("Quad", time/dur);
            int x = startX + (int)(goalX*easeTime);
            int y = startY + (int)(goalY*easeTime);
            System.out.println("X: " +x+ " Y: "+y);
            label.setLocation(x, y);
        }
        System.out.println("Done");
        //label.setLocation(goalX, goalY);
    }
    
    private static double easeStyles(String style, double x) 
    {
        if (style.equals("Quad")) {
            return x*x;
        }
        return 0;
    }*/
}
