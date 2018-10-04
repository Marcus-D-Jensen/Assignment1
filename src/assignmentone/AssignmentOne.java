
package assignmentone;

import java.util.*;
import javax.swing.JOptionPane;


public class AssignmentOne {
    
    public static void main(String[] args) {
        
        DjurFabrik.generateDjur();        
        
        DjurFabrik.getMat(JOptionPane.showInputDialog("Vilket djur ska ha mat?"));
    }
}
