package fatec.poo.control;

import fatec.poo.model.Departamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Dimas
 */
public class DaoDepartamento {
    private Connection conn;
    
    public DaoDepartamento(Connection conn) {
         this.conn = conn;
    }    
    
    public Departamento consultar (String sigla) {
        Departamento objDept = null;         
       
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("SELECT * from tblDepartamento where Sigla_Dep = ?");
            
            ps.setString(1, sigla);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                objDept = new Departamento(rs.getString("Sigla_Dep"),rs.getString("Nome_Dep"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return(objDept);
    }    
     
    public void inserir(Departamento objDept) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("INSERT INTO tblDepartamento(Sigla_Dep, Nome_Dep) VALUES(?,?)");
            ps.setString(1, objDept.getSigla());
            ps.setString(2, objDept.getNome());
                      
            ps.execute(); //envia a instrução SQL para o SGBD
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }  
    
    public void alterar(Departamento objDept) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("UPDATE tblDepartamento set Nome_Dep = ?");
            
            ps.setString(1, objDept.getNome());
           
            ps.execute(); //Envia a instrução SQL para o SGBD
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void excluir(Departamento objDept) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("DELETE FROM tblAluno where Sigla_Dep = ?");
            
            ps.setString(1, objDept.getSigla());
                      
            ps.execute(); //Envia a instrução SQL para o SGBD
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
