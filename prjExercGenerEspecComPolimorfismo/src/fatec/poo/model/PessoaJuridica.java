package fatec.poo.model;

/**
 * @author GustavoReis 
 */
public class PessoaJuridica extends Pessoa{
    private String cgc;
    private double taxaIncentivo; // taxa de incentivo dada em porcentagem

    public PessoaJuridica(String c, String n, int ai) {
        super(n, ai);
        cgc = c;
    }

    @Override
    public double calcBonus(int anoAtual) {     
        return ((taxaIncentivo/100) * getTotalCompras()) * (anoAtual - getAnoInscricao());
    }
    
    public void setTaxaIncentivo(double ti){
        // valor da taxa de incentivo em porcentagem
        taxaIncentivo = ti;
    }
    
    public String getCgc (){
        return cgc;
    }
    
    public double getTaxaIncentivo(){
        return taxaIncentivo;
    }
}
