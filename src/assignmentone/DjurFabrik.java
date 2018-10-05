package assignmentone;

public class DjurFabrik {
    
    private static HotellGäster gäster = new HotellGäster();    // Private, Kan endast kommas åt inom Djurfabrik. 
                                                                // Static så vi slipper instansiera ett object av klassen DjurFabrik.
    
    public static void RegistreraDjur (){
        
        
        Djur Sixten = new Hund("Sixten", 5);
        Djur Dogge = new Hund("Dogge", 10);
        Djur Venus = new Katt("Venus", 5);
        Djur Ove = new Katt("Ove", 3);
        Djur Hypno = new Orm("Hypno", 1);
        
        gäster.addDjur(Sixten);
        gäster.addDjur(Dogge);
        gäster.addDjur(Venus);
        gäster.addDjur(Ove);
        gäster.addDjur(Hypno);
    }
    
    
    public static void getMat (String namn) {
        
        Mata mataDjur = new Mata(gäster, namn);
        
        mataDjur.getMat();
    }
}
