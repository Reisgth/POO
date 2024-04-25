package fatec.poo.model;

import java.util.ArrayList;

/**
 * @author GustavoReis
 */
public class Turma {
    private int codigo, qtdeVagas;
   
    // Definindo a multiplicidade 1 com instrutor
    // Uma turma possui um instrutor
    private Instrutor instrutor;
    
    // Definindo a multiplicidade 1..* com Matricula
    // Uma turma possui várias matriculas
    private ArrayList<Matricula> matriculas;
    
    
    // Definindo a multiplicidade 1 com curso
    // Uma turma possui um curso
    private Curso curso;
    
    public Turma (int codigo) {
        this.codigo = codigo;
        
        // Iniciando o ArrayList de matriculas
        matriculas = new ArrayList<Matricula>();
    }

    public void addMatricula(Matricula m){
        matriculas.add(m);
    }
    
    public void setQtdeVagas(int qtdeVagas) {
        this.qtdeVagas = qtdeVagas;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getQtdeVagas() {
        return qtdeVagas;
    }
    
    public int calcQtdeAprovados() {
        return 0;
    }
    
    public int calcQtdeReprovados() {
        return 0;
    }
    
    public Instrutor getInstrutor(){
        return instrutor;
    }

    public void setInstrutor(Instrutor i) {
        this.instrutor = instrutor;
    }
    
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    
}
