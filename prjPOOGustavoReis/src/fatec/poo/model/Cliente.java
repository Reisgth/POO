package fatec.poo.model;

import java.util.ArrayList;

/**
 * @author Gustavo Reis
 */
public class Cliente extends Pessoa {
    private double limiteCredito, limiteDisponivel;
    
    //multiplicidade 1..* - um cliente pode ter varios pedidos
    private ArrayList<Pedido> pedidos;
    
    public Cliente(String cpf, String nome, double limiteCredito) {
        super(cpf, nome);
        this.limiteCredito = limiteCredito;
        
        limiteDisponivel = limiteCredito;
        pedidos = new ArrayList<Pedido>();
    }
    
    public void addPedido(Pedido p) {
        pedidos.add(p);
        p.setCliente(this);
        
        this.limiteDisponivel -= p.getValor();
    }
    
    public void removePedido(Pedido p) {
        this.limiteDisponivel += p.getValor();
        
        pedidos.remove(p);
        p.setCliente(null);
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public void setLimiteDisponivel(double limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }
}
