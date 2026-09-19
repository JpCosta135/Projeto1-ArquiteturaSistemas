package Modelo;
import Sistema.Repositorio;
import java.util.Scanner;

public class Atendente extends Usuario {
    private Repositorio repositorio;

    public Atendente(String nome, int matricula, String senha) {
        super(nome,matricula,senha);
        this.repositorio = null;
    }

    @Override
    public boolean autenticar(String senha) {
        if (senha.equals(this.getSenha())) {
            System.out.println("Atendente autenticado com sucesso");
            return true;
        } else {
            System.out.println("Atendente não pode ser autenticado");
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

    public void cadastrarProjetor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do projetor: ");
        String nome = sc.nextLine();
        System.out.println("Digite o codigo do projetor: ");
        String codigo = sc.nextLine();
        System.out.println("O projetor esta disponivel?");
        boolean disponivel = sc.nextBoolean();
        Projetor p = new Projetor(nome,codigo,disponivel);
    }

    public void removerProjetor(String codigo) {
        repositorio.removeProjetor(codigo);
    }

    public void atualizarProjetor(String codigo,String nome, String codigoNovo, boolean estado) {
        repositorio.setProjetor(codigo,nome,codigoNovo,estado);
    }

    public Projetor getProjetor(String codigo) {
       return repositorio.getProjetor(codigo);
    }

}