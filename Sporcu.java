
package prolab_proje_2;


public class Sporcu {

    /**
     * @param args the command line arguments
     */
    public String sporcuIsim;
    public String sporcuTakim;

    public Sporcu (String sporcuIsim, String sporcuTakim) {
        this.sporcuIsim = sporcuIsim;
        this.sporcuTakim = sporcuTakim;
    }

    public Sporcu() {
        
    }
    
    public void sporcuPuaniGoster() {
 
    }

    public String getSporcuIsim() {
        return sporcuIsim;
    }

    public void setSporcuIsim(String sporcuIsim) {
        this.sporcuIsim = sporcuIsim;
    }

    public String getSporcuTakim() {
        return sporcuTakim;
    }

    public void setSporcuTakim(String sporcuTakim) {
        this.sporcuTakim = sporcuTakim;
    }
    
}
