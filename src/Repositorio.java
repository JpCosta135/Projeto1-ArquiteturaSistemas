import java.util.Hashtable;

public class Repositorio {
    private Hashtable <String, Projetor> inventario;
    private Hashtable <Integer, Usuario> usuarios;

    public Repositorio() {
        inventario = new Hashtable<>();
        Projetor p1 = new Projetor("Epson PowerLite X49","PAT-100231",true);
        inventario.put(p1.getCodigo(),p1);
        Projetor p2 = new Projetor("BenQ MS550","PAT-100233",false);
        inventario.put(p2.getCodigo(),p2);
        Projetor p3 = new Projetor("ViewSonic PA503S","PAT-100235",true);
        inventario.put(p3.getCodigo(),p3);
        Projetor p4 = new Projetor("Epson PowerLite X05","PAT-100237",false);

        usuarios = new Hashtable<>();
        Usuario u1 = new Professor("Jose Almeida",2097453,"dfh435");
        usuarios.put(u1.getMatricula(),u1);
        Usuario u2 = new Professor("Joao Silva",2234566,"ebt325");
        usuarios.put(u2.getMatricula(),u2);
        Usuario u3 = new Atendente("Joaquim Bezerra",2345786,"wteb43");
        usuarios.put(u3.getMatricula(),u3);
        Usuario u4 = new Atendente("Maria Campos",2154608,"5435nr");
        usuarios.put(u4.getMatricula(),u4);
    }
    public Projetor getProjetor(String codigo){
        Projetor projetor;
        projetor = inventario.get(codigo);
        return projetor;
    }
    public Usuario getUsuario(int matricula ){
        Usuario usuario;
        usuario =  usuarios.get(matricula);
        return usuario;
    }

}