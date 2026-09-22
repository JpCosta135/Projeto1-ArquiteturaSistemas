package Modelo;

public class Projetor {
    private String nome;
    private String codigo;
    private boolean disponivel;

    public Projetor(String nome,String codigo,boolean estado) {
        this.nome = nome;
        this.codigo = codigo;
        this.disponivel = estado;
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
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String toString() {
        return "nome:"+ nome + " codigo:" + codigo + " disponivel: " + disponivel;
    }


}