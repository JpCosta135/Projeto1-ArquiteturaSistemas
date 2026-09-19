package Servico;

import Modelo.Usuario;

public class CadastroUsuario {



    public static void efetuarCadastro(byte tipo,String nome,int matricula,String senha){
        FactoryUsuario fabrica = new FactoryUsuario();
        Usuario usuario = fabrica.createUsuario(tipo,nome,matricula,senha);
    }

    public static void removerUsuario(String matricula){

     }

    public static void atualizarUsuario () {

    }

    public static void lerUsuario () {

    }



}