
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saliy5109
 */

public class Unit {
    public static int tracker = 0;
    public int id = 0;
    
    public boolean team; //true if it's your team
    
    public int lastRound; //dont change
    public int orderValue; //the starting position (from index 0)
    public boolean hasTurn; //dont change
    
    public int health;  //health of unit
    public int defence; //reduces incoming damage by this amount
    public int speed;   // 10 is the base speed, meaning a unit with 20 speed would be twice as fast (20 speed is a little op)
    
    public ArrayList<Move> moveset = new ArrayList<>();
    
    public Unit()
    {
        id = tracker;
        tracker++;  
        moveset.add(new Move());
    }
    public Unit(int orderValue) 
    {
        this();
        this.orderValue = orderValue;
    }
    public boolean equals(Unit unit)
    {
        if (unit.id == id) {return true;}
        return false;
    }
    
    
    //Add subclass for each unit, they just need a constructer to set the values 
    //Make sure to always call super; to set up the id for the unit
    //public Ranger extends Unit 
    //moveset.add("Basic Swing") 
}
