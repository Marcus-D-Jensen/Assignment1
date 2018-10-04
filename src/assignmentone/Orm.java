package assignmentone;

import javax.swing.JOptionPane;

public class Orm extends Djur{

    public Orm(String namn, int vikt) {
        super(namn, vikt);
    }
    
    @Override
    public void mat() {
        System.out.println("Ormen " + this.getNamn() + " ska ha 20g ormpellets");
        JOptionPane.showMessageDialog(null,"Ormen " + this.getNamn() + " ska ha 20g Ormpellets");
    }
}
