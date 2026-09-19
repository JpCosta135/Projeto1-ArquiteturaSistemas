package Servico;

import Modelo.Atendente;
import Modelo.Professor;
import Modelo.Projetor;

public class Emprestimo {

       public boolean realizarEmprestimo(Professor p, Atendente atendente, Projetor projetor)  {
           return atendente.realizarEmprestimo(p,projetor);
       }






}