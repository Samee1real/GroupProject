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
public class TestingInsertion {
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
          For each iterate, traverse backwards to find item > starting item 
          If none found that item is the largest in array
          The first index iterated won't be need to go through (index 0)
          This sort method will need to check if step is inbound
        */
        if (sortStep+1 < placeOrder.size()) {
            for (int i = sortStep+1; i > 0; i--) {
                if (placeOrder.get(i) > placeOrder.get(i-1)) {
                    Swap(i, i-1);//Swap
                }
            }
            for (Integer i : placeOrder) 
            {
               System.out.print(i + "\t");
            }
            System.out.println("");
            sortStep++;
        }
        
        /*if (sortStep < placeOrder.size()) {//Ignore first index (0)
            int orderVal = placeOrder.get(sortStep);
            for (int current = sortStep+1; current >= 0; current--) {
                int curVal = placeOrder.get(current);
                if (curVal > orderVal) {
                    Swap(sortStep, current+1);//Swap
                }
            }
            //Item is the highest, swap with first index
            Swap(sortStep, 0);
            for (Integer i : placeOrder) 
            {
               System.out.print(i + "\t");
            }
            System.out.println("");
            sortStep++;
        }*/
    }
    private static void Swap(int a, int b)
    {
        Integer temp = placeOrder.get(a);
        placeOrder.set(a, placeOrder.get(b));
        placeOrder.set(b, temp);
    }
}
