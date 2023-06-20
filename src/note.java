
import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saliy5109
 */
public class note {
    public static class JambleButton extends Thread
    {
        private String letterPool = 
        "1234567890-=`qwertyuiopasdfghjkl;zxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        private JButton button;
        private String finalText;
        private double dur; 
        
        public JambleButton(JButton button, String text, double dur)
        {
            this.button = button; this.dur = dur; finalText = text; 
        }
        public void run()
        {
            int numOfLetters = finalText.length();
            double time = 0;
            long threadSpeed; //= (long)easingThreadSpeed
            while (time < dur) {
                try {
                    Thread.sleep(threadSpeed);    //Waiting thread time
                    time += threadSpeed;  //This will increase time to update it
                    threadSpeed *= 1.1;
                } catch (InterruptedException ex) {
                    Logger.getLogger(UIManager.class.getName()).log(Level.SEVERE, null, ex);
                }
                String text = "";
                for (int i = 0; i < numOfLetters; i++) {
                    int ran = (int)(Math.random()*letterPool.length());
                    text += letterPool.substring(ran, ran+1);
                }
                button.setText(text);
            }
            button.setText(finalText);
        }
    }
    private static ArrayList<Point> labelLocations = new ArrayList<battlePlaces>();
    private static ArrayList<JLabel> positionLabels = new ArrayList<battlePlaces>(); //if u do labelOrder this will be useless
    private static ArrayList<Unit> labelUnits = new ArrayList<battlePlaces>();    //index 0 is label 1
    //HAVE A LABEL ARRAYLIST JUST LKE PLACE ORDER, WHENEVER PLACEORDER IS UPDATED, THIS IS ALSO UPDATED (labelOrder)

    //swap
    /* get position from place Order
    TweenLabelTask(labelOrder.get(pos1), labelLocations.get(pos2), dur);
    TweenLabelTask(labelOrder.get(pos2), labelLocations.get(pos1), dur);
    */
    
    public static class TweenLabelTask extends Thread
    {
        private JLabel label;
        Point goal;
        double dur; 
        
        public TweenLabelTask(javax.swing.JLabel label, Point point, double dur)
        {
            this.label = label; this.dur = dur;
            goal = point;
            Systm.out.println("goal x is " + goal.x + " given has " + point.x);
        }
        public void run()
        {
            System.out.println("STARTED");
            double time = 0;
            Point start = label.getLocation();
            System.out.println("start is  " +  start);
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
                int x = start.x + (int)((goal.x-start.x)*easeTime);
                int y = start.y + (int)((goal.y-start.y)*easeTime);
                label.setLocation(x, y);    
            }
        }
    }
}
