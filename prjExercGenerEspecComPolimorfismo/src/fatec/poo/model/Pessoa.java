package fatec.poo.model;

/**
 * @author Gustavo Reis
 */
public abstract class Pessoa {
    private String nome;
    private int anoInscricao;
    private double totalCompras;

    public Pessoa(String n, int ai) {
        nome = n;
        anoInscricao = ai;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoInscricao() {
        return anoInscricao;
    }

    public double getTotalCompras() {
        return totalCompras;
    }
    
    public abstract double calcBonus(int anoAtual);
    
    public void addCompra(double buy){
        totalCompras += buy;
    }
}
