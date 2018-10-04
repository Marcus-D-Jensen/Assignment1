package assignmentone;

import javax.swing.JOptionPane;

public class AssignmentOne {
    
    public static void main(String[] args) {
        
        DjurFabrik.RegistreraDjur();        
        
        DjurFabrik.getMat(JOptionPane.showInputDialog("Vilket djur ska ha mat?"));
    }
}
