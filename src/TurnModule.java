/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saliy5109
 */

import java.util.ArrayList;

public class TurnModule {
                                    //Settings\\
    
    private static final int battlePlaces = 8;
    
                                //Module Variables\\
    
    public static int round = 1;     
    
                                  //Turn Order\\
    
    private static ArrayList<Unit> turnOrder = new ArrayList<Unit>();
    
    public static void AddToTurnOrder(Unit unit) 
    {
        /*
        Adds passed Unit to the end of turnOrder
        */
        turnOrder.add(unit);
    }
    public static void ResetTurnOrder()
    {
        /*
        Sets the turnOrder array to null
        */
        turnOrder = new ArrayList<Unit>();
    }
    
    public static void UpdateTurnOrder()
    {
        /*
        This will update the turn order according to values. 

        The first index unit will have it’s Unit Class hasTurn set to true. The others false.
        hasTurn is inside of unit class and is used to check if it’s that unit’s turn

        The method should also check if the next unit is an enemy, if so call AI to update.
        */
        ArrayList<Unit> newOrder = new ArrayList<Unit>();   //Empty array used to create updated one
        for (Unit unit : turnOrder) 
        {
            double score = (round-unit.lastRound)*unit.speed;
            //Iterate to find correct position of the unit (Largest to smallest)
            int index = newOrder.size(); // Empty Array OR score is the smaller ---> position should be last
            for (int i = 0; i < newOrder.size(); i++) {
                Unit iUnit = newOrder.get(i); 
                if ((round-iUnit.lastRound)*iUnit.speed < score) 
                { index = i; break; } 
            }
            //Setting position, will move right side from index (ArrayList.add())
            newOrder.add(index, unit);
            unit.hasTurn = false; //Only the first place(turn order) should have their turn
        }
        
        newOrder.get(0).hasTurn = true; //After finalized, allow the first place their turn
        turnOrder = newOrder;// Replacing turnOrder with new
        
        for (Unit u : turnOrder) {
           System.out.print(u.name + "\t");
        }
        System.out.println("");
        //Implement AI Module HERE
    }
    public static void NextTurn() 
    {
        /*
        Set the current’s unit’s last attacked to current round. Then Update Turn Order Method the attack order.
        */
        //Ending current unit's turn
        turnOrder.get(0).hasTurn = false;
        turnOrder.get(0).lastRound = round; //Set before it is incremented, so when calculated in Update it produces (1) next
        
        round++;//Increment round        
        
        UpdateTurnOrder();  //Now index 0 is the next unit to get their turn
        
        //Intergrate AI stuff here
    }
  
                                //Placement Order\\
    private static ArrayList<Unit> placeOrder = new ArrayList<Unit>(battlePlaces);
   
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
    private static SelectionSort sortMethod = new SelectionSort();  //Keeps track of which sorting method is being used
    public static void SetSortMethod(String method)
    {

        /*
        This will set the current sort order according to given order
        And resets the sortstep since we are switching methods
        */
    }
    public static void IterateSort()
    {
        /*
        This will iterate one step in the current sort order and update the visuals
        */
        
    }
    /*
        Empty constructers will be used to store which method is being used
        When iterate method is called, it should overide according to correct method
        The step variable is used by all sorts to keep track of their step
    */
    private static class SelectionSort {
        /*
            This will be the default that other sorts will extend off
            The basic sorting method would start from the left and go to the right. 
            You will start off with this in the tutorial/beginning, therefore it's the default
            Easiest to understand and slowest method
        */
        public SelectionSort() {}
        public void Iterate() 
        {
            /*
            Everything before starting index(sortStep) is already sorted
            sortStep is iterated each turn
            Repeating on the same step won't mess stuff up
            The last index iterated won't be need to go through (last index)
            This sort method will need to check if step is inbound
            */
            if (sortStep < placeOrder.size()) {
                int min = sortStep;
                for (int current = sortStep+1; current < placeOrder.size()-1; current++) {
                  int curVal = GetOrderValueOfIndex(current); //Getting Unit's Order Value
                  int minVal = GetOrderValueOfIndex(min);
                  //If current < minimum then set current will be minimum for now
                  if (curVal < minVal)  {
                      min = current;
                  }
                }
                SwapUnitPositions(sortStep, min);//Swapping 
            }
        }
    }
    private static class ReverseSelectionSort extends SelectionSort{
      /*
        Instead of starting at 0, start at end and work your way left instead of right
        This doeesn't change the end result, it will still be min -> max
      */
      public ReverseSelectionSort(){}
      @Override public void Iterate() {
        /*
          Everything after starting index(sortStep) is already sorted
          The last index iterated won't be need to go through (index size-1)
          This sort method will need to check if step is inbound
        */
        if (sortStep < placeOrder.size()) {
            int max = placeOrder.size()-sortStep;
            for (int current = max-1; current >= 0; current--) {
                int curVal = GetOrderValueOfIndex(current); //Getting Unit's Order Value
                int maxVal = GetOrderValueOfIndex(max);
                //If current > maximum then set current will be maximum for now
                if (curVal > maxVal)  {
                    max = current;
                }
            }
            SwapUnitPositions(sortStep, max);//Swap
            
        }
      }
    }
    private static class InsertionSort extends SelectionSort{
        /* 
        Units on the right would stay there much longer than units on the left.
        */
        public InsertionSort() {}
        @Override public void Iterate()
        {
            /*
              For each iterate, traverse backwards to find item > starting item 
              If none found that item is the largest in array
              The first index iterated won't be need to go through (index 0)
              This sort method will need to check if step is inbound
            */
            if (sortStep < placeOrder.size()) {//Ignore first index (0)
                int orderVal = GetOrderValueOfIndex(sortStep);
                for (int current = sortStep-1; current >= 0; current--) {
                    int curVal = GetOrderValueOfIndex(current);
                    if (curVal > orderVal) {
                        SwapUnitPositions(sortStep, current+1);//Swap
                    }
                }
                //Item is the highest, swap with first index
                SwapUnitPositions(sortStep, 0);
            }
        }
    }
    private static class MergeSort extends SelectionSort {
      /*
      Merge sort would kind of be a wild/risky method, since the start they wouldn’t move much. 
      But with time the changes wil exponentially.
      */
      public MergeSort() {}
      @Override public void Iterate() 
      {
        /*
        This method works for any step expect 0 and below (I removed if statement, sortSort will never reach below 1, add if statement back if needed)
        */
        int step = (int)Math.pow(2, sortStep);//Convert sortStep into how long each side should be step 0->1 | 1->2 | 2->4
        for (int ls = 0; ls + step < step; ls += step*2) {  //Traversing through each pair
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
                if (GetOrderValueOfIndex(r) > GetOrderValueOfIndex(l)) {   //Order is largest to smallest
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
        @Override public void Iterate() 
        {  
            /*
            
            */
            ArrayList<ArrayList<Integer>> newGroups = new ArrayList<>();
            
            for (ArrayList<Integer> parseInfo : parseGroups) {
                if (parseInfo.get(0) > parseInfo.get(1)) {  //base case
                    int pivot = parseInfo.get(1), pivotValue = GetOrderValueOfIndex(pivot); 
                    int left = parseInfo.get(0);

                    for (int i = left+1; i < pivot; i++) {
                        if (GetOrderValueOfIndex(i) > pivotValue) {
                            SwapUnitPositions(i, left);
                            left++;
                        }
                    }
                    SwapUnitPositions(pivot, left);
                    //Add to groups
                    addParseInfo(newGroups, parseInfo.get(0), left-1);
                    addParseInfo(newGroups, left+1, parseInfo.get(1));
                }
            }
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
        return orderVal;
    }
    
    private static void SwapUnitPositions(int a, int b) {
        /*
        This will swap the Units of the given indexs in Placement Order
        */
        Unit temp = placeOrder.get(a);
        placeOrder.set(a, placeOrder.get(b));
        placeOrder.set(b, temp);
    }
}
