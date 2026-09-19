import Controlador.ControladorAtendente;
import Controlador.ControladorUsuario;
import Modelo.Atendente;
import Modelo.Professor;
import Modelo.Projetor;
import Repositorio.Repositorio;
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

    c3.efetuarCadastro((byte)1,"Armando Alves",1890298,"dfjo23",repositorio);
    System.out.println(c3.lerUsuario(1890298));
    c3.atualizarUsuario(1890298,"Armando Alves",1890298,"3737hr");
    c3.removerUsuario(1890298);

    Projetor p1 = new Projetor("BenQ MS550","PAT-100233",true);
    c1.realizarCadastroProjetor(p1);
    System.out.println(c1.lerProjetor("PAT-100233"));
    c1.atualizarProjetor("PAT-100233","BenQ MS550","PAT-100233",false);
    c1.removerProjetor("PAT-100233");



}