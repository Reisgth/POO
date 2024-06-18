package fatec.poo.control;

import fatec.poo.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Gustavo Reis
 */

public class DaoCliente {
   
    private Connection conn;
    
    public DaoCliente(Connection conn) {
         this.conn = conn;
    }    
    
    public Cliente consultar (String cpf) throws SQLException {
        Cliente cliente = null;     
        PreparedStatement ps;
                
        try {
            ps = conn.prepareStatement("SELECT * from tb_cliente where cpf = ?");
            ps.setString(1, cpf);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next() == true) {
                cliente = new Cliente(  rs.getString("cpf"),
                                        rs.getString("nome"), 
                                        rs.getDouble("limiteCredito"));
                
                                        cliente.setEndereco(rs.getString("endereco"));
                                        cliente.setCidade(rs.getString("cidade"));
                                        cliente.setCep(rs.getString("cep"));
                                        cliente.setDdd(rs.getString("ddd"));
                                        cliente.setTelefone(rs.getString("telefone"));
                                        cliente.setLimiteDisponivel(rs.getDouble("limiteDisponivel"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        
        return(cliente);
    }    
     
    public void inserir(Cliente cliente) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("INSERT INTO TB_CLIENTE VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?");
            
            ps.setString(1, cliente.getCpf());
            ps.setString(2, cliente.getNome());
            ps.setString(3, cliente.getEndereco());
            ps.setString(4, cliente.getCidade());
            ps.setString(5, cliente.getUf());
            ps.setString(6, cliente.getCep());
            ps.setString(7, cliente.getDdd());
            ps.setString(8, cliente.getTelefone());
            ps.setDouble(9, cliente.getLimiteCredito());
            ps.setDouble(10, cliente.getLimiteDisponivel());
                      
            ps.execute();
            
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }  
    
    public void alterar(Cliente cliente) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("UPDATE TB_CLIENTE set nome = ?, " +
                                       "endereco = ?, " +
                                       "cidade = ?, " +
                                       "uf = ?, " +
                                       "cep = ?, " +
                                       "ddd = ?, " +
                                       "telefone = ?, " +
                                       "limiteCredito = ?, " +
                                       "limiteDisponivel = ? ");
            
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getEndereco());
            ps.setString(3, cliente.getCidade());
            ps.setString(4, cliente.getUf());
            ps.setString(5, cliente.getCep());
            ps.setString(6, cliente.getDdd());
            ps.setString(7, cliente.getTelefone());
            ps.setDouble(8, cliente.getLimiteCredito());
            ps.setDouble(9, cliente.getLimiteDisponivel());
           
            ps.execute();
            
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void excluir(Cliente cliente) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("DELETE FROM tb_cliente where cpf = ?");
           
            ps.setString(1, cliente.getCpf());
                      
            ps.execute(); //Envia a instrução SQL para o SGBD
            
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
