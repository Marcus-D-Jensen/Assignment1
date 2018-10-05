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
        
        Mata mataDjur = new Mata(guests, namn);
        
        mataDjur.getMat();
    }
}
