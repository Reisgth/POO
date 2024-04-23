
import fatec.poo.model.PedidoCompra;
import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 0030481821041
 */
public class Aplic {
    public static void main(String[] args) {
         
        //Variaveis para receber os dados do scanner e instanciar o metodo construtor
        int anoInscricao, numeroPedido;
        String doc, nome;
        
        //Definição do Scanner e DF
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        // Matriz com possibilidade de armazenar 10 pedidos
        ArrayList<PedidoCompra> cadPedido = new ArrayList<PedidoCompra>();
        
        // Entrada de dados das pessoas cadastrados
        System.out.print("Entre com o cpf: ");
        doc = entrada.next();
        System.out.print("Entre com o nome: ");
        nome = entrada.next();
        System.out.print("Entre com o ano de inscricao: ");
        anoInscricao = entrada.nextInt();
        
        //Instanciação de uma pessoa fisica com os dados passados acima
        PessoaFisica pf1 = new PessoaFisica(doc, nome, anoInscricao);
       
        //Utilizando o metodo setBase da pessoa fisica instanciada
        System.out.print("Entre com o salario base: ");
        pf1.setBase(entrada.nextInt());
        
        //Entrando com os dados de uma pessoa juridica
        System.out.print("Entre com o cgc: ");
        doc = entrada.next();
        System.out.print("Entre com o nome: ");
        nome = entrada.next();
        System.out.print("Entre com o ano de inscricao: ");
        anoInscricao = entrada.nextInt();
        
        // Instanciando uma pessoa juridica com os dados passados acima
        PessoaJuridica pj1 = new PessoaJuridica(doc, nome, anoInscricao);
        
        //Utilizando o metodo setTaxaIncentivo da pessoa juridica instanciada
        System.out.print("Entre com a taxa de incentivo: ");
        pj1.setTaxaIncentivo(entrada.nextDouble());
        
        // Instanciando 10 objetos da classe pedidoCompra
        for(int i=0; i<cadPedido.size(); i++){
            System.out.println("Digite o numero do pedido: ");
            numeroPedido = entrada.nextInt();
            
            cadPedido.add(new PedidoCompra(numeroPedido));
                        
            System.out.println("Digite a data do pedido (dd/mm/aaaa): ");
            cadPedido.get(i).setDataPedido(entrada.next());
            
            System.out.println("Digite o valor do pedido: ");
            cadPedido.get(i).setValor(entrada.nextDouble());
            
            System.out.println("1-Pessoa Física  2-Pessoa Juridica: ");
            int opcao = entrada.nextInt();
            if (opcao == 1){
                //Efetivando a associação binária bidirecional
                //entre objeto PessoaFisica e o objeto PedidoCompra
                pf1.addPedidoCompra(cadPedido.get(i)); //multiplicidade 1..*
                cadPedido.get(i).setPessoa(pf1);            
            }else{
                //Efetivando a associação binária bidirecional
                //entre objeto PessoaJuridica e o objeto PedidoCompra
                pj1.addPedidoCompra(cadPedido.get(i)); 
                cadPedido.get(i).setPessoa(pj1);   
            }
        }
        
        // Mostrando os dados da pessoa fisica instanciada
        System.out.println("PESSOA FISICA");
        System.out.println("Nome             : " + pf1.getNome());
        System.out.println("CPF              : " + pf1.getCpf());
        System.out.println("Ano de inscricao : " + pf1.getAnoInscricao());
        System.out.println("Base             : " + df.format(pf1.getBase()));
        System.out.println("Total de compras : " + df.format(pf1.getTotalCompras()));
        System.out.println("Bonus            : " + df.format(pf1.calcBonus(2024)) + "\n");
        
        // Mostrando os dados da pessoa juridica instanciada
        System.out.println("PESSOA JURIDICA");
        System.out.println("Nome              : " + pj1.getNome());
        System.out.println("CGC               : " + pj1.getCgc());
        System.out.println("Ano de inscricao  : " + pj1.getAnoInscricao());
        System.out.println("Taxa de Incentivo : " + pj1.getTaxaIncentivo() + "%");
        System.out.println("Total de compras  : " + df.format(pj1.getTotalCompras()));
        System.out.println("Bonus             : " + df.format(pj1.calcBonus(2024)));
    }
}
