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
        m.setTurma(this);
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
        int qtdeAprovados = 0;
        
        // Iniciando a verificação de cada aluno matriculado na turma
        for(int i=0;i<matriculas.size();i++){
            // Verificando se o aluno matriculado possui média maior ou igual a 5
            if(matriculas.get(i).getMedia() >= 5){
                // Após levar em consideração que o aluno precisa de pelo menos 60%
                // de presença para aprovação, verificamos se o numero de faltas dele
                // é menor do que 40% da carga horário do curso
                if((matriculas.get(i).getQtdeFaltas()) <= curso.getCargaHoraria() * 0.4){
                    qtdeAprovados+=1;
                }
            }
        }
        
        return qtdeAprovados;
    }
    
    public int calcQtdeReprovados() {
        // Para o calculo de aprovados fazemos uma subtração do total de alunos
        // matriculados com os aprovados, sobrando apenas aqueles que reprovaram
        return matriculas.size() - calcQtdeAprovados();
    }
    
    public Instrutor getInstrutor(){
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }
    
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    // Metodo solicitado para exibição das informações cadastradas dos alunos
    // e suas matriculas em uma respctiva turma de um curso
    public void listarAlunos(){
        System.out.println("\n\n\n\nRelacao Alunos da Turma");
        
        System.out.print("Sigla do curso: " + this.getCurso().getSigla() + "\t\t");
        System.out.println("Nome do curso: " + this.getCurso().getDescricao());
        
        System.out.println("Sigla da turma: " + this.getCodigo());
        
        System.out.println("Nome do Instrutor: " + this.getInstrutor().getNome());
        
        System.out.print("Nome do Aluno" + "\t");
        System.out.print("Qtde. Faltas" + "\t");
        System.out.print("Media" + "\t\t");
        System.out.println("Situacao");
        for(int i=0; i<matriculas.size(); i++){
            System.out.print(matriculas.get(i).getAluno().getNome() + "\t\t");
            System.out.print(matriculas.get(i).getQtdeFaltas() + "\t\t");
            System.out.print(matriculas.get(i).getMedia() + "\t\t");
            if(matriculas.get(i).getMedia() > 5)
                System.out.println("Aprovado");
            else
                System.out.println("Reprovado");
        }
        System.out.println("\nQtde. de Alunos:                " + matriculas.size());
        System.out.println("Qtde. de Alunos aprovados:      " + this.calcQtdeAprovados());
        System.out.println("Qtde. de Alunos reprovados:     " + this.calcQtdeReprovados() );
     } 
}
