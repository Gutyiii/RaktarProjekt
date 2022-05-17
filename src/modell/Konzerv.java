package modell;

import java.nio.file.Path;
import java.time.LocalDate;

public class Konzerv extends Elelmiszer {
    
    private String szoveg;
    private Path recept;
    
    public Konzerv(String szoveg, Path recept, String nev, String gyarto) {
        super(nev, gyarto);
        this.szoveg = szoveg;
        this.recept = recept;
    }
    
    public Konzerv(String szoveg, String nev, String gyarto, LocalDate lejaratiDatum) throws KivetelIO {
        super(nev, gyarto, lejaratiDatum);
        this.szoveg = szoveg;
    }
    
    public Konzerv(String szoveg, Path recept, String nev, String gyarto, LocalDate lejaratiDatum) throws KivetelIO {
        super(nev, gyarto, lejaratiDatum);
        this.szoveg = szoveg;
        this.recept = recept;
    }
    
    public Konzerv(String szoveg, String nev, String gyarto) {
        super(nev, gyarto);
        this.szoveg = szoveg;
    }
    
    public void receptMutat() {
        if (Path.class.getName().equals(szoveg)) {
            System.out.println("Létezik");
        } else {
            System.out.println("Nem léteziuk");
        }
    }
    
}
