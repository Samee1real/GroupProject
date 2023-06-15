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
    private static Unit[] placeOrder = new Unit[battlePlaces];
   
    public static int GetUnitPlace(Unit unit)
    {
        /*
        Used to just get the positions of Units
        */
        for (int i = 0; i < battlePlaces; i++) {
            if (placeOrder[i].equals(unit)) {
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
        placeOrder = new Unit[battlePlaces];
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
            //Swap
            Unit temp = placeOrder[place1];
            placeOrder[place1] = placeOrder[place2];
            placeOrder[place2] = temp;
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
    private class SelectionSort {
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
            Everything before startIndex is sorted and it is set to sortStep
            sortStep is iterated each turn
            Repeating on the same step won't mess stuff up
            */
            int min = sortStep;
            for (int current = sortStep+1; i < placeOrder.length; i++) {
              //Finding Unit's place
              int curVal = placeOrder.length-1;
              int minVal = placeOrder.length-1;
              //Setting to last place if null
              if (placeOrder[current] != null) {curVal = placeOrder[current].place;}
              if (placeOrder[min] != null) {minVal = placeOrder[min].place;}
              
              if (curVal < minVal)  {min = current;}//If current < minimum then set current will be minimum for now
            }
            //Swapping the starting index and the minimum (Notable issue: if sortStep is outofBound then this will produce an errorFIX!!!)
            Unit temp = placeOrder[sortStep];
            placeOrder[sortStep] = placeOrder[min];
            placeOrder[min] = temp;
        }
    }
    private class ReverseSelectionSort() 
    {
      /*
        Instead of starting at 0, start at end and work your way left instead of right
        This doeesn't change the end result, it will still be min -> max
      */
      int max = placeOrder.length-sortStep;
      for (int current = 0; current > -1; current--) {
        
      }
    }
    private class InsertionSort extends SelectionSort{
        /* 
        Units on the right would stay there much longer than units on the left.
        */
        public InsertionSort() {}
        @Override public void Iterate()
        {
            /*
              Insertion sort would serve kinda like a filler method. The way the method would work makes it so units on the right would stay there much longer than units on the left.
            */
        }
    }
}
