
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Gustavo Reis
 */
public class Aplic {

    public static void main(String[] args) throws IOException {
        int opcao, dias;
        Scanner entrada = new Scanner(System.in);

        QuartoHotel quarto1 = new QuartoHotel(1, 150.00); // Definindo o objeto

        do {          
            System.out.println("1 - Consultar quarto");
            System.out.println("2 - Reservar quarto");
            System.out.println("3 - Liberar quarto");
            System.out.println("4 - Consultar faturamento do quarto");
            System.out.println("5 - Sair\n");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Quarto 1: ");
                    if (quarto1.getSituacao()) { //verifica se o quarto está ou não reservado
                        System.out.println("Livre\n");
                    } else {
                        System.out.println("Reservado\n");
                    }
                    break;
                case 2:
                    if (quarto1.getSituacao()) { //verifica se o quarto está ou não reservado
                        quarto1.reservar(555);
                        System.out.println("Quarto reservado com sucesso!\n"); // if true = quarto livre pode reservar
                    } else {
                        System.out.println("O quarto ja foi reservado!\n"); //false = quarto ocupado nao reserva
                    }

                    break;
                case 3:
                    if (quarto1.getSituacao()) { //verifica se o quarto está ou não reservado
                        System.out.println("O quarto ja está livre!\n"); //if true = quarto livre não pode ser liberado
                    } else {
                        System.out.print("Quatidade de dias hospedados: "); // if false = quarto ocupado pode ser liberado
                        dias = entrada.nextInt();// Dias de hospedagem a serem pagos
                        System.out.println("Valor a ser pago: " + quarto1.liberar(dias));
                        System.out.println("Quarto liberado com sucesso!\n");
                    }
                    break;
                case 4:
                    System.out.println("Total faturado pelo quarto: " + quarto1.getTotalFaturado() + "\n");
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcao Invalida!\n");
            }
        } while (opcao != 5);
    }
}
