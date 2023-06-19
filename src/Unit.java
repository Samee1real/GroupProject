/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saliy5109
 */
public class Unit {
    public boolean team; //true if it's your team
    
    public int lastRound; //dont change
    public int orderValue; //the starting position (from index 0)
    public boolean hasTurn; //dont change
    
    public int health;  //health of unit
    public int defence; //reduces incoming damage by this amount
    public int speed;   // 10 is the base speed, meaning a unit with 20 speed would be twice as fast (20 speed is a little op)
    
    public Unit()
    {
        //Default states (ADD)
    }
    
    //Add subclass for each unit, they just need a constructer to set the values
    //public Ranger extends Unit 
}
