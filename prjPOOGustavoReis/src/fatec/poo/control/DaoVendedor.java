package fatec.poo.control;

import fatec.poo.model.Vendedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Gustavo Reis
 */

public class DaoVendedor {
   
    private Connection conn;
    
    public DaoVendedor(Connection conn) {
         this.conn = conn;
    }    
    
    public Vendedor consultar (String cpf) {
        Vendedor vendedor = null;     
        PreparedStatement ps;
                
        System.out.println("{" + cpf + "}");
        try {
            ps = conn.prepareStatement("SELECT * from tb_vendedor where cpf = ?");
            ps.setString(1, cpf);
            
            ResultSet rs = ps.executeQuery();
            
           
            if (rs.next() == true) {
                vendedor = new Vendedor(   rs.getString("cpf"),
                                           rs.getString("nome"), 
                                           rs.getDouble("salarioBase"));
                
                vendedor.setEndereco(rs.getString("endereco"));
                vendedor.setCidade(rs.getString("cidade"));
                vendedor.setUf(rs.getString("uf"));
                vendedor.setCep(rs.getString("cep"));
                vendedor.setDdd(rs.getString("ddd"));
                vendedor.setTelefone(rs.getString("telefone"));
                vendedor.setTaxaComissao(rs.getDouble("taxaComissao"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        
        return(vendedor);
    }    
     
    public void inserir(Vendedor vendedor) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("INSERT INTO tb_vendedor VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            
            ps.setString(1, vendedor.getCpf());
            ps.setString(2, vendedor.getNome());
            ps.setString(3, vendedor.getEndereco());
            ps.setString(4, vendedor.getCidade());
            ps.setString(5, vendedor.getUf());
            ps.setString(6, vendedor.getCep());
            ps.setString(7, vendedor.getDdd());
            ps.setString(8, vendedor.getTelefone());
            ps.setDouble(9, vendedor.getSalarioBase());
            ps.setDouble(10, vendedor.getTaxaComissao());
                      
            ps.execute();
            
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }  
    
    public void alterar(Vendedor vendedor) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("UPDATE tb_vendedor set nome = ?, " +
                                       "endereco = ?, " +
                                       "cidade = ?, " +
                                       "uf = ?, " +
                                       "cep = ?, " +
                                       "ddd = ?, " +
                                       "telefone = ?, " +
                                       "salarioBase = ?, " +
                                       "taxaComissao = ? " +
                                       "WHERE cpf = ?");
            
            ps.setString(1, vendedor.getNome());
            ps.setString(2, vendedor.getEndereco());
            ps.setString(3, vendedor.getCidade());
            ps.setString(4, vendedor.getUf());
            ps.setString(5, vendedor.getCep());
            ps.setString(6, vendedor.getDdd());
            ps.setString(7, vendedor.getTelefone());
            ps.setDouble(8, vendedor.getSalarioBase());
            ps.setDouble(9, vendedor.getTaxaComissao());
            ps.setString(10, vendedor.getCpf());
           
            ps.execute();
            
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void excluir(Vendedor vendedor) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("DELETE FROM tb_vendedor where cpf = ?");
           
            ps.setString(1, vendedor.getCpf());
                      
            ps.execute(); //Envia a instrução SQL para o SGBD
            
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
