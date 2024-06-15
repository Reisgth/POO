package fatec.poo.model;

/**
 * @author Gustavo Reis
 */
public class Pedido {
    private String numero, dataEmissao;
    private double valor;
    
    //Multiplicidade 1 - um pedido tem um cliente;
    private Cliente cliente;
    
    //Multiplicidade 1 - um peidido tem um vendedor;
    private Vendedor vendedor;

    
    // Atribuindo cliente e vendedor ao pedido
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    // Retornando cliente e vendedor do pedido
    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }
    
    public Pedido(String numero){
        this.numero = numero;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public double getValor() {
        return valor;
    }
    
}

