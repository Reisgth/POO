package fatec.poo.model;

/*
 * @author GustavoReis
 */
public class FuncionarioHorista extends Funcionario {
    private double valHorTrab;
    private int qtdHorTrab;
    
    public FuncionarioHorista(int r, String n, String dtAdm, String c, double vht) {
        super(r, n, dtAdm, c);
        
        valHorTrab = vht;
    }

    public void setQtdHorTrab(int qht) {
        qtdHorTrab = qht;
    }
       
    @Override
    // Aplicando o polimorfismo
    public double calcSalBruto() {
        return valHorTrab * qtdHorTrab;
    }
}
