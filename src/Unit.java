
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
    
    public int team; //1 if your team | -1 for enemey
    
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
    }
    public Unit(int orderValue, int team, String type)    
    {
        this();
        this.orderValue = orderValue; this.team = team;
        switch (type) {
            case "Leader":
                Leader();
                moveset.add(new Move("Backstab"));
                moveset.add(new Move("Slash"));
                break;
            case "Priest":
                Priest();
                moveset.add(new Move("Heal"));
                moveset.add(new Move("Quick Heal"));
                moveset.add(new Move("Melee"));
                break;
            case "Ranger":
                Ranger();
                moveset.add(new Move("Point Blank"));
                moveset.add(new Move("Shoot"));
                break;
            case "Crusader":
                Crusader();
                moveset.add(new Move("Strike"));
                moveset.add(new Move("Heavy Strike"));
                break;
            case "Dagger":
                Dagger();
                moveset.add(new Move("Twin Slash"));
                moveset.add(new Move("Slash"));
                break;
            case "Skeleton":
                Skeleton();
                moveset.add(new Move("Slash"));
                moveset.add(new Move("Shank"));
                break;
            case "Musket":
                Musket();
                moveset.add(new Move("Fire"));
                moveset.add(new Move("Snipe"));
                break;
            case "Mask":
                Mask();
                moveset.add(new Move("Slash"));
                moveset.add(new Move("Twin Slash"));
                break;
            default:
                break;
        }
    }
    public boolean equals(Unit unit)
    {
        if (unit.id == id) {return true;}
        return false;
    }
    
    
    private void Leader()
    {
        health = 20; defence = 2; speed = 10;
    }
    private void Priest()
    {
        health = 25; defence = 0; speed = 8;
    }
    private void Ranger()
    {
        health = 21; defence = 5; speed = 12;
    }
    private void Crusader()
    {
        health = 30; defence = 8; speed = 7;
    }
    private void Dagger()
    {
        health = 35; defence = 1; speed = 7;
    }
    private void Skeleton()
    {
        health = 20; defence = 2; speed = 13;
    }
     private void Musket()
    {
        health = 20; defence = 0; speed = 9;
    }
    private void Mask()
    {
        health = 15; defence = 10; speed = 10;
    }
    
    //Add subclass for each unit, they just need a constructer to set the values 
    //Make sure to always call super; to set up the id for the unit
    //public Ranger extends Unit 
    //moveset.add("Basic Swing") 
}
