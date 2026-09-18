import java.util.Hashtable;

public class Repositorio {
    private Hashtable <String, Projetor> inventario;

    public Repositorio () {
        inventario = new Hashtable<>();
        Projetor p1 = new Projetor("Epson PowerLite X49","PAT-100231",true);
        inventario.put(p1.getCodigo(),p1);
        Projetor p2 = new Projetor("BenQ MS550","PAT-100233",false);
        inventario.put(p2.getCodigo(),p2);
        Projetor p3 = new Projetor("ViewSonic PA503S","PAT-100235",true);
        inventario.put(p3.getCodigo(),p3);
    }

    public Projetor getProjetor(int id){
        Projetor projetor = null;
       projetor = inventario.get(id);
       return projetor;

    }



}