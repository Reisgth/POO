
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;

/**
 * @author GustavoReis
 */
public class Aplic {
    public static void main(String[] args) {
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1978",15.80);
        funcHor.setCargo("Programador");
        
        FuncionarioMensalista funcMen = new FuncionarioMensalista(2020, "Jose da Silva", "21/10/1986", 1412.06);
        funcMen.setCargo("Torneiro");
        
        FuncionarioComissionado funcCom = new FuncionarioComissionado(3030, "Chico Xavier", "02/07/99", 10);
        funcCom.setCargo("Vendedor");
        
        
        funcHor.setQtdHorTrab(90);
        System.out.println("Registro           => " + funcHor.getRegistro());
        System.out.println("Funcionario        => " + funcHor.getNome());
        System.out.println("Data de admissao   => " + funcHor.getDtAdmissao());
        System.out.println("Cargo              => " + funcHor.getCargo());
        System.out.println("Sálario Bruto      => " + funcHor.calcSalBruto());
        System.out.println("Desconto           => " + funcHor.calcDesconto());
        System.out.println("Gratificacao       => " + funcHor.calcGratificacao());
        System.out.println("Sálario Liquido    => " + funcHor.calcSalLiquido());
        
        funcMen.setNumSalMin(4);
        System.out.println("\n\nRegistro               => " + funcMen.getRegistro());
        System.out.println("Funcionario            => " + funcMen.getNome());
        System.out.println("Data de admissao       => " + funcMen.getDtAdmissao());
        System.out.println("Cargo                  => " + funcMen.getCargo());
        System.out.println("Sálario Bruto          => " + funcMen.calcSalBruto());
        System.out.println("Desconto               => " + funcMen.calcDesconto());
        System.out.println("Sálario Liquido        => " + funcMen.calcSalLiquido());
        
        funcCom.setSalBase(900.00);
        funcCom.addVendas(1000);
        funcCom.addVendas(3000);
        funcCom.addVendas(4000);
        System.out.println("\n\nRegistro               => " + funcCom.getRegistro());
        System.out.println("Funcionario            => " + funcCom.getNome());
        System.out.println("Data de admissao       => " + funcCom.getDtAdmissao());
        System.out.println("Cargo                  => " + funcCom.getCargo());
        System.out.println("Salario Base           => " + funcCom.getSalBase());
        System.out.println("Total de vendas        => " + funcCom.getTotalVendas());
        System.out.println("Taxa de comissao       => " + funcCom.getTaxaComissao());
        System.out.println("Sálario Bruto          => " + funcCom.calcSalBruto());
        System.out.println("Desconto               => " + funcCom.calcDesconto());
        System.out.println("Gratificacao           => " + funcCom.calcGratificacao());
        System.out.println("Sálario Liquido        => " + funcCom.calcSalLiquido());
    }
}
