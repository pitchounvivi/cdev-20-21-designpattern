package _iterator_;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arbre2Iterator implements Iterator<Arbre2> {

    private List<Arbre2> list = new ArrayList<>();

    Arbre2Iterator(Arbre2 arbre) {
        list.add(arbre);
    }

    @Override
    public boolean hasNext() {
        return !list.isEmpty();
    }

    @Override
    public Arbre2 next() {
        Arbre2 result = list.remove(0);
        if (result.getSousArbreGauche() != null)
            list.add(result.getSousArbreGauche());
        if (result.getSousArbreDroit() != null)
            list.add(result.getSousArbreDroit());
        return result;
    }
}
