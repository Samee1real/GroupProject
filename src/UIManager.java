/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Samee
 */
import java.awt.Container;
import java.awt.Font;
import java.time.Duration;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class UIManager {
                                                //Settings\\
    private static int battlePlaces = 8;
    private static final double easingThreadSpeed = 5;
    
                                             //Initalization\\
    
    
    
    
    public static void InitilizePosition(javax.swing.JLabel unit, javax.swing.JLabel arrow, int pos) 
    {
        positions[pos] = unit; 
        posArrows[pos][0] = arrow.getLocation().x; posArrows[pos][1] = arrow.getLocation().y;
        System.out.println(posArrows[pos][0] + " " + posArrows[pos][1]);
        arrow.setVisible(true);
    }
    public static void InitilizeMainArrows(javax.swing.JLabel red, javax.swing.JLabel blue)
    {
        redArrow = red; blueArrow = blue;
    }
    public static void InitilizeGUI(JLabel health, JLabel defence, JLabel speed)
    {
        healthLabel = health; defenceLabel = defence; speedLabel = speed;
    }
    public static void InitilizeHitButton(JButton button, int pos)
    {
        hitButtons.add(pos, button);
    }
    public static void InitilizeMoveButton(JButton button) 
    {
        moveButtons.add(button);
    }
    public static void InitilizeMoveInfo(JTextArea area) 
    {
        moveInfo = area;
    }
                                            //Unit Position Visuals\\
    private static javax.swing.JLabel[] positions = new javax.swing.JLabel[battlePlaces];
    
    public static void MovePosition(int pos, int location, double dur)
    {
        tweenLabelTask taskPlace = new tweenLabelTask(positions[pos], positions[location].getLocation().x, positions[location].getLocation().y, dur);
        taskPlace.start();
        int direction = 1;
        if (pos-location < 0) {direction = -1;}
        for (int i = location; i != pos; i += direction) {
            System.out.println(i + "Goes to" + (i+direction));
            tweenLabelTask task = new tweenLabelTask(positions[i], positions[i+direction].getLocation().x, positions[i+direction].getLocation().y, dur);
            task.start();
        }
    }
    
    public static void SwapPosition(int pos1, int pos2, int dur) 
    {
        /*
        
        */
        tweenLabelTask task1 = new tweenLabelTask(positions[pos1], positions[pos2].getLocation().x, positions[pos2].getLocation().y, dur);
        tweenLabelTask task2 = new tweenLabelTask(positions[pos2], positions[pos1].getLocation().x, positions[pos1].getLocation().y, dur);
        task1.start(); task2.start();
    }
    
                                              //Sorting Visuals\\
    private static int[][] posArrows = new int[battlePlaces][2];
    private static javax.swing.JLabel redArrow;
    private static javax.swing.JLabel blueArrow;
    
    public static void PositionArrow(String color, int pos)
    {
        javax.swing.JLabel arrow = redArrow;
        if (color.equals("Blue")) {arrow = blueArrow;}
        arrow.setLocation(posArrows[pos][0], posArrows[pos][1]);
    }
  
                                              //GUI Visuals\\
    
    private static JLabel healthLabel, defenceLabel, speedLabel;
    private static ArrayList<JButton> hitButtons = new ArrayList<JButton>();
    private static ArrayList<JButton> moveButtons = new ArrayList<JButton>();
    private static JTextArea moveInfo;
    
    public static void UpdateUnitInfo(Unit unit)
    {
        healthLabel.setText("Health: " + unit.health);
        defenceLabel.setText("Defence: " + unit.defence);
        speedLabel.setText("Speed: " + unit.speed);
    }
    public static void UpdateHitButtons(ArrayList<Integer> posList, boolean toggle) 
    {
        
        for (int i = 0; i < hitButtons.size(); i++) {
            boolean show = false;
            if (toggle) {
                for (Integer pos : posList) {
                    if (pos == i) {show = true;}
                }
            }
            hitButtons.get(i).setVisible(show);
        }
    }
    public static void UpdateMoveButtons(Unit unit)
    {
        for (int i = 0; i < moveButtons.size(); i++) {
            moveButtons.get(i).setVisible(true);
            if (i < unit.moveset.size()) {
                moveButtons.get(i).setText(unit.moveset.get(i).name + unit.id);
            } else 
            {moveButtons.get(i).setVisible(false);}
        }
        /*for (int i = 0; i < moveButtons.size() && i < unit.moveset.size() ; i++) {
            
                moveButtons.get(i).setText(unit.moveset.get(i).name + unit.id);

        }*/
    }
    public static void UpdateMoveInfo(Unit unit, Move move) 
    {
        if (MovesetModule.IsMoveAv1ailable(unit, move)) 
        {moveInfo.setText(move.desc);}
        else 
        {moveInfo.setText("This move is not available");}
    }
                                            //Easing and Tweening\\
                
    public static class tweenLabelTask extends Thread
    {
        private javax.swing.JLabel label;
        int goalX; int goalY;  
        double dur; 
        
        public tweenLabelTask(javax.swing.JLabel label, int goalX, int goalY, double dur)
        {
            this.label = label; this.dur = dur;
            this.goalX = goalX; this.goalY = goalY;
        }
        public void run()
        {
            System.out.println("STARTED");
            double time = 0;
            int startX = label.getLocation().x, startY = label.getLocation().y;
            while (time < dur) {
                //Incrementing/Waiting Time
                try {
                    Thread.sleep((long)easingThreadSpeed);    //Waiting thread time
                    time += easingThreadSpeed;  //This will increase time to update it
                } catch (InterruptedException ex) {
                    Logger.getLogger(UIManager.class.getName()).log(Level.SEVERE, null, ex);
                }
                //Updating location
                double easeTime = easeStyles("Quad", time/dur);
                int x = startX + (int)((goalX-startX)*easeTime);
                int y = startY + (int)((goalY-startY)*easeTime);
                label.setLocation(x, y);    
            }
        }
    }
    
    private static double easeStyles(String style, double x) 
    {
        if (style.equals("Quad")) {
            return x*x;
        }
        else if (style.equals("InSine")) {
            return 1 - Math.cos((x * Math.PI) / 2);
        }
        return 0;
        
    }
}
