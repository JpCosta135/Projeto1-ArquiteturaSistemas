package Servico;

import Modelo.Usuario;
import Repositorio.Repositorio;

public class CadastroUsuario {
    private Repositorio repositorio;

    public CadastroUsuario(Repositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void efetuarCadastro(byte tipo, String nome, int matricula, String senha) {
        FactoryUsuario fabrica = new FactoryUsuario();
        Usuario usuario = fabrica.createUsuario(tipo, nome, matricula, senha);
        repositorio.adicionarUsuario(usuario);
    }
    public void removerUsuario(int matricula) {
        if (repositorio.getUsuario(matricula) != null) {
            repositorio.removerUsuario(matricula);
        } else {
            System.out.println("Usuário não encontrado!");
        }
    }
    public void atualizarUsuario(int matricula, String nome, int matriculaNova, String senha) {
        if (repositorio.getUsuario(matricula) != null) {
            repositorio.setUsuario(matricula, nome, matriculaNova, senha);
        } else {
            System.out.println("Usuário não encontrado!");
        }
    }
    public Usuario lerUsuario(int matricula) {
        return repositorio.getUsuario(matricula);
    }

}
