package fatec.poo.model;

import java.util.ArrayList;

/**
 * @author Gustavo Reis
 */
public abstract class Pessoa {
    private String nome;
    private int anoInscricao;
    private double totalCompras;
    
    private ArrayList<PedidoCompra> pedidos; //Multiplicidade 1..*
    private int numPed;

    public Pessoa(String nome, int anoInscricao) {
        this.nome = nome;
        this.anoInscricao = anoInscricao;
        this.totalCompras = 0;
        
        pedidos = new ArrayList<PedidoCompra>();
        numPed = 0;
    }
    
    public abstract double calcBonus(int anoAtual);
    
    public void addPedidoCompra(PedidoCompra pc){
        pedidos.add(pc);
        totalCompras += pc.getValor();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoInscricao(int anoInscricao) {
        this.anoInscricao = anoInscricao;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoInscricao() {
        return anoInscricao;
    }

    public double getTotalCompras() {
        return totalCompras;
    }
    
    
}
