package fatec.poo.model;

/**
 * @author GustavoReis
 */
public class Matricula {
    private String dtMatricula;
    private int qtdeFaltas;
    private double media;
    
    //definindo a multiplicidade 1 com aluno
    //Uma matricula está associado a um aluno
    private Aluno aluno;
    
    //Definindo a multiplicidade 1 com turma
    //Uma matricula está associada a uma turma
    private Turma turma;
    
    public Matricula (String dtMatricula) {
        this.dtMatricula = dtMatricula;
    }

    public void setQtdeFaltas(int qtdeFaltas) {
        this.qtdeFaltas = qtdeFaltas;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getDtMatricula() {
        return dtMatricula;
    }

    public int getQtdeFaltas() {
        return qtdeFaltas;
    }

    public double getMedia() {
        return media;
    }
    
    // Definindo o aluno dona da respectiva matricula
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    // Retornando o aluno dono da respectiva matricula
    public Aluno getAluno() {
        return aluno;
    }
       
    // Definindo a turma da respectiva matricula
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    // Retornando a turma da respectiva matricula
    public Turma getTurma() {
        return turma;
    }
}
