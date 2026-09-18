package Modelo;

public class Atendente extends Usuario{


    public Atendente(String nome, int matricula, String senha) {
        super(nome,matricula,senha);
    }

    @Override
    public boolean autenticar(String senha) {
        if (senha.equals(this.getSenha())) {
            System.out.println("Atendente autenticado com sucesso");
            return true;
        } else {
            System.out.println("Atendente não pode ser autenticado");
            return false;
        }
    }



}