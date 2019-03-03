import java.util.ArrayList;
import java.util.List;

import static sun.nio.ch.IOUtil.load;

public class Runner {


    public static void main(String[] args) {

//        List<Locatar> listaLocatari = new ArrayList<>(1);
//        List<Apartament> listaApartamente=new ArrayList<>(50);
//        Asociatie asociatie=new Asociatie(listaApartamente);
//        Apartament unu = new Apartament(2, 2);
//        Apartament doi = new Apartament(3, 1);
//        Apartament trei = new Apartament(3, 3);
//        Locatar mihai = new Locatar("Mihai",unu);
//        Locatar xander = new Locatar("Xander",doi);
//        Locatar ana = new Locatar("Ana",trei);
//        Locatar bogdan = new Locatar("Bogdan",doi);
//
//        unu.addLocatar(mihai);
//        unu.addLocatar(ana);
//        doi.addLocatar(xander);
//        doi.addLocatar(bogdan);
//
//        listaLocatari.add(0, mihai);
//        listaLocatari.add(1, xander);
//        listaLocatari.add(2, ana);
//
//        listaApartamente.add(doi);
//        listaApartamente.add(unu);
//        System.out.println(asociatie.getallLocatarSortedbyName());
//        System.out.println(asociatie.getallLocatarSortedbyNumar());
//        asociatie.save();
        Asociatie aaa= Asociatie.loadFile();
        System.out.println(aaa.getallLocatarSortedbyNumar());





    }
}
