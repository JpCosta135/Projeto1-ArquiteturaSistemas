package Classes;

import Modelo.Atendente;
import Modelo.Professor;
import Modelo.Projetor;

public class Controlador {



    public void realizarEmprestimo(Professor p, Atendente atendente, Projetor projetor)  {
         atendente.realizarEmprestimo(p,projetor);
    }





}