public class Projetor {
    private String nome;
    private int codigo;
    private boolean disponivel;

    public Projetor(String nome, int codigo, boolean disponivel) {
        this.nome = nome;
        this.codigo = codigo;
        this.disponivel = disponivel;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }



}