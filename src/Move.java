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
        
        public Move()
        {
            name = "Default";
            desc = "Default desc";
            rangeLeft = 1; rangeRight = 0;
        }
        
        //Create subclasses for moves
    }
