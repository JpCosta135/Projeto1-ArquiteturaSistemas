package Servico;

import Modelo.Atendente;
import Modelo.Professor;
import Modelo.Usuario;
import Repositorio.Repositorio;

public class FactoryUsuario {
    private Repositorio repositorio;

    public Usuario createUsuario(byte tipo, String nome, int matricula, String senha) {
        if (tipo != 1 && tipo != 2 ) {
            System.out.println("Tipo invalido, informe o valor 1 ou 2");
        }
         Usuario usuario = null;
        if (tipo == 1) {
                usuario = new Professor(nome,matricula,senha);
        } else {
                usuario = new Atendente(nome,matricula,senha);
        }
        return usuario;

    }


}