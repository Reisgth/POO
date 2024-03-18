package fatec.poo.model;

/**
 * @author Gustavo Reis
 */
public class Instrutor extends Pessoa{
    private int identificacao;
    private String areaAtuacao;
    
    public Instrutor(int i, String n, String t) {
        super(n, t);
        identificacao = i;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }
    
    public void setAreaAtuacao(String at) {
        areaAtuacao = at;
    }
}
