package fatec.poo.model;

/**
 * @author GustavoReis
 */
public class FuncionarioMensalista extends Funcionario{
    private double valSalMin;
    private int numSalMin;
    
    public FuncionarioMensalista(int r, String n, String dtAdm, double vsm) {
        super(r, n, dtAdm);
        valSalMin = vsm;
    }
    
    public void setNumSalMin(int nsm){
        numSalMin = nsm;
    }

    @Override
    public double calcSalBruto() {
        return valSalMin * numSalMin;
    }
    
}
