package Modelo;

import java.util.Scanner;

public class Atendente extends Usuario {

    public Atendente(String nome, int matricula, String senha) {
        super(nome,matricula,senha);
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
            return true;
        }  else {
            return false;
        }
    }

    public boolean realizarDevolucao(Professor p, Projetor projetor) {
        if (projetor.isDisponivel() == false) {
            projetor.setDisponivel(true);
            p.setProjetor(null);
            return true;
        } else {
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

    }

}