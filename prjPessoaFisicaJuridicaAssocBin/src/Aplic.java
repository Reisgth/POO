
import fatec.poo.model.PedidoCompra;
import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author 0030481821041
 */
public class Aplic {
    public static void main(String[] args) {
         
        //Variaveis para receber os dados do scanner e instanciar o metodo construtor
        int anoInscricao;
        String doc, nome;
        
        //Definição do Scanner e DF
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        // Matriz com possibilidade de armazenar 10 pedidos
        PedidoCompra [] cadPedido = new PedidoCompra[10];
        
        System.out.print("Entre com o cpf: ");
        doc = entrada.next();
        System.out.print("Entre com o nome: ");
        nome = entrada.next();
        System.out.print("Entre com o ano de inscricao: ");
        anoInscricao = entrada.nextInt();
                
        PessoaFisica pf1 = new PessoaFisica(doc, nome, anoInscricao);
        
        System.out.print("Entre com o salario base: ");
        pf1.setBase(entrada.nextInt());
        
        for(int i=0; i<10; i++){
            cadPedido[i] = new PedidoCompra(10 * i);
        }
        
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
        System.out.println("Bonus            : " + df.format(pf1.calcBonus(2024)) + "\n");

        
        System.out.print("Entre com o cgc: ");
        doc = entrada.next();
        System.out.print("Entre com o nome: ");
        nome = entrada.next();
        System.out.print("Entre com o ano de inscricao: ");
        anoInscricao = entrada.nextInt();
        
        PessoaJuridica pj1 = new PessoaJuridica(doc, nome, anoInscricao);
           
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
