import java.util.Scanner;

/**
 * @author GustavoReis
 */

public class Aplic {
    public static void main(String[] args) {
        
        int numConta, opcao;
        double saldo, valor;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Numero da conta: ");
        numConta = entrada.nextInt();
        System.out.print("Digite o valor inicial da conta: ");
        saldo = entrada.nextDouble();
        
        ContaCorrente conta1 = new ContaCorrente(numConta, saldo);
              
        do{
            System.out.println("\nDigite a opcao");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Saldo");
            System.out.println("4 - Sair\n");
            opcao = entrada.nextInt();
            
            switch(opcao) {
                case 1: 
                    System.out.println("\nDigite o valor que deseja sacar: ");
                    valor = entrada.nextDouble();
                    if(valor < conta1.getSaldo())
                        conta1.sacar(valor);
                    else
                        System.out.println("\nSaldo inferior ao saque desejado!");

                    System.out.println("\nSaldo atual da conta: " + conta1.getSaldo());                    
                    break;
                case 2:
                    System.out.println("\nDigite o valor que deseja depositar: ");
                    valor = entrada.nextDouble();
                    conta1.depositar(valor);

                    System.out.println("\nSaldo atual da conta: " + conta1.getSaldo());                    
                    break;
                case 3:
                    System.out.println("\nSaldo atual da conta: " + conta1.getSaldo());                    
                    break;
                case 4:
                    break;
                default:
                    System.out.println("\nOpcao Invalida");
            }
        }while(opcao != 4);
    }
}
 