package Controlador;

import Modelo.Atendente;
import Modelo.Professor;
import Modelo.Projetor;
import Repositorio.Repositorio;

public class ControladorAtendente {
    private Repositorio repositorio;
    private Atendente atendente;

    public ControladorAtendente(Repositorio repositorio, Atendente atendente) {
        this.repositorio = repositorio;
        this.atendente = atendente;
    }

    public void realizarEmprestimo(Professor professor, Projetor  projetor){
        atendente.realizarEmprestimo(professor, projetor);
    }
    public void realizarDevolucao(Professor professor, Projetor projetor){
        atendente.realizarDevolucao(professor, projetor);
    }
    public void realizarAutenticacao(String senha) {
        atendente.autenticar(senha);
    }

    public void realizarCadastroProjetor(Projetor p){
       repositorio.adicionarProjetor(p);
    }
    public void atualizarProjetor(String codigo,String nome,String codigoNovo,boolean estado) {
        repositorio.setProjetor(codigo,nome,codigoNovo,estado);
    }
    public void removerProjetor(String codigo){
        repositorio.removerProjetor(codigo);
    }
    public Projetor lerProjetor(String codigo) {
        return repositorio.getProjetor(codigo);
    }















}
