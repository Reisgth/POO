package fatec.poo.model;

/**
 * @author GustavoReis
 */
public class Aluno extends Pessoa {

    private int regEscolar;
    private double mensalidade;

    public Aluno(int r, String n, String dn) {
        super(n, dn);   //Chamada do construtor da superclasse ou classe pai
        regEscolar = r;
    }

    public void setMensalidade(int m) {
        mensalidade = m;
    }

    public int getRegEscolar() {
        return regEscolar;
    }

    public double getMensalidade() {
        return mensalidade;
    }
}
