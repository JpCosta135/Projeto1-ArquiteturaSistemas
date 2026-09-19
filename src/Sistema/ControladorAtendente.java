package Sistema;

import Modelo.Atendente;
import Modelo.Professor;
import Modelo.Projetor;

public class ControladorAtendente {
    private Repositorio repositorio;
    private Atendente atendente;

    public ControladorAtendente(Repositorio repositorio, Atendente atendente) {
        this.repositorio = repositorio;
        this.atendente = atendente;
    }

    public void realizarEmprestimo(Professor p, Projetor projetor)  {
         atendente.realizarEmprestimo(p,projetor);
    }

    public void realizarDevolucao(Professor p, Projetor projetor)  {
        atendente.realizarDevolucao(p,projetor);
    }

    public void realizarCadastroProjetor()  {
        atendente.cadastrarProjetor();
    }






}