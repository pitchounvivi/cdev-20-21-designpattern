package _iterator_;

import java.util.Iterator;

public class Arbre2 implements Iterable<Arbre2> {

    private String valeur;
    private Arbre2 sousArbreGauche;
    private Arbre2 sousArbreDroit;

    public Arbre2(String valeur) {
        this.valeur = valeur;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public Arbre2 getSousArbreGauche() {
        return sousArbreGauche;
    }

    public Arbre2 getSousArbreDroit() {
        return sousArbreDroit;
    }

    public void setSousArbreGauche(Arbre2 sousArbreGauche) {
        this.sousArbreGauche = sousArbreGauche;
    }

    public void setSousArbreDroit(Arbre2 sousArbreDroit) {
        this.sousArbreDroit = sousArbreDroit;
    }

    @Override
    public Iterator<Arbre2> iterator() {
        return new Arbre2Iterator(this);
    }
}
