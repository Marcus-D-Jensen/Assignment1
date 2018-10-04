
package assignmentone;


public class Djur implements Imat{
    
    private String namn;
    private double vikt;
    
    public Djur(String namn, int vikt) {
        this.namn = namn;
        this.vikt = vikt; 
    }
    
    public String getNamn() {
        return namn;
    }
    public double getVikt() {
        return vikt;         
    }

    @Override
    public void mat() {}
    

}
