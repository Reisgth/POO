package fatec.poo.model;

/**
 * @author GustavoReis
 */

public class Aluno extends Pessoa {
    private String ra, escolaridade;
    
    // Definindo a multiplicidade 1
    // Um aluno está associada uma matricula
    private Matricula matricula;
    
    public Aluno(String nome, String ra) {
        super(nome);
        this.ra = ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public String getEscolaridade() {
        return escolaridade;
    }
    
    // Definindo a matricula do respectivo aluno
    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    // Retornando a matricula do respectivo aluno
    public Matricula getMatricula() {
        return matricula;
    }
}
