package Sistema;

import Modelo.Atendente;
import Modelo.Professor;
import Modelo.Projetor;

public class Controlador {
    private Repositorio repositorio;



    public void realizarEmprestimo(Professor p, Atendente atendente, Projetor projetor)  {
         atendente.realizarEmprestimo(p,projetor);
    }





}