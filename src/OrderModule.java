
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Samee
 */
public class OrderModule {
                                        //Settings\\
    
    public static final int battlePlaces = 8;
    
                                    //Placement Order\\
    private static ArrayList<Unit> placeOrder = new ArrayList<Unit>(battlePlaces);
    public static void AddUnit(Unit unit, int pos)
    {
        placeOrder.add(pos, unit);
    }
    public static int GetUnitPlace(Unit unit)
    {
        /*
        Used to just get the positions of Units
        */
        for (int i = 0; i < battlePlaces; i++) {
            if (placeOrder.get(i).equals(unit)) {
                return i;
            }
        }
        return -1;
    }
    public static Unit GetUnitAtIndex(int index)
    {
        return placeOrder.get(index);
    }
    public static Unit GetUnitByValue(int value)
    {
        for (Unit unit : placeOrder) {
            if (unit.orderValue == value) {return unit;}
        }
        return new Unit();
    }
    public static void ResetPlaceOrder() 
    {
        /*
        Sets the placement order array to null
        */
        placeOrder = new ArrayList<Unit>(battlePlaces);
    }
    public static void ScrambleOrder()
    {
        /*
            This will scramble the Place Order Array randomly
        */
        for (int count = 0; count < battlePlaces*2; count++)
        {
            int place1 = (int)(Math.random()*battlePlaces);
            int place2 = (int)(Math.random()*battlePlaces);
            SwapUnitPositions(place1, place2); //Swap
        }
    }
    
                                 //Sorting Methods\\
    
    private static int sortStep = 0;//Used keep track of their sorting steps from turn to turn
    private static String sortMethod = "Selection";  //Keeps track of which sorting method is being used
    public static void SetSortMethod(String method)
    {

        /*
        This will set the current sort order according to given order
        And resets the sortstep since we are switching methods
         */
        sortMethod = method;
    }
    public static void IterateSort()
    {
        /*
        This will iterate one step in the current sort order and update the visuals
        */
        SelectionSort method;
        switch (sortMethod) {
            case "Selection":
                method = new SelectionSort();
                break;
            /*case "ReverseSelection":
                method = new ReverseSelectionSort();
                break;*/
            case "Insertion":
                method = new InsertionSort();
                break;
            case "Merge":
                method = new MergeSort();
                break;
            case "Quick":
                method = new QuickSort();
                break;
            default:
                method = new SelectionSort();
                break;
        }
        method.start();
    }
    /*
        Empty constructers will be used to store which method is being used
        When iterate method is called, it should overide according to correct method
        The step variable is used by all sorts to keep track of their step
    */
    private static class SelectionSort extends Thread {
        /*
            This will be the default that other sorts will extend off
            The basic sorting method would start from the left and go to the right. 
            You will start off with this in the tutorial/beginning, therefore it's the default
            Easiest to understand and slowest method
        */
        public SelectionSort() {}
        public void run() 
        {
            /*
            Everything before starting index(sortStep) is already sorted
            sortStep is iterated each turn
            Repeating on the same step won't mess stuff up
            The first index iterated won't be need to go through (0)
            This sort method will need to check if step is inbound
            */
            if (sortStep < placeOrder.size()) {
                int max = sortStep;
                UIManager.ToggleArrow("Red", true);
                UIManager.ToggleArrow("Blue", true);
                for (int current = sortStep+1; current < placeOrder.size(); current++) {   //Skips index 0
                    int curVal = GetOrderValueOfIndex(current); //Getting Unit's Order Value
                    int maxVal = GetOrderValueOfIndex(max);
                    //If current < minimum then set current will be minimum for now
                    UIManager.PositionArrow("Blue", current);
                    UIManager.PositionArrow("Red", max);
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(OrderModule.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (curVal > maxVal)  {
                        max = current;
                        //UIManager.ToggleArrow("Red", false);
                    }      
                    UIManager.PositionArrow("Red", max);
                    try {
                        Thread.sleep(150);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(OrderModule.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (sortStep != max) {
                    SwapUnitPositions(sortStep, max);//Swapping 
                }
                UIManager.ToggleArrow("Red", false);
                UIManager.ToggleArrow("Blue", false);
            }
            sortStep++;
        }
    }
    private static class ReverseSelectionSort extends SelectionSort{
      /*
        Instead of starting at 0, start at end and work your way left instead of right
        This doeesn't change the end result, it will still be min -> max
      */
      public ReverseSelectionSort(){}
      @Override public void run() {
        /*
          Everything after starting index(sortStep) is already sorted
          The last index iterated won't be need to go through (index size-1)
          This sort method will need to check if step is inbound
        */
        if (sortStep < placeOrder.size()) {
            int min = placeOrder.size()-1-sortStep;
            for (int current = min-1; current >= 0; current--) {
                int curVal = GetOrderValueOfIndex(current); //Getting Unit's Order Value
                int minVal = GetOrderValueOfIndex(min);
                //If current > maximum then set current will be maximum for now
                if (curVal < minVal)  {
                    min = current;
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(OrderModule.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (sortStep != min) {
                SwapUnitPositions(sortStep, min);//Swapping 
            }
        }
      }
    }
    private static class InsertionSort extends SelectionSort{
        /* 
        Units on the right would stay there much longer than units on the left.
        */
        public InsertionSort() {}
        @Override public void run()
        {
            /*
              For each iterate, traverse backwards to find item > starting item 
              If none found that item is the largest in array
              The first index iterated won't be need to go through (index 0)
              This sort method will need to check if step is inbound
            */
            if (sortStep+1 < placeOrder.size()) {
                UIManager.ToggleArrow("Red",true);
                UIManager.ToggleArrow("Blue",true);
                for (int i = sortStep+1; i > 0; i--) { //Ignore first index (0)
                    UIManager.PositionArrow("Blue", i);
                    UIManager.PositionArrow("Red", i-1);
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(OrderModule.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (GetOrderValueOfIndex(i) > GetOrderValueOfIndex(i-1)) {
                        UIManager.PositionArrow("Red", i);
                        SwapUnitPositions(i, i-1);//Swap
                    }
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(OrderModule.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                UIManager.ToggleArrow("Red",false);
                UIManager.ToggleArrow("Blue",false);
            }
            sortStep++;
        }
    }
    private static class MergeSort extends SelectionSort {
        /*
        Merge sort would kind of be a wild/risky method, since the start they wouldn’t move much. 
        But with time the changes wil exponentially.
        */
        public MergeSort() {}
        @Override public void run() 
        {
            /*
            This method works for any step expect 0 and below (I removed if statement, sortSort will never reach below 1, add if statement back if needed)
            */
            UIManager.ToggleArrow("Red", true);
            UIManager.ToggleArrow("Blue", true);
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
                    UIManager.PositionArrow("Red", l);
                    UIManager.PositionArrow("Blue", r);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(OrderModule.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    /* How sides are sorted: Right side will be added to the left
                    There is no reason left is choosen for the for loop | Once any of the two reaches their boundary, the loop ends*/
                    if (GetOrderValueOfIndex(r) > GetOrderValueOfIndex(l)) {   //Order is largest to smallest
                        /*  Current right is > than left, therefore current right should be placed before the left                 
                        When the loop iterate again, the left index still should point to current left item
                        Therefore left will need to be incremented, which is done through the loop,
                        */
                        placeOrder.add(l,placeOrder.remove(r));
                        UIManager.MovePosition(l, r, 400);
                        //UIManager.labelOrder.add(1, UIManager.labelOrder.remove(r)); //Updating Label Positions as well
                        lb++; //Moving the right item will cause the left side to increase by one | therefore increase left bound by one | no need for right side
                        r++; //The next right index should be the item after current right | therefore increment the right side
                    }
                    /*Else 
                    Current right < left, meaning current left > any right, therefore positions of current left is confirmed
                    Move on to the next left item, which is done through loop
                    */
                    try {
                        Thread.sleep(400);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(OrderModule.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            sortStep++;
            UIManager.ToggleArrow("Red", false);
            UIManager.ToggleArrow("Blue", false);
        }
    }
    private static class QuickSort extends SelectionSort
    {
        /*
        This method will be one of the fastest, and because of it's nature, it will always place the last unit in it's correct position first
        Each iteration/turn will be a complete sort of that pivot 
        Pivot will be placed at the end.
        */
        private ArrayList<ArrayList<Integer>> parseGroups = new ArrayList<>();  //Look into below function for desc
        private void addParseInfo(ArrayList<ArrayList<Integer>> array, int start, int end)
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
        
        public QuickSort() 
        {
            addParseInfo(parseGroups, 0, placeOrder.size()-1);  //Adds placeOrder
        }
        @Override public void run() 
        {  
            ArrayList<ArrayList<Integer>> newGroups = new ArrayList<>();
            
            for (ArrayList<Integer> parseInfo : parseGroups) {
                if (parseInfo.get(0) < parseInfo.get(1)) {  //base case
                    int pivot = parseInfo.get(1), pivotValue = GetOrderValueOfIndex(pivot); 
                    int left = parseInfo.get(0);

                    for (int i = left; i < pivot; i++) {
                        if (GetOrderValueOfIndex(i) > pivotValue) {
                            SwapUnitPositions(i, left);
                            left++;
                        }
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(OrderModule.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    SwapUnitPositions(pivot, left);
                    //Add to groups
                    addParseInfo(newGroups, parseInfo.get(0), left-1);
                    addParseInfo(newGroups, left+1, parseInfo.get(1));
                }
            }
            parseGroups = newGroups; //Apply new groups
        }
    }
    /*private static class BubbleSort extends SelectionSort{        EXTRA FEATURE
        /* 
        Units with a higher index value gets sent to the correct place in the order
        
        public BubbleSort() {}
        @Override public void Iterate()
        {
        
        }
    }*/
   
                                  //Functions For Sorting\\
    
    private static int GetOrderValueOfIndex(int index) {
        /*
        Finds the Unit in placeOrder by the passed index 
        Return the order value(the value that will be used when sorting places
        If it's null at given index, the order value is the last index (length-1)
        */
        int orderVal = placeOrder.size()-1;
        if (placeOrder.get(index) != null) {orderVal = placeOrder.get(index).orderValue;}
        else {System.out.println("NOT HERE");}
        return orderVal;
    }
    
    private static void SwapUnitPositions(int a, int b) {
        /*
        This will swap the Units of the given indexs in Placement Order
        */
        if (a != b) {
            Unit temp = placeOrder.get(a);
            placeOrder.set(a, placeOrder.get(b));
            placeOrder.set(b, temp);
            UIManager.SwapPosition(a, b, 200);
            UIManager.SwapLabelOrderPositions(a, b);
        }
    }
}
