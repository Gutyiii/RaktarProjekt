package modell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Raktar implements Iterable<Elelmiszer> {

    private List<Elelmiszer> elemiszerek;
    private ArrayList<Elelmiszer> raktar;

    public Raktar() {
        raktar = new ArrayList<>();
    }

    public void felvesz(Elelmiszer elelmiszer) {
        raktar.add(elelmiszer);
    }

    public List<Elelmiszer> getRaktar() {
        return Collections.unmodifiableList(elemiszerek);
    }

    @Override
    public Iterator<Elelmiszer> iterator() {
        return raktar.iterator();
    }

}
