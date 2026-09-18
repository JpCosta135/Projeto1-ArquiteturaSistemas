package Servico;

import Modelo.Usuario;

public class CadastroUsuario {



    public void efetuarCadastro(int tipo,String nome,int matricula,String senha){
        FactoryUsuario fabrica = new FactoryUsuario();
        Usuario u = fabrica.createUsuario(tipo,nome,matricula,senha);
     }

     public boolean autenticar(Usuario u,String senha){
            return u.autenticar(senha);
     }




}