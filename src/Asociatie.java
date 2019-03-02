import java.util.ArrayList;
import java.util.List;

public class Asociatie {

    List<Apartament> listaApartamente;


    public Asociatie(List<Apartament> listaApartamente) {
        this.listaApartamente = listaApartamente;
    }


//    public void getAllLocatar(List<Locatar> listaLocatari2) {
//        return listaLocatari2.sort(listaApartamente);
//    }

    public void registerLocatartoApartament(Locatar x, Apartament ap) {
        ap.addLocatar(x);
    }
    public void unregisterLocatartoApartament(Locatar x,Apartament ap){
        listaApartamente.remove(x);

    }
public void registerApartament(Apartament x){
        listaApartamente.add(x);
}
@Override
public String toString(){
        return ("lista este: "+"\n"+ listaApartamente +"\n");
}

}
