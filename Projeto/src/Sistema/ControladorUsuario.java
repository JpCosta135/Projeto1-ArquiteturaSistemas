package Sistema;

import Modelo.Usuario;

public class ControladorUsuario {
    private Repositorio repositorio;
    private Usuario usuario;

    public ControladorUsuario(Repositorio repositorio, Usuario usuario) {
        this.repositorio = repositorio;
        this.usuario = usuario;
    }

    public void realizarCadastro(byte tipo,String nome, int matricula,String senha) {
        usuario.efetuarCadastro(tipo,nome,matricula,senha);
    }

    public void realizarAutenticacao(String senha) {
        usuario.autenticar(senha);
    }







}
