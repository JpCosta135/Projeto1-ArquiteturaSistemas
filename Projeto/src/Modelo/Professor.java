package Modelo;

public class Professor extends Usuario {
    private Projetor projetor;

    public Professor(String nome, int matricula, String senha) {
        super(nome, matricula, senha);
        this.projetor = null;
    }
    public Projetor getProjetor() {
        return projetor;
    }
    public void setProjetor(Projetor projetor) {
        this.projetor = projetor;
    }

    @Override
    public boolean carregarPermissoes(String senha) {
        if (senha.equals(this.getSenha())) {
            System.out.println("Professor "+getNome()+" autenticado com sucesso!");
            return true;
        } else {
            System.out.println("Professor "+getNome()+" não pode ser autenticado.");
            return false;
        }
    }

    public boolean permutarProjetor(Professor p) {
        if (this.projetor != null) {
            p.setProjetor(this.projetor);
            setProjetor(null);
            System.out.println("Permutação Realizada com sucesso!");
            return true;
        } else {
            System.out.println("Permutação não obteve êxito.");
            return false;
        }
    }


    @Override
    public String toString() {
        return super.toString() + " Professor{" +
                "projetor=" + projetor +
                '}';
    }
}

