/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Testing;
import java.util.ArrayList;
/**
 *
 * @author Samee
 */
public class TestingSelection {
    public static int sortStep = 0;
    static ArrayList<Integer> placeOrder = new ArrayList<>();
    public static void Create() {
        placeOrder.add((int) (Math.random() * 10));
        placeOrder.add((int) (Math.random() * 10));
        placeOrder.add((int) (Math.random() * 10));
        placeOrder.add((int) (Math.random() * 10));
        placeOrder.add((int) (Math.random() * 10));
        placeOrder.add((int) (Math.random() * 10));
        placeOrder.add((int) (Math.random() * 10));
        placeOrder.add((int) (Math.random() * 10));
        placeOrder.add((int) (Math.random() * 10));   
        System.out.println("Inital");
        for (Integer i : placeOrder) 
        {
           System.out.print(i + "\t");
        }
        System.out.println("");
    }
    public static void Iterate() 
    {
        /*
        Everything before starting index(sortStep) is already sorted
        sortStep is iterated each turn
        Repeating on the same step won't mess stuff up
        The last index iterated won't be need to go through (last index)
        This sort method will need to check if step is inbound
        */
        if (sortStep < placeOrder.size()) {
            int max = sortStep;
            for (int current = sortStep+1; current < placeOrder.size(); current++) {
              int curVal = placeOrder.get(current); //Getting Unit's Order Value
              int maxVal = placeOrder.get(max);
              //If current < minimum then set current will be minimum for now
              if (curVal > maxVal)  {
                  max = current;
              }
            }
            Swap(sortStep, max);//Swapping 
            for (Integer i : placeOrder) 
            {
               System.out.print(i + "\t");
            }
            System.out.println("");
            sortStep++;
        }
        
    }
    
    private static void Swap(int a, int b)
    {
        Integer temp = placeOrder.get(a);
        placeOrder.set(a, placeOrder.get(b));
        placeOrder.set(b, temp);
    }
}
