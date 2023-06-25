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
        public boolean friendlyFire;
        
        public Move()
        {
            name = "";
            desc = "";
        }
        public Move(String moveName) 
        {
            switch (moveName) {
            case "Slash":
                name = "Slash";
                dmg = 7;
                rangeLeft = 2; rangeRight = 2;
                desc = "A far reaching slash\nRange: " +rangeLeft+ " titles behind | " +rangeRight+ " titles ahead\nDamage = " + dmg;
                break;
            case "Shank":
                name = "Shank";
                dmg = 10;
                rangeLeft = 1; rangeRight = 1;
                desc = "A close range shank\nRange: " +rangeLeft+ " titles behind | " +rangeRight+ " titles ahead\nDamage = " + dmg;
                break;
            case "Heavy Strike":
                name = "Heavy Strike";
                dmg = 18;
                rangeLeft = 0; rangeRight = 1;
                desc = "Capable of dealing heavy damage, however it requires your enemy to be right in front of you\nRange: " +rangeLeft+ " titles behind | " +rangeRight+ " titles ahead\nDamage = " + dmg;
                break;
            case "Strike":
                name = "Strike";
                dmg = 11;
                rangeLeft = 1; rangeRight = 1;
                desc = "A close range attack with decent damage\nRange: " +rangeLeft+ " titles behind | " +rangeRight+ " titles ahead\nDamage = " + dmg;
                break;
            case "Point Blank":
                name = "Point Blank";
                dmg = 10;
                rangeLeft = 0; rangeRight = 1;
                desc = "A powerful close quarters shot\nRange: " +rangeLeft+ " titles behind | " +rangeRight+ " titles ahead\nDamage = " + dmg;
                break;
            case "Shoot":
                name = "Shoot";
                dmg = 7;
                rangeLeft = 1; rangeRight = 3;
                desc = "A long range attack with decent damge, however it has much less range behind\nRange: " +rangeLeft+ " titles behind | " +rangeRight+ " titles ahead\nDamage = " + dmg;
                break;
            case "Heal":
                name = "Heal";
                dmg = -5;
                rangeLeft = 8; rangeRight = 8;
                friendlyFire = true;
                desc = "Increases target's health\nRange: " +rangeLeft+ " titles behind | " +rangeRight+ " titles ahead\nHeal = " + dmg;
                break;
            case "Quick Heal":
                name = "Quick Heal";
                dmg = -10;
                rangeLeft = 1; rangeRight = 1;
                friendlyFire = true;
                desc = "Increases target's drastically health, however requires you to be close to them\nRange: " +rangeLeft+ " titles behind | " +rangeRight+ " titles ahead\nHeal = " + dmg;
                break;
            case "Melee":
                name = "Melee";
                dmg = 5;
                rangeLeft = 1; rangeRight = 1;
                desc = "A decent melee attack\nRange: " +rangeLeft+ " titles behind | " +rangeRight+ " titles ahead\nDamage = " + dmg;
                break;    
            case "Backstab":
                name = "Backstab";
                dmg = 14;
                rangeLeft = 1; rangeRight = 0;
                desc = "A powerful stab capable of high damage, however it requires your enemy to be right behind you\nRange: " +rangeLeft+ " titles behind | " +rangeRight+ " titles ahead\nDamage = " + dmg;
                break; 
            case "Twin Slash":
                name = "Twin Slash";
                dmg = 13;
                rangeLeft = 1; rangeRight = 1;
                desc = "A two close range slashs that will great damage\nRange: " +rangeLeft+ " titles behind | " +rangeRight+ " titles ahead\nDamage = " + dmg;
                break; 
            case "Fire":
                name = "Fire";
                dmg = 8;
                rangeLeft = 3; rangeRight = 1;
                desc = "A long range attack with decent damge, however it has much less range ahead\nRange: " +rangeLeft+ " titles behind | " +rangeRight+ " titles ahead\nDamage = " + dmg;
                break;
            case "Snipe":
                name = "Snipe";
                dmg = 5;
                rangeLeft = 5; rangeRight = 0;
                desc = "A far range attack with low damge, however can't attack ahead\nRange: " +rangeLeft+ " titles behind | " +rangeRight+ " titles ahead\nDamage = " + dmg;
                break;
            default:
                break;
        }
        }
        //Create subclasses for moves
    }
