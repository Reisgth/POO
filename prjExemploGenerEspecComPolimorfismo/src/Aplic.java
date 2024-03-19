
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;

/**
 * @author GustavoReis
 */
public class Aplic {
    public static void main(String[] args) {
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1978", "Torneiro",15.80);
        
        FuncionarioMensalista funcMen = new FuncionarioMensalista(2020, "Jose da Silva", "21/10/1986", "Ferramenteiro", 1412.06);
        
        funcHor.setQtdHorTrab(90);
        System.out.println("Numero do Registro => " + funcHor.getRegistro());
        System.out.println("Funcionario => " + funcHor.getNome());
        System.out.println("Data de admissao => " + funcHor.getDtAdmissao());
        System.out.println("Data de admissao => " + funcHor.getCargo());
        System.out.println("Sálario Bruto => " + funcHor.calcSalBruto());
        System.out.println("Desconto => " + funcHor.calcDesconto());
        System.out.println("Sálario Liquido => " + funcHor.calcSalLiquido());
        
        funcMen.setNumSalMin(4);
        System.out.println("\n\nNumero do Registro => " + funcMen.getRegistro());
        System.out.println("Funcionario => " + funcMen.getNome());
        System.out.println("Data de admissao => " + funcMen.getDtAdmissao());
        System.out.println("Data de admissao => " + funcMen.getCargo());
        System.out.println("Sálario Bruto => " + funcMen.calcSalBruto());
        System.out.println("Desconto => " + funcMen.calcDesconto());
        System.out.println("Sálario Liquido => " + funcMen.calcSalLiquido());
    }
}
