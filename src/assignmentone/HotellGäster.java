package assignmentone;

import java.util.*;

public class HotellGäster {
    private List<Djur> gäster = new ArrayList();    // En private lista med djuren som bor på hotellet. Kan bara kommas åt inom klassen HotellGäster. 
    
    public void addDjur(Djur djur) {
        gäster.add(djur);
    }
    
    public List getHotellGäster(){
        return gäster; 
    }
}
