import Controlador.ControladorAtendente;
import Controlador.ControladorUsuario;
import Modelo.Atendente;
import Modelo.Professor;
import AppRepositorio.Repositorio;
import Servico.CadastroUsuario;

void main() {

    Repositorio repositorio = new Repositorio();
    ControladorAtendente c1 = new ControladorAtendente(repositorio,(Atendente)repositorio.getUsuario(2345786));
    ControladorUsuario c2 = new ControladorUsuario(repositorio,repositorio.getUsuario(2097453));
    CadastroUsuario c3 = new CadastroUsuario(repositorio);

    c1.realizarEmprestimo((Professor)(repositorio.getUsuario(2097453)),repositorio.getProjetor("PAT-100235"));
    c2.realizarPermutacao((Professor)(repositorio.getUsuario(2234566)),repositorio.getProjetor("PAT-100235"));
    c1.realizarDevolucao((Professor)(repositorio.getUsuario(2234566)),repositorio.getProjetor("PAT-100235"));
    c2.realizarAutenticacao("ebt325");




}