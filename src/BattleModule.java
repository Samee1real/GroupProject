/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saliy5109
 */
import java.time.Duration;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BattleModule {
                                    //Settings\\
    
                                //Module Variables\\
    
    public static boolean active;
    
                                //Setting Up Battle\\
    
    public static void LoadBattle() throws InterruptedException
    {
        /*
        
        */
        Unit u1 = new Unit(0, 1, "Leader");
        Unit u2 = new Unit(1, 1, "Priest");
        Unit u3 = new Unit(2, 1, "Ranger");
        Unit u4 = new Unit(3, 1, "Crusader");
        Unit u5 = new Unit(4, -1, "Dagger");
        Unit u6 = new Unit(5, -1, "Skeleton");
        Unit u7 = new Unit(6, -1, "Musket");
        Unit u8 = new Unit(7, -1, "Mask");
        OrderModule.AddUnit(u1, 0); TurnModule.AddToTurnOrder(u1);
        OrderModule.AddUnit(u2, 1); TurnModule.AddToTurnOrder(u2);
        OrderModule.AddUnit(u3, 2); TurnModule.AddToTurnOrder(u3);
        OrderModule.AddUnit(u4, 3); TurnModule.AddToTurnOrder(u4);
        OrderModule.AddUnit(u5, 4); TurnModule.AddToTurnOrder(u5);
        OrderModule.AddUnit(u6, 5); TurnModule.AddToTurnOrder(u6);
        OrderModule.AddUnit(u7, 6); TurnModule.AddToTurnOrder(u7);
        OrderModule.AddUnit(u8, 7); TurnModule.AddToTurnOrder(u8);
        Thread.sleep(1000);
        //Setting up order
        
        Unit unitWithTurn = TurnModule.GetUnitWithTurn();
        Thread.sleep(4000);
        OrderModule.ScrambleOrder();
        Thread.sleep(2500);
        TurnModule.UpdateTurnOrder();
        UIManager.UpdateTurnStars(OrderModule.GetUnitPlace(unitWithTurn));
        active = true;
    }
    /*public static void StartBattle()
    {
        /*
        This will start the battle
        Scramble placement order and set up turn order
        active boolean will need to be toggled seperatly for more flexabilty
        
        if (active) {  
            
            OrderModule.ScrambleOrder();//Scramble Placement Order
            TurnModule.UpdateTurnOrder();//Setups up order and gives first unit their turn
            //Mostly GUI Visual stuff here            
        }
    }*/
    public static void CloseBattle()
    {
        /*
            Clean up variables and reset stuff
        */
        TurnModule.ResetTurnOrder();//Reset Turn Order
        OrderModule.ResetPlaceOrder();//Reset Placement Order
        TurnModule.round = 1; //Resets the round
    }
    
    public static void ExecuteMove(Unit unit, Move move, int pos)
    {
        Unit defender = OrderModule.GetUnitAtIndex(pos);
        int defence = defender.defence;
        if (move.dmg < 0) {defence = 0;}
        int dmg = move.dmg - defence;
        if (move.dmg > 0 && dmg < 0) {dmg = 0;}
        defender.health -= dmg;
        System.out.println(unit.name + " used " + move.name + " on " + defender.name + ", it dealt: " + dmg + " damage | " + defender.name + "'s health is now " + defender.health);
        //Check if alive
        if (defender.health < 0) {
            System.out.println(defender.name + " has died");
            UIManager.RemovePositionIcon(pos);
            OrderModule.SetNull(pos);
            TurnModule.RemoveUnit(unit);
            if (OrderModule.GetTeamCount(1) <= 0) {
                //Lost
            }
            else if (OrderModule.GetTeamCount(-1) <= 0) {
                //Won
            }
        }
        //Next Turn
        OrderModule.IterateSort();
        //TurnModule.NextTurn();
    }
    
    public static void SkipTurn()
    {
        active = false;
        OrderModule.IterateSort();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(BattleModule.class.getName()).log(Level.SEVERE, null, ex);
        }
        //TurnModule.NextTurn();
        active = true;
    }
    
    public static void BattleAI(Unit unit)
    {
        active = false;
        ArrayList<Move> moves = new ArrayList<>();
        for (Move move : unit.moveset) {
            if (MovesetModule.IsMoveAv1ailable(unit, move)) {moves.add(move);}
        }
        Move move = moves.get((int)(Math.random()*moves.size()));
        ArrayList<Integer> positions = MovesetModule.GetMoveHitLocations(unit, move);
        int position = (int)(Math.random()*positions.size());
        ExecuteMove(unit, move, positions.get(position));
    }
}
