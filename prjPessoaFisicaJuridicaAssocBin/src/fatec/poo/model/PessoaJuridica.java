package fatec.poo.model;

/**
 * @author GustavoReis 
 */
public class PessoaJuridica extends Pessoa{
    private String cgc;
    private double taxaIncentivo; // taxa de incentivo dada em porcentagem

    public PessoaJuridica(String cgc, String nome, int anoInscricao) {
        super(nome, anoInscricao);
        this.cgc = cgc;
    }

    @Override
    public double calcBonus(int anoAtual) {     
        return ((taxaIncentivo/100) * getTotalCompras()) * (anoAtual - getAnoInscricao());
    }
    
    public String getCgc (){
        return cgc;
    }
    
    public void setTaxaIncentivo(double ti){
        // valor da taxa de incentivo em porcentagem
        taxaIncentivo = ti;
    }
    
    public double getTaxaIncentivo(){
        return taxaIncentivo;
    }
}
