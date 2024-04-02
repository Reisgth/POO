package fatec.poo.model;

/**
 * @author Dimas
 */
public class FuncionarioHorista extends Funcionario{
    private double valHorTrab;
    private int qtdeHorTrab;

    public FuncionarioHorista(int r, String n, String dtAdm, double vht) {
        super(r, n, dtAdm);//chamada do método da superclasse
        valHorTrab = vht;
    }

    public void setQtdeHorTrab(int qht) {
        qtdeHorTrab = qht;
    }
    
    //Aplicando o polimorfismo
    //sobreposição(override) de métodos
    public double calcSalBruto(){
        return(valHorTrab * qtdeHorTrab);
    }
    
    public double calcGratificacao(){
        return(0.075 * calcSalBruto());
    }
    
    //Aplicando o polimorfismo
    public double calcSalLiquido(){
        return(super.calcSalLiquido() + calcGratificacao());
    }
}
