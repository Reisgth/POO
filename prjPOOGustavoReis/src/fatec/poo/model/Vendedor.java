package fatec.poo.model;

import java.util.ArrayList;

/**
 * @author Gustavo Reis
 */

public class Vendedor extends Pessoa {
    private double salarioBase, taxaComissao;
    
    //Multiplicidade 0..* - Um vendedor por ter nenhum ou varios pedidos
    private ArrayList<Pedido> pedidos;
        
    public Vendedor(String nome, String cpf, double salarioBase){
        super(nome, cpf);
        this.salarioBase = salarioBase;
        
        pedidos = new ArrayList<Pedido>();
    }
    
    public void addPedido(Pedido p) {
        pedidos.add(p);
        p.setVendedor(this);
    }
    
    public void removePedido(Pedido p) {
        pedidos.remove(p);
        p.setVendedor(null);
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }
}
