package fatec.poo.model;

import java.util.ArrayList;

/**
 * @author GustavoReis
 */
public class Curso {
    private String sigla, descricao;
    private int cargaHoraria;
    private double valor;
    
    // Definindo a multiplicidade 1..* com turma
    // Um Curso possui varias turmas
    private ArrayList<Turma> turmas;
    
    public Curso(String sigla, String descricao){
        this.sigla = sigla;
        this.descricao = descricao;
        
        turmas = new ArrayList<Turma>(); 
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getSigla() {
        return sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public double getValor() {
        return valor;
    }
    
    public void addTurma(Turma t){
        turmas.add(t);
        t.setCurso(this);
    }
}
