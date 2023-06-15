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
    public boolean hasTurn;
    public String name = "Dummy"; //Testing variable
    public Unit(int speed)
    {
        this.speed = speed;
    }
    public Unit(int speed, String name)
    {
        this(speed);
        this.name = name;
    }

}
