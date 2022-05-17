package modell;

import java.text.Collator;
import java.time.LocalDate;
import java.util.Comparator;

class GyartoComparator implements  Comparator<Elelmiszer>{

    @Override
    public int compare(Elelmiszer o1, Elelmiszer o2) {
        Collator col = Collator.getInstance();
        return col.compare(o1.getGyarto(), o2.getGyarto());
    }
}

abstract public class Elelmiszer implements Comparable<Elelmiszer> {

    private String nev;
    private String gyarto;
    private LocalDate lejaratiDatum;

    public Elelmiszer(String nev, String gyarto, LocalDate lejaratiDatum) throws KivetelIO {
        this.nev = nev;
        this.gyarto = gyarto;
        if (!(LocalDate.now().equals(lejaratiDatum))) {
            this.lejaratiDatum = lejaratiDatum;
        } else {
            throw new KivetelIO("lejart élelmiszer");
        }
    }

    public Elelmiszer(String nev, String gyarto) {
        this.nev = nev;
        this.gyarto = gyarto;
        lejaratiDatum = LocalDate.now().plusYears(1);
    }

    public String getNev() {
        return nev;
    }

    public String getGyarto() {
        return gyarto;
    }

    @Override
    public int compareTo(Elelmiszer o) {
        Collator col = Collator.getInstance();
        return col.compare(this.nev, o.nev);
    }
}
