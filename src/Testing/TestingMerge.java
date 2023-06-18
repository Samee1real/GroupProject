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
public class TestingMerge {
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
        This method works for any step expect 0 and below (I removed if statement, sortSort will never reach below 1, add if statement back if needed)
        */
        int step = (int)Math.pow(2, sortStep);//Convert sortStep into how long each side should be step 0->1 | 1->2 | 2->4
        for (int ls = 0; ls + step < placeOrder.size(); ls += step*2) {  //Traversing through each pair
            /*Hops from the start of leftside to the start of the next leftside | 'ls' will always be the start of current left side
            If there is no right side paired with a leftside, then there is no need to sort that pair | Only when a full leftside + at least one right*/
            int r = ls+step; 
            //Left Bound and Right Bound determines where each side ends 
            int lb = r; //Numerically = last index of left + 1 | This variable will change inside sub loop (Adding right side to left)
            int rb = r+step; //Numerically = last index of right + 1 | 
            if (rb > placeOrder.size()) {rb = placeOrder.size();} //There a chance that the right side isn't a full one
            for (int l = ls; l < lb && r < rb; l++) {
                /* How sides are sorted: Right side will be added to the left
                There is no reason left is choosen for the for loop | Once any of the two reaches their boundary, the loop ends*/
                if (placeOrder.get(r) > placeOrder.get(l)) {   //Order is largest to smallest
                    /*  Current right is > than left, therefore current right should be placed before the left                 
                    When the loop iterate again, the left index still should point to current left item
                    Therefore left will need to be incremented, which is done through the loop,
                    */
                    placeOrder.add(l,placeOrder.remove(r));
                    lb++; //Moving the right item will cause the left side to increase by one | therefore increase left bound by one | no need for right side
                    r++; //The next right index should be the item after current right | therefore increment the right side
                }
                /*Else 
                Current right < left, meaning current left > any right, therefore positions of current left is confirmed
                Move on to the next left item, which is done through loop
                */
            }
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
