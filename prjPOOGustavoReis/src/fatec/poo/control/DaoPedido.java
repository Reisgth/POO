package fatec.poo.control;

import fatec.poo.model.Cliente;
import fatec.poo.model.Pedido;
import fatec.poo.model.Vendedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Gustavo Reis
 */

public class DaoPedido {
   
    private Connection conn;
    
    public DaoPedido(Connection conn) {
         this.conn = conn;
    }    
    
    public Pedido consultar (String numero) {
        Pedido pedido = null;     
        PreparedStatement ps;
                
        System.out.println("{" + numero + "}");
        try {
            ps = conn.prepareStatement("SELECT * from tb_pedido where numero = ?");
            ps.setString(1, numero);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next() == true) {
                pedido = new Pedido(rs.getString("numero"));
                
                pedido.setDataEmissao(rs.getString("dataEmissao"));
                pedido.setValor(rs.getDouble("valor"));
                
                pedido.setCliente(new Cliente(rs.getString("cliente"), "", 0));
                pedido.setVendedor(new Vendedor (rs.getString("vendedor"), "", 0));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        
        return(pedido);
    }    
     
    public void inserir(Pedido pedido) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("INSERT INTO tb_pedido VALUES(?, ?, ?, ?, ?)");
            
            ps.setString(1, pedido.getNumero());
            ps.setString(2, pedido.getDataEmissao());
            ps.setDouble(3, pedido.getValor());
            ps.setString(4, pedido.getCliente().getCpf());
            ps.setString(5, pedido.getVendedor().getCpf());
            
            ps.execute();
            
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }  
    
    public void alterar(Pedido pedido) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement( "UPDATE tb_pedido set " +
                                        "dataEmissao = ?," +
                                        "valor = ?," +
                                        "cliente = ?," +
                                        "vendedor = ? " +
                                        "WHERE numero = ?");
            
            ps.setString(1, pedido.getDataEmissao());
            ps.setDouble(2, pedido.getValor());
            ps.setString(3, pedido.getCliente().getCpf());
            ps.setString(4, pedido.getVendedor().getCpf());
            ps.setString(5, pedido.getNumero());
                      
            ps.execute();
            
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void excluir(Pedido pedido) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("DELETE FROM tb_pedido where numero = ?");
           
            ps.setString(1, pedido.getNumero());
                      
            ps.execute(); //Envia a instrução SQL para o SGBD
            
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
