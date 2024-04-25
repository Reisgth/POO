package fatec.poo.model;

import java.util.ArrayList;

/**
 * @author GustavoReis
 */
public class Instrutor extends Pessoa {
    private int codigo;
    private String areaAtuacao;
    private double valorHora;
    
    // Definindo a multiplicidade 1..*
    // Um instrutor tem várias turmas
    private ArrayList<Turma> turmas;
    
    public Instrutor (String nome, int codigo){
        super(nome);
        this.codigo = codigo;
        
        turmas = new ArrayList<Turma>();
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public double getValorHora() {
        return valorHora;
    }
    
    public void addTurma(Turma t) {
        turmas.add(t);
        t.setInstrutor(this);
    }
}
