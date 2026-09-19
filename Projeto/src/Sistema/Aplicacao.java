import Modelo.Atendente;
import Modelo.Professor;
import Sistema.ControladorAtendente;
import Sistema.ControladorUsuario;
import Sistema.Repositorio;

void main() {

    Repositorio repositorio = new Repositorio();
    ControladorAtendente c1 = new ControladorAtendente(repositorio,(Atendente)repositorio.getUsuario(2345786));
    ControladorUsuario c2 = new ControladorUsuario(repositorio,repositorio.getUsuario(2097453));

    c1.realizarEmprestimo((Professor)(repositorio.getUsuario(2097453)),repositorio.getProjetor("PAT-100235"));
    c2.realizarPermutacao((Professor)(repositorio.getUsuario(2234566)),repositorio.getProjetor("PAT-100235"));
    c1.realizarDevolucao((Professor)(repositorio.getUsuario(2234566)),repositorio.getProjetor("PAT-100235"));
    c2.realizarAutenticacao("dfh435");









}