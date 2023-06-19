
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Samee
 */
public class MovesetModule {
    public static boolean IsMoveAv1ailable(Unit unit, Move move)
    {
        return GetMoveHitLocations(unit, move).size() > 0;
    }
    
    public static ArrayList<Integer> GetMoveHitLocations(Unit unit, Move move)
    {
        ArrayList<Integer> posList = new ArrayList<>();
        
        int pos = OrderModule.GetUnitPlace(unit);
        for (int i = pos-1;  i >= 0 && i >= pos-move.rangeLeft; i--) {
            if (OrderModule.GetUnitAtIndex(i) != null) {
                posList.add(i);
            }
        }
        for (int i = pos+1; i < OrderModule.battlePlaces && i <= pos+move.rangeRight; i++) {
            if (OrderModule.GetUnitAtIndex(i) != null) {
                posList.add(i);
            }
        }
        
        return posList;
    }
  
}
