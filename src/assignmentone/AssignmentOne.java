

package assignmentone;

import java.util.*;


public class AssignmentOne {
    
    public static void main(String[] args) {
        
        Djur Sixten = new Hund("Sixten", 5);
        Djur Dogge = new Hund("Dogge", 10);
        Djur Venus = new Katt("Venus", 5);
        Djur Ove = new Katt("Ove", 3);
        Djur Hypno = new Orm("Hypno", 1); 
        
        HotellGäster guests = new HotellGäster();
        guests.addDjur(Sixten);
        guests.addDjur(Dogge);
        guests.addDjur(Venus);
        guests.addDjur(Ove);
        guests.addDjur(Hypno);
        
        List<Djur> test = guests.getHotellGäster();
        
        for (Djur test1 : test) {
            System.out.println(test1.getNamn());
            test1.mat();
            
        }
        Hund vilda = new Hund("Vilda", 18);
        
        System.out.println();
                
        
        
        
        
    }

}
