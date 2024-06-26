package fatec.poo.model;

/**
 * @author Gustavo Reis
 */
public abstract class Pessoa {
    private String nome;
    private int anoInscricao;
    private double totalCompras;
    
    private PedidoCompra[] pedidos; //Multiplicidade 1..*
    private int numPed;

    public Pessoa(String nome, int anoInscricao) {
        this.nome = nome;
        this.anoInscricao = anoInscricao;
        this.totalCompras = 0;
        
        pedidos = new PedidoCompra[10];
        numPed = 0;
    }
    
    public abstract double calcBonus(int anoAtual);
    
    public void addPedidoCompra(PedidoCompra pc){
        pedidos[numPed] = pc;
        totalCompras += pc.getValor();
        numPed++;
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
