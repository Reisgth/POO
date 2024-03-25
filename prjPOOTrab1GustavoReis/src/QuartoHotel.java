/**
 * @author Gustavo Reis 
 */

public class QuartoHotel {
    private int numQuarto,numRG;
    private double valorDiaria, totalFaturado;
    private boolean situacao = true;

    public QuartoHotel(int nq, double vd) {
        numQuarto = nq;
        valorDiaria = vd;
    }
    
    public void reservar(int rg){
        numRG = rg;
        situacao = false;
    }
    
    public double liberar(int qtdDias){
        totalFaturado += qtdDias * valorDiaria;
        numRG = 0;
        situacao = true;
        
        return qtdDias * valorDiaria;
    }

    public double getTotalFaturado() {
        return totalFaturado;
    }

    public boolean getSituacao() {
        return situacao;
    }
}
