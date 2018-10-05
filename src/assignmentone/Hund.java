package assignmentone;

import javax.swing.JOptionPane;

public class Hund extends Djur{
    
    public Hund(String namn, int vikt) {
        super(namn, vikt);
    }
    
    @Override
    public void mat() {   
        double matVikt = Math.round(((this.getVikt()*1000)/100)*100.0)/100.0;
        JOptionPane.showMessageDialog(null, "Hunden " + this.getNamn() + " ska ha " + matVikt + "g Hundmat");
    }
}
