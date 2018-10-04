package assignmentone;

import java.util.*;
import javax.swing.JOptionPane;

public class DjurFabrik {
    
    private static HotellGäster guests = new HotellGäster();    // Private, Kan endast kommas åt inom Djurfabrik. 
                                                                // Static så vi slipper instansiera ett object av klassen DjurFabrik.
    
    public static void RegistreraDjur (){
        
        
        // Polymorfism. Lagrar objekten Hund, Katt och Orm i ett Djur. 
        Djur Sixten = new Hund("Sixten", 5);
        Djur Dogge = new Hund("Dogge", 10);
        Djur Venus = new Katt("Venus", 5);
        Djur Ove = new Katt("Ove", 3);
        Djur Hypno = new Orm("Hypno", 1);
        
        guests.addDjur(Sixten);
        guests.addDjur(Dogge);
        guests.addDjur(Venus);
        guests.addDjur(Ove);
        guests.addDjur(Hypno);
    }
    
    
    public static void getMat (String namn) {
        
        List<Djur> temp = guests.getHotellGäster();
        boolean rättNamn = false; 
        
        while (!rättNamn) {
            for (Djur djur : temp) {
                if (namn.equalsIgnoreCase(djur.getNamn())) {
                    djur.mat();     // Polymorfism. Kallar på Katt eller Orm's version av mat()
                    rättNamn = true; 
                    break;
                }
            }
            if (!rättNamn) {
                namn = JOptionPane.showInputDialog("Det djuret finns inte!");
            
            } else { break; }
        }
    }
}
