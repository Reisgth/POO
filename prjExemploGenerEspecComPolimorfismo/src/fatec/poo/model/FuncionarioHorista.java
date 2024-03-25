package fatec.poo.model;

/*
 * @author GustavoReis
 */
public class FuncionarioHorista extends Funcionario {
    private double valHorTrab;
    private int qtdHorTrab;
    
    public FuncionarioHorista(int r, String n, String dtAdm, double vht) {
        super(r, n, dtAdm);
        
        valHorTrab = vht;
    }

    public void setQtdHorTrab(int qht) {
        qtdHorTrab = qht;
    }
       
    @Override
    // Aplicando o polimorfismo
    public double calcSalBruto() {
        return (valHorTrab * qtdHorTrab);
    }
    
    public double calcGratificacao(){
        return (0.075 * calcSalBruto());
    }
    
    @Override
    // aplicando o polimorfismo substiuindo o calcSalLiquido da superclasse
    public double calcSalLiquido(){
        return (super.calcSalLiquido() - calcDesconto());
    }
}
