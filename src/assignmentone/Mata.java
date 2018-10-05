package assignmentone;

import java.util.List;
import javax.swing.JOptionPane;

public class Mata {
    
    private HotellGäster guests = new HotellGäster();
    private String namn;
    
    public Mata (HotellGäster guests, String namn) {
        this.guests = guests;
        this.namn = namn;
        
    }
    
    public void getMat() {
        
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
