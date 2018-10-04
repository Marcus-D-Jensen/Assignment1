package assignmentone;

import javax.swing.JOptionPane;

public class Hund extends Djur{
    
    public Hund(String namn, int vikt) {
        super(namn, vikt);
    }
    
    @Override
    public void mat() {   
        double matVikt = (this.getVikt()*1000)/100;
        JOptionPane.showMessageDialog(null, "Hunden " + this.getNamn() + " ska ha " + matVikt + "g Hundmat");
    }
}
