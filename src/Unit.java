/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saliy5109
 */
public class Unit {
    public int speed;
    public int lastRound;
    public int orderValue;
    public boolean hasTurn;
    public String name = "Dummy"; //Testing variable
    public Unit(int speed)  //all these constructers are just used for testing, feel free to delete
    {
        this.speed = speed;
    }
    public Unit(int speed, String name)
    {
        this(speed);
        this.name = name;
    }

}
