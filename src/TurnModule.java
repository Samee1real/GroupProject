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
    
    private static int battlePlaces = 8;
    
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
    
    
}
