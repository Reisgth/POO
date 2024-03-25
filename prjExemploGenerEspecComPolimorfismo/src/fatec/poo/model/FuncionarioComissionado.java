package fatec.poo.model;

/**
 * @author GustavoReis
 */
public class FuncionarioComissionado extends Funcionario {

    double salBase, taxaComissao, totalVendas;

    public FuncionarioComissionado(int r, String n, String dtAdm, double tc) {
        super(r, n, dtAdm);
        taxaComissao = tc;
    }

    public void setSalBase(double sb) {
        salBase = sb;
    }

    public double getSalBase() {
        return salBase;
    }

    public double getTotalVendas() {
        return totalVendas;
    }
    
    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void addVendas(double valVenda) {
        totalVendas += valVenda;
    }

    @Override
    public double calcSalBruto() {
        return salBase + (taxaComissao * totalVendas);
    }
    
    public double calcGratificacao() {
        if (totalVendas < 5000) {
            return 0;
        } else if (totalVendas < 10000) {
            return (calcSalBruto() * 0.03);
        } else {
            return (calcSalBruto() * 0.05);
        }
    }
    
    @Override
    // substituindo o calcSalLiquido de funcionario
    public double calcSalLiquido(){
        return super.calcSalLiquido() + calcGratificacao();
    }
}