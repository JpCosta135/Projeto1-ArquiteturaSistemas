import Controlador.ControladorAtendente;
import Controlador.ControladorUsuario;
import Repositorio.Repositorio;
import Servico.CadastroUsuario;
import Modelo.*;


public static void main(String[] args) {

   Repositorio repositorio = Repositorio.getInstancia();
   ControladorAtendente c1 = new ControladorAtendente(repositorio, (Modelo.Atendente) repositorio.getUsuario(2345786));
   ControladorUsuario c2 = new ControladorUsuario(repositorio, repositorio.getUsuario(2097453));
   CadastroUsuario c3 = new CadastroUsuario(repositorio);
   c1.realizarEmprestimo((Modelo.Professor) (repositorio.getUsuario(2097453)), repositorio.getProjetor("PAT-100235"));
   c2.realizarPermutacao((Modelo.Professor) (repositorio.getUsuario(2234566)), repositorio.getProjetor("PAT-100235"));
   c1.realizarDevolucao((Modelo.Professor) (repositorio.getUsuario(2234566)), repositorio.getProjetor("PAT-100235"));
   c2.realizarAutenticacao("ebt325"); // Instanciação dos objetos e operações básicas do sistema

   c3.efetuarCadastro((byte) 1, "Armando Alves", 1890298, "dfjo23");
   System.out.println(c3.lerUsuario(1890298));
   c3.atualizarUsuario(1890298, "Armando Alves", 1890298, "3737hr");
   c3.removerUsuario(1890298); // CRUD de professores

   c3.efetuarCadastro((byte) 2, "Caio Ferreira", 1943675, "tbrt4");
   System.out.println(c3.lerUsuario(1943675));
   c3.atualizarUsuario(1943675, "Caio Ferreira", 1943675, "en3tb");
   c3.removerUsuario(1943675); //  CRUD de atendentes

   Modelo.Projetor p1 = new Modelo.Projetor("BenQ MS550","PAT-100233",true);
   c1.realizarCadastroProjetor(p1);
   System.out.println(c1.lerProjetor("PAT-100233"));
   c1.atualizarProjetor("PAT-100233", "BenQ MS550", "PAT-100233", false);
   c1.removerProjetor("PAT-100233"); //  CRUD de projetores


}
