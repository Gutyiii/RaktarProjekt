package main;

import java.time.LocalDate;
import java.util.Collection;
import modell.Elelmiszer;
import modell.Raktar;

public class Program {

    public static void main(String[] args) {

        Raktar raktar = new Raktar();
        raktar.felvesz(new Elelmiszer("üdítő", "Coca") {});
        raktar.felvesz(new Elelmiszer("szörp", "Fanta") {});
        raktar.felvesz(new Elelmiszer("alkohol", "Sprite") {});
        //raktar.felvesz(new Elelmiszer("chipsz", "Chio", "2022-11-03") {});
        raktar.getRaktar();
        Collection.sort(raktar);
        raktar.getRaktar();
        Collection.sort(raktar, new GyartoComparator());
        raktar.getRaktar();
    }

}
