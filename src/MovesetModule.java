
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
    
    public static ArrayList<Integer> GetMoveHitLocations(Unit attacker, Move move)
    {
        ArrayList<Integer> posList = new ArrayList<>();
        
        int pos = OrderModule.GetUnitPlace(attacker);
        for (int i = pos-1;  i >= 0 && i >= pos-move.rangeLeft; i--) {
            Unit defender = OrderModule.GetUnitAtIndex(pos);
            if (defender != null && (move.friendlyFire || attacker.team*defender.team < 0)) {
                posList.add(i);
            }
        }
        for (int i = pos+1; i < OrderModule.battlePlaces && i <= pos+move.rangeRight; i++) {
            Unit defender = OrderModule.GetUnitAtIndex(pos);
            if (defender != null && (move.friendlyFire || attacker.team*defender.team < 0)) {
                posList.add(i);
            }
        }
        
        return posList;
    }
    
}
