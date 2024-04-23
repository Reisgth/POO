package fatec.poo.model;

/**
 * @author Gustavo Reis
 */
public class PessoaFisica extends Pessoa{
    private String cpf;
    private double base; //Valor que será utilizado no calculo do bonus
    
    public PessoaFisica(String cpf, String nome, int anoInscricao) {
        super(nome, anoInscricao);
        this.cpf = cpf;
    }
    
    @Override
    public double calcBonus(int anoAtual) {
        double bonus = 0;
        
        if (super.getTotalCompras() > 12000) {
            bonus = (anoAtual - getAnoInscricao()) * base;
        }
        
        return bonus;
    }

    public String getCpf() {
        return cpf;
    }
    
    public void setBase(double b) {
        base = b;
    }

    public double getBase() {
        return base;
    }    
}
