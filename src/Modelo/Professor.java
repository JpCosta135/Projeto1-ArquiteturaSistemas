package Modelo;

public class Professor extends Usuario {


    public Professor(String nome, int matricula, String senha) {
        super(nome,matricula,senha);
    }

    @Override
    public boolean autenticar(String senha) {
        if (senha.equals(this.getSenha())) {
            System.out.println("Modelo.Professor autenticado com sucesso");
            return true;
        } else {
            System.out.println("Modelo.Professor não pode ser autenticado");
            return false;
        }
    }



}