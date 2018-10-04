
package assignmentone;


public class Hund extends Djur{
    
    public Hund(String namn, int vikt) {
        super(namn, vikt);
    }
    
    public String getRas() {
        return "Hund";
    }

    @Override
    public void mat() {
        double matVikt = (this.getVikt()*1000)/100;
        System.out.println("Hunden " + this.getNamn() + " ska ha " + matVikt + "g Hundmat");
    }

}
