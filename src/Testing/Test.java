package Testing;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Samee
 */
public class Test {
    public static ArrayList<Integer> placeOrder = new ArrayList<>();
    
    private static ArrayList<ArrayList<Integer>> parseGroups = new ArrayList<>();  //Look into below function for desc
    private static void addParseInfo(ArrayList<ArrayList<Integer>> array, int start, int end)
    {
        /*How parseGroups work:
        This arraylist is used to keep track of how quickSort divides the main array with each pivot
        The integer array should only contain two integers:
        start- the point where the group starts
        end- the point where the group ends
        */
        ArrayList<Integer> info = new ArrayList<>();
        info.add(start); info.add(end);
        array.add(info);
    }

    public static void Start() 
    {
        placeOrder.add(8);
        placeOrder.add(2);
        placeOrder.add(5);
        placeOrder.add(3);
        placeOrder.add(9);
        placeOrder.add(4);
        placeOrder.add(7);
        placeOrder.add(6);
        placeOrder.add(1);
        addParseInfo(parseGroups, 0, placeOrder.size()-1);  //Adds placeOrder
        for (Integer i : placeOrder) {
            System.out.print(i + "\t");
        }
        System.out.println("");
    }
    public static void Iterate() 
    {  
        /*

        */
        ArrayList<ArrayList<Integer>> newGroups = new ArrayList<>();
        for (ArrayList<Integer> parseInfo : parseGroups) {
            if (parseInfo.get(0) < parseInfo.get(1)) {  //base case
                int pivot = parseInfo.get(1), pivotValue = placeOrder.get(pivot); 
                int left = parseInfo.get(0);

                for (int i = left; i < pivot; i++) {
                    if (placeOrder.get(i) > pivotValue) {  
                        Integer temp = placeOrder.get(i);
                        placeOrder.set(i, placeOrder.get(left));
                        placeOrder.set(left, temp);
                        left++;
                    }
                }
               
                Integer temp = placeOrder.get(pivot);
                placeOrder.set(pivot, placeOrder.get(left));
                placeOrder.set(left, temp);
                //Add to groups
                addParseInfo(newGroups, parseInfo.get(0), left-1);
                addParseInfo(newGroups, left+1, parseInfo.get(1));
            }
        }
        
        parseGroups = newGroups;
        
        for (Integer i : placeOrder) {
            System.out.print(i + "\t");
        }
        System.out.println("");
    }
}
