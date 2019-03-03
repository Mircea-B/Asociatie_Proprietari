import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Apartament implements Comparable<Apartament>, Serializable {

    private static final long serialVersionUID = 8160194881594223976L;

    @Override
    public int compareTo(Apartament o) {
        return this.nrApartament-o.nrApartament;
    }


    Asociatie asociatia;
    private int nrCamere;
    private List<Locatar> listaLocatari;
    private int nrApartament;

    public Apartament(int nrCamere, int nrApartament) {
        this.nrCamere = nrCamere;
        this.listaLocatari = new ArrayList<>();
        this.nrApartament = nrApartament;

    }

    void addLocatar(Locatar y) {
        listaLocatari.add(y);
    }

    void removeLocatar(Locatar x) {
        listaLocatari.remove(x);

    }

    public String toString() {


        return (nrApartament + " cu nr de camere: " + nrCamere +"\n");
    }

    public List<Locatar> getListaLocatari() {
        return listaLocatari;
    }

    public List<Locatar> getListaLocatarSorted(){
       return null;

    }



}
