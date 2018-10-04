
package assignmentone;


public class Katt extends Djur{
    
    public Katt(String namn, int vikt) {
        super(namn, vikt);
    }

    @Override
    public void mat() {
        double matVikt = (this.getVikt()*1000)/150;
        System.out.println("Katten " + this.getNamn() + " ska ha " + matVikt + "g Kattmat");
    }

}
