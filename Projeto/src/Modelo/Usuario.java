package Modelo;

public abstract class Usuario {
    private String nome;
    private int matricula;
    private String senha;

    public Usuario(String nome, int matricula, String senha) {
        this.nome = nome;
        this.matricula = matricula;
        this.senha = senha;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public final void autenticar(String senha){
        System.out.println("iniciando autenticação para: "+nome);
        carregarPermissoes(senha);
    }
    public abstract boolean carregarPermissoes(String senha);

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", senha='" + senha + '\'' +
                '}';
    }
}
