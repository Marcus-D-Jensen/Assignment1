
package assignmentone;

import java.util.*;


public class HotellGäster {
    private List<Djur> gäster = new ArrayList();
    
    public void addDjur(Djur djur) {
        gäster.add(djur);
    }
    
    public List getHotellGäster(){
        return gäster; 
    }

}
