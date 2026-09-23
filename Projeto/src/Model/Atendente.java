package Model;

public class Atendente extends Usuario {


    public Atendente(String nome, int matricula, String senha) {
        super(nome,matricula,senha);
    }

    @Override
    public boolean carregarPermissoes(String senha) {
        if (senha.equals(this.getSenha())) {
            System.out.println("Atendente "+getNome()+ " autenticado com sucesso");
            return true;
        } else {
            System.out.println("Atendente "+getNome()+ " não pode ser autenticado");
            return false;
        }
    }
    public boolean realizarEmprestimo(Professor p, Projetor projetor)  {
        if (projetor.isDisponivel()) {
            projetor.setDisponivel(false);
            p.setProjetor(projetor);
            System.out.println("Emprestimo realizado com sucesso!");
            return true;
        }  else {
            System.out.println("Emprestimo não obteve êxito.");
            return false;
        }
    }
    public boolean realizarDevolucao(Professor p, Projetor projetor) {
        if (projetor.isDisponivel() == false) {
            projetor.setDisponivel(true);
            p.setProjetor(null);
            System.out.println("Devolução realizada com sucesso!");
            return true;
        } else {
            System.out.println("Devolução não obteve êxito.");
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString()+ " Atendente ";
    }

}