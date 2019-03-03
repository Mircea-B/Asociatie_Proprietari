import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Asociatie implements Serializable {

    private static final long serialVersionUID = 3188460184616375933L;
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



    public void save(){

        try{
            FileOutputStream file = new FileOutputStream("asociatie.db");
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(this);

            out.close();
            file.close();
        }

        catch (IOException ex){

            System.out.println("IOException is caught");
        }
    }


    public static Asociatie loadFile(){

        Asociatie obj=null;
        try{
            FileInputStream file = new FileInputStream("asociatie.db");
            ObjectInputStream in = new ObjectInputStream(file);

            obj = (Asociatie) in.readObject();

            in.close();
            file.close();
        }

        catch (IOException ex){

            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return obj;
    }
}
