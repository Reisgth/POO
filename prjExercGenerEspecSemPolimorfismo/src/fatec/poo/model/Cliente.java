package fatec.poo.model;

/**
 * @author Gustavo Reis
 */
public class Cliente extends Pessoa{
    private String cpf;
    private double peso, altura;
    
    public Cliente(String c, String n, String t) {
        super(n, t);
        cpf = c;
    }

    public String getCpf() {
        return cpf;
    }

    public double getPeso() {
        return peso;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setPeso(double p) {
        peso = p;
    }

    public void setAltura(double a) {
        altura = a;
    }
    
    public double calcIMC() {
        return peso/(altura*altura);
    }
}
