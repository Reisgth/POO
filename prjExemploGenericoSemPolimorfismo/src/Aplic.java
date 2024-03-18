
import fatec.poo.model.Aluno;
import fatec.poo.model.Professor;

/**
 * @author GustavoReis
 */
public class Aplic {

    public static void main(String[] args) {
        Aluno objAlu = new Aluno(1010, "Carlos Silveira", "15/03/78");

        Professor objProfessor = new Professor(1111, "Dimas Cardoso", "25/06/1975");

        objAlu.setMensalidade(1500);

        System.out.println("Registro escolar: " + objAlu.getRegEscolar());
        System.out.println("Nome: " + objAlu.getNome());
        System.out.println("Data de Nascimento: " + objAlu.getDataNascimento());
        System.out.println("Mensalidade: " + objAlu.getMensalidade());

        objProfessor.setSalario(6000);

        System.out.println("\nRegistro Funcional: " + objProfessor.getRegistroFuncional());
        System.out.println("Nome: " + objProfessor.getNome());
        System.out.println("Data de Nascimento: " + objProfessor.getDataNascimento());
        System.out.println("Mensalidade: " + objProfessor.getSalario());
    }

}
