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
    
    public static void LoadBattle()
    {
        /*
        
        */
        Unit u1 = new Unit(0);
        Unit u2 = new Unit(1);
        Unit u3 = new Unit(2);
        Unit u4 = new Unit(3);
        Unit u5 = new Unit(4);
        Unit u6 = new Unit(5);
        Unit u7 = new Unit(6);
        Unit u8 = new Unit(7);
        OrderModule.AddUnit(u1, 0); TurnModule.AddToTurnOrder(u1);
        OrderModule.AddUnit(u2, 1); TurnModule.AddToTurnOrder(u2);
        OrderModule.AddUnit(u3, 2); TurnModule.AddToTurnOrder(u3);
        OrderModule.AddUnit(u4, 3); TurnModule.AddToTurnOrder(u4);
        OrderModule.AddUnit(u5, 4); TurnModule.AddToTurnOrder(u5);
        OrderModule.AddUnit(u6, 5); TurnModule.AddToTurnOrder(u6);
        OrderModule.AddUnit(u7, 6); TurnModule.AddToTurnOrder(u7);
        OrderModule.AddUnit(u8, 7); TurnModule.AddToTurnOrder(u8);
        //Setting up order
        TurnModule.UpdateTurnOrder();
        Unit unitWithTurn = TurnModule.GetUnitWithTurn();
        UIManager.UpdateTurnStars(OrderModule.GetUnitPlace(unitWithTurn));
        active = true;
        
    }
    public static void StartBattle()
    {
        /*
        This will start the battle
        Scramble placement order and set up turn order
        active boolean will need to be toggled seperatly for more flexabilty
        */
        if (active) {  
            
            OrderModule.ScrambleOrder();//Scramble Placement Order
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
        //Check if alive
        if (defender.health < 0) {
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
        TurnModule.NextTurn();
        OrderModule.IterateSort();
    }
    
    public static void SkipTurn()
    {
        TurnModule.NextTurn();
        OrderModule.IterateSort();
    }
    
    public static void BattleAI(Unit unit)
    {
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
