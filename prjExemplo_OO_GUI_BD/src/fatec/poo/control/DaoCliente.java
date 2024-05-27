package fatec.poo.control;

import fatec.poo.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Cainna Carolina
 */
public class DaoCliente {
   
    private Connection conn;
    
    public DaoCliente(Connection conn) {
         this.conn = conn;
    }    
    
    public Cliente consultar (int ra) {
        Cliente objCli = null;         
       
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("SELECT * from tblCliente where cpf = ?");
            
            ps.setInt(1, ra);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                objCli = new Cliente(rs.getString("cpf"),rs.getString("Nome"), rs.getDouble("limCred"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return(objCli);
    }    
     
    public void inserir(Cliente objCli) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("INSERT INTO tblCliente(cpf_cli, nome_cli, limCred_cli, limCredDisp_CLIE)" + 
                                        "VALUES(?,?,?,?)");
            ps.setString(1, objCli.getCpf());
            ps.setString(2, objCli.getNome());
            ps.setDouble(3, objCli.getLimCred());
            ps.setDouble(4, objCli.getLimCredDisp());
                      
            ps.execute(); //envia a instrução SQL para o SGBD
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }  
    
    public void alterar(Cliente cliente) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("UPDATE tblCliente set Nome_Cli = ?, " +
                                       "limCred = ?, " +
                                       "limCredDisp = ? ");          
            ps.setString(1, cliente.getNome());
            ps.setDouble(2, cliente.getLimCred());
            ps.setDouble(3, cliente.getLimCredDisp());
           
            ps.execute(); //Envia a instrução SQL para o SGBD
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void excluir(Cliente cliente) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("DELETE FROM tblCliente where cpf_cli = ?");
            
            ps.setString(1, cliente.getCpf());
                      
            ps.execute(); //Envia a instrução SQL para o SGBD
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
