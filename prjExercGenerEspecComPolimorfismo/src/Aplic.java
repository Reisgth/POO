
import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;

/**
 * @author 0030481821041
 */
public class Aplic {
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("#,##0.00");
        PessoaFisica pf1 = new PessoaFisica("123.456.789-00", "José Ruela", 2018);
        PessoaJuridica pj1 = new PessoaJuridica("12.345.679/0001-01", "Sebas Tião", 2022);
        
        
        pf1.setBase(100);
        pf1.addCompra(5000);
        pf1.addCompra(3000);
        pf1.addCompra(2000);
        pf1.addCompra(3000);
        System.out.println("PESSOA FISICA");
        System.out.println("Nome             : " + pf1.getNome());
        System.out.println("CPF              : " + pf1.getCpf());
        System.out.println("Ano de inscricao : " + pf1.getAnoInscricao());
        System.out.println("Base             : " + df.format(pf1.getBase()));
        System.out.println("Total de compras : " + df.format(pf1.getTotalCompras()));
        System.out.println("Bonus            : " + df.format(pf1.calcBonus(2024)));
        
        pj1.setTaxaIncentivo(20);
        pj1.addCompra(5000);
        pj1.addCompra(3000);
        pj1.addCompra(2000);
        System.out.println("PESSOA JURIDICA");
        System.out.println("Nome              : " + pj1.getNome());
        System.out.println("CGC               : " + pj1.getCgc());
        System.out.println("Ano de inscricao  : " + pj1.getAnoInscricao());
        System.out.println("Taxa de Incentivo : " + pj1.getTaxaIncentivo() + "%");
        System.out.println("Total de compras  : " + df.format(pj1.getTotalCompras()));
        System.out.println("Bonus             : " + df.format(pj1.calcBonus(2024)));
    }
}
