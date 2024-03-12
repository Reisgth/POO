import fatec.poo.model.Aluno;

/**
 * @author GustavoReis
 */
public class Aplic {
    public static void main(String[] args) {
        Aluno objAlu = new Aluno(1010, "Carlos Silveira", "15/03/78");
        
        objAlu.setMensalidade(1500);
        
        System.out.println("Registro escolar: " + objAlu.getRegEscolar());
        System.out.println("Nome: " + objAlu.getNome());
        System.out.println("Data de Nascimento: " + objAlu.getDataNascimento());
        System.out.println("Mensalidade: " + objAlu.getMensalidade());
    }
    
}
