package Modelo;

public class Professor extends Usuario {
    private Projetor projetor;

    public Professor(String nome, int matricula, String senha) {
        super(nome,matricula,senha);
        this.projetor = null;
    }

    @Override
    public boolean autenticar(String senha) {
        if (senha.equals(this.getSenha())) {
            System.out.println("Modelo.Professor autenticado com sucesso");
            return true;
        } else {
            System.out.println("Modelo.Professor não pode ser autenticado");
            return false;
        }
    }

    public Projetor getProjetor() {
        return projetor;
    }

    public void setProjetor(Projetor projetor) {
        this.projetor = projetor;
    }
}