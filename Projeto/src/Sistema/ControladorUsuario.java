package Sistema;

import Modelo.Professor;
import Modelo.Projetor;
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

    public void realizarPermutacao(Professor professor, Projetor projetor) {
        if (usuario instanceof Professor) {
            ((Professor) usuario).permutarProjetor(professor);
        } else {
            System.out.println("Usuário não possui permissão para realizar permutação");
        }
    }





}
