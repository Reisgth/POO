package fatec.poo.model;

/**
 * @author GustavoReis
 */
public abstract class Funcionario {
    private int registro;
    private String nome, dtAdmissao, cargo;
    
    public Funcionario(int r, String n, String dtAdm){
        registro = r;
        nome = n;
        dtAdmissao = dtAdm;
    }
    
    public abstract double calcSalBruto();
    
    public double calcDesconto(){
        return 0.10 * calcSalBruto();
    }
    
    public double calcSalLiquido(){
        return calcSalBruto() - calcDesconto();
    }

    // Inserir via setCargo, evitando a refatoração que seria incluindo no construtor.
    public void setCargo(String c) {
        cargo = c;
    }
       
    public String getCargo() {
        return cargo;
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
}
