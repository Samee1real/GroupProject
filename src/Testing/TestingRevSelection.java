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
public class TestingRevSelection {
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
    public static void Iterate() {
        /*
          Everything after starting index(sortStep) is already sorted
          The last index iterated won't be need to go through (index size-1)
          This sort method will need to check if step is inbound
        */
        if (sortStep < placeOrder.size()) {
            int min = placeOrder.size()-1-sortStep;
            for (int current = min-1; current >= 0; current--) {
                int curVal = placeOrder.get(current); //Getting Unit's Order Value
                int minVal = placeOrder.get(min);
                //If current > maximum then set current will be maximum for now
                if (curVal < minVal)  {
                    min = current;
                }
            }
            Swap(placeOrder.size()-1-sortStep, min);//Swap
            
        }
        for (Integer i : placeOrder) 
        {
           System.out.print(i + "\t");
        }
        System.out.println("");
        sortStep++;
    }
    private static void Swap(int a, int b)
    {
        Integer temp = placeOrder.get(a);
        placeOrder.set(a, placeOrder.get(b));
        placeOrder.set(b, temp);
    }
}
