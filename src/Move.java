/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Samee
 */
public class Move
    {
        public String name;
        public String desc;
        public int dmg;
        public int rangeLeft, rangeRight;
        public boolean friendlyFire = true;
        
        public Move()
        {
            name = "Default";
            desc = "Default desc";
            dmg = 1;
            rangeLeft = 1; rangeRight = 1;
        }
        
        //Create subclasses for moves
    }
