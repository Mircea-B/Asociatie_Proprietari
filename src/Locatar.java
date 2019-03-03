import java.io.Serializable;
import java.util.Comparator;

public class Locatar implements Serializable {

    private static final long serialVersionUID = 3991302230670436337L;
    private String nume;
    private Apartament ap;


    public Locatar(String nume,Apartament ap) {
        this.nume = nume;
        this.ap = ap;

    }

    public String toString() {

        return ("Numelocatar: " + nume + "-> " + "ap: " + ap);
    }
    public static class ComparatorbyName implements Comparator<Locatar> {

        @Override
        public int compare(Locatar o1, Locatar o2) {
            return o1.nume.compareTo(o2.nume);
        }
    }

    public static class ComparatorbyNumarAP implements Comparator<Locatar> {

        @Override
        public int compare(Locatar o1, Locatar o2) {
            return o1.ap.compareTo(o2.ap);
        }
    }
}
