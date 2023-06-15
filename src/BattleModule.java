/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saliy5109
 */
import java.util.ArrayList;

public class BattleModule {
                                    //Settings\\
    
                                //Module Variables\\
    
    public static boolean active;
    
                                //Setting Up Battle\\
    
    public static void LoadUnits()
    {
        /*
        Future method that will load units from the campaign/inventory/enemy encounter
        */
    }
    public static void StartBattle()
    {
        /*
        This will start the battle
        Scramble placement order and set up turn order
        active boolean will need to be toggled seperatly for more flexabilty
        */
        if (active) {  
            
            TurnModule.ScrambleOrder();//Scramble Placement Order
            TurnModule.UpdateTurnOrder();//Setups up order and gives first unit their turn
            //Mostly GUI Visual stuff here            
        }
    }
    public static void CloseBattle()
    {
        /*
            Clean up variables and reset stuff
        */
        TurnModule.ResetTurnOrder();//Reset Turn Order
        TurnModule.ResetPlaceOrder();//Reset Placement Order
        TurnModule.round = 1; //Resets the round
    }
}
