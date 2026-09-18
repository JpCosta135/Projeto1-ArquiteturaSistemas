import java.util.ArrayList;
import java.util.Hashtable;

public class Repositorio {
    private Hashtable <Integer,Projetor> inventario;

    public Repositorio () {
        inventario = new Hashtable<>();
        Projetor p1 = new Projetor("Epson PowerLite X49","PAT-100231",true);
        Projetor p2 = new Projetor("BenQ MS550","PAT-100233",false);
        Projetor p3 = new Projetor("ViewSonic PA503S","PAT-100235",true);
    }


    public Projetor getProjetor(int id){
        Projetor projetor = null;
       projetor = inventario.get(id);
       return projetor;

    }





}