package Controller;

import Model.Professor;
import Model.Projetor;
import Model.Usuario;
import Repository.Repositorio;
import Service.CadastroUsuario;

public class ControladorUsuario {
    private Repositorio repositorio;
    private Usuario usuario;

    public ControladorUsuario(Repositorio repositorio, Usuario usuario) {
        this.repositorio = repositorio;
        this.usuario = usuario;
    }

    public void realizarCadastro(byte tipo,String nome, int matricula,String senha,CadastroUsuario cadastro) {
        cadastro.efetuarCadastro(tipo,nome,matricula,senha);
    }

    public void realizarAutenticacao(String senha) {
        usuario.autenticar(senha);
    }

    public void realizarPermutacao(Professor professor, Projetor projetor) {
        if (usuario instanceof Professor) {
            ((Professor) usuario).permutarProjetor(professor);
            this.usuario = professor;
        } else {
            System.out.println("Usuário não possui permissão para realizar permutação");
        }
    }





}
