import java.util.ArrayList;
import java.util.List;

public class Runner {


    public static void main(String[] args) {

        List<Locatar> listaLocatari = new ArrayList<>(1);
        List<Apartament> listaApartamente=new ArrayList<>(50);
        Asociatie asociatie=new Asociatie(listaApartamente);
        Apartament unu = new Apartament(2, 2);
        Apartament doi = new Apartament(3, 1);
        Apartament trei = new Apartament(3, 1);
        Locatar mihai = new Locatar("Mihai");
        Locatar mircea = new Locatar("Mircea");
        Locatar ana = new Locatar("Ana");

        unu.addLocatar(mihai);
        unu.addLocatar(ana);
        doi.addLocatar(mircea);

        listaLocatari.add(0, mihai);
        listaLocatari.add(1, mircea);
        listaLocatari.add(2, ana);
        listaLocatari.remove(2);
        listaApartamente.add(doi);
        listaApartamente.add(unu);

        System.out.println(unu);
        System.out.println(doi);
    }
}
