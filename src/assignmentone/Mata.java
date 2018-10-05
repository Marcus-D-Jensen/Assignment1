package assignmentone;

import java.util.List;
import javax.swing.JOptionPane;

public class Mata {
    
    private HotellGäster gäster = new HotellGäster();
    private String namn;
    
    public Mata (HotellGäster guests, String namn) {
        this.gäster = guests;
        this.namn = namn;
        
    }
    
    public void getMat() {
        
        List<Djur> temp = gäster.getHotellGäster();
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
