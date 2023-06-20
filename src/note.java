
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
}
