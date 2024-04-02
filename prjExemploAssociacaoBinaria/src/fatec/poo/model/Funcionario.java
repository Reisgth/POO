package fatec.poo.model;

/**
 * @author Dimas
 */
public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmissao;
    private String cargo;
    
    private Departamento departamento; //Definição da multiplicidade 1 (um funcionário está associado a um departamento)

    public Funcionario(int r, String n, String dtAdm) {
        registro = r;
        nome = n;
        dtAdmissao = dtAdm;
    }

    public int getRegistro() {
        return registro;
    }

    public String getNome() {
        return nome;
    }

    public String getDtAdmissao() {
        return dtAdmissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String c) {
        cargo = c;
    }
    
    // Retorna o endereço de um objeto da classe departamento
    public Departamento getDepartamento() {
        return departamento;
    }
    
    //Esse metodo tem como parâmetro de entrada o endereço de um objeto da classe departamento
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    //Método abstrato
    //Apresenta apenas a assinatura
    abstract public double calcSalBruto();
    
    public double calcDesconto(){
        return(0.10 * calcSalBruto());
    }
    
    public double calcSalLiquido(){
        return(calcSalBruto() - calcDesconto());
    }
}
