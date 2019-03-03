import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Asociatie {

    List<Apartament> listaApartamente;
    private Object Apartament;


    public Asociatie(List<Apartament> listaApartamente) {
        this.listaApartamente = listaApartamente;
    }


//    public void getAllLocatar(List<Apartament> listaLocatari2) {
//        return listaLocatari2.sort(listaLocatari2);
//    }

    public void registerLocatartoApartament(Locatar x, Apartament ap) {
        ap.addLocatar(x);
    }

    public void unregisterLocatartoApartament(Locatar x, Apartament ap) {
        listaApartamente.remove(x);

    }

    public List<Locatar> getallLocatarUnsorted() {
        List<Locatar> listalocataritemporara = new ArrayList<>();
        for (Apartament e : listaApartamente) {
            listalocataritemporara.addAll(e.getListaLocatari());
        }
        return listalocataritemporara;
    }

    public List<Locatar> getallLocatarSortedbyName() {
        List<Locatar> listalocataritemporara = new ArrayList<>();
        for (Apartament e : listaApartamente) {
            listalocataritemporara.addAll(e.getListaLocatari());
        }
        Collections.sort(listalocataritemporara, new Locatar.ComparatorbyName());
        return listalocataritemporara;
    }
    public List<Locatar> getallLocatarSortedbyNumar() {
        List<Locatar> listalocataritemporara = new ArrayList<>();
        for (Apartament e : listaApartamente) {
            listalocataritemporara.addAll(e.getListaLocatari());
        }
        Collections.sort(listalocataritemporara, new Locatar.ComparatorbyNumarAP());
        return listalocataritemporara;
    }


    public void registerApartament(Apartament x) {
        listaApartamente.add(x);

    }

    @Override
    public String toString() {
        return ("lista este: " + "\n" + listaApartamente + "\n");
    }

}
