/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saliy5109
 */
public class TurnModule {
                                    //Settings\\
    static int battlePlaces = 8;
                                //Module Variables\\
    
                                  //Turn Order\\
    
    static Unit[] turnOrder = new Unit[battlePlaces];
    
                                //Placement Order\\
    
    public static Unit[] placeOrder = new Unit[8];
    
    public static int GetUnitPlace(Unit unit)
    {
        /*
        Used to just get the positions of Units
        */
        for (int i = 0; i < battlePlaces; i++) {
            if (placeOrder[i].equals(unit)) {
                return i;
            }
        }
        return -1;
    }
    
    public static void ScrambleOrder()
    {
        /*
            This will scramble the Place Order Array randomly
        */
        for (int count = 0; count < battlePlaces*2; count++)
        {
            int place1 = (int)Math.random()*battlePlaces;
            int place2 = (int)Math.random()*battlePlaces;
            //Swap
            Unit temp = placeOrder[place1];
            placeOrder[place1] = placeOrder[place2];
            placeOrder[place2] = temp;
        }
    }
    
    
}
