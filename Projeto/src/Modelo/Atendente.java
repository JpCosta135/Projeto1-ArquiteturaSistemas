package Modelo;

import Repositorio.Repositorio;

import java.util.Scanner;

public class Atendente extends Usuario {
    private Repositorio repositorio;

    public Atendente(String nome, int matricula, String senha, Repositorio repositorio) {
        super(nome,matricula,senha);
        this.repositorio = repositorio;
    }

    @Override
    public boolean autenticar(String senha) {
        if (senha.equals(this.getSenha())) {
            System.out.println("Modelo.Atendente autenticado com sucesso");
            return true;
        } else {
            System.out.println("Modelo.Atendente não pode ser autenticado");
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

    public void cadastrarProjetor(Projetor p) {
        repositorio.adicionarProjetor(p);
    }
    public void removerProjetor(String codigo) {
        repositorio.removerProjetor(codigo);
    }
    public void atualizarProjetor(String codigo,String nome, String codigoNovo, boolean estado) {
        repositorio.setProjetor(codigo,nome,codigoNovo,estado);
    }
    public Projetor getProjetor(String codigo) {
       return repositorio.getProjetor(codigo);
    }

}