package Modelo;

public class Projetor {
    private String nome;
    private String codigo;
    private boolean estado;

    public Projetor(String nome,String codigo,boolean estado) {
        this.nome = nome;
        this.codigo = codigo;
        this.estado = estado;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String toString() {
        return "nome:"+ nome + " codigo:" + codigo + " estado: " + estado;
    }


}