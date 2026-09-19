package Servico;

import Modelo.Usuario;
import Repositorio.Repositorio;

public class CadastroUsuario {
    private Repositorio repositorio;

    public CadastroUsuario(Repositorio repositorio) {
        this.repositorio = repositorio;
    }

    public static void efetuarCadastro(byte tipo,String nome,int matricula,String senha){
        FactoryUsuario fabrica = new FactoryUsuario();
        Usuario usuario = fabrica.createUsuario(tipo,nome,matricula,senha);
    }

    public void removerUsuario(String matricula){
        repositorio.removerUsuario(matricula);
     }

    public void atualizarUsuario () {

    }

    public void lerUsuario (int matricula) {
        repositorio.getUsuario(matricula);
    }



}