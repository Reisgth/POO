package fatec.poo.model;

/**
 * @author GustavoReis
 */
public class PedidoCompra {
    private int numero;
    private String dataPedido;
    private double valor;
    
    private Pessoa pessoa;
    
    public PedidoCompra(int numero) {
        this.numero = numero;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String getDataPedido() {
        return dataPedido;
    }

    public double getValor() {
        return valor;
    } 
    
    // Mostrando a pessoa associada a este pedido
    public Pessoa getPessoa() {
        return pessoa;
    }
    
    // Definindo a uma pessoa a este pedido de compra
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
}
