import java.util.ArrayList;
import java.util.List;

public class Apartament {
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


        return (nrApartament + " cu nr de camere: " + nrCamere +" "+ listaLocatari+"\n");
    }


}
