
import java.util.Scanner;

/**
 *
 * @author GustavoReis
 */

public class Aplic {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Scanner entrada = new Scanner(System.in);
        
        int RA, opcao;
        double NtPrv1, NtPrv2, NtTrab1, NtTrab2;
        
        System.out.print("Digite seu RA: ");
        RA = entrada.nextInt();
        
        System.out.print("Digite a nota da primeira prova: ");
        NtPrv1 = entrada.nextDouble();
        System.out.print("Digite a nota da segunda prova: ");
        NtPrv2 = entrada.nextDouble();
        System.out.print("Digite a nota do primeiro trabalho: ");
        NtTrab1 = entrada.nextDouble();
        System.out.print("Digite a nota da segundo trabalho: ");
        NtTrab2 = entrada.nextDouble();
        
        aluno1.setRA(RA);
        aluno1.setNtPrv1(NtPrv1);
        aluno1.setNtPrv2(NtPrv2);
        aluno1.setNtTrab1(NtTrab1);
        aluno1.setNtTrab2(NtTrab2);
        
        do{
            System.out.println("\nDigite a opcao");
            System.out.println("1 - Exibir nota das provas e trabalhos");
            System.out.println("2 - Exibir media das provas e trabalhos");
            System.out.println("3 - Exibir media final");
            System.out.println("4 - Sair\n");
            opcao = entrada.nextInt();
            
            switch(opcao) {
                case 1: 
                    System.out.println("\nRA: " + aluno1.getRA());
                    System.out.println("Nota da primeira prova: " + aluno1.getNtPrv1());
                    System.out.println("Nota da segunda prova: " + aluno1.getNtPrv2());
                    System.out.println("Nota do primeiro trabalho: " + aluno1.getNtTrab1());
                    System.out.println("Nota da segunda prova: " + aluno1.getNtTrab2());
                    break;
                case 2:
                    System.out.println("\nRA: " + aluno1.getRA());
                    System.out.println("Media final das provas: " + aluno1.calcMediaProva());
                    System.out.println("Media final dos trabalho: " + aluno1.calcMediaTrab());
                    break;
                case 3:
                    System.out.println("\nRA: " + aluno1.getRA());
                    System.out.println("Media final: " + aluno1.calcMediaFinal());
                    break;
                case 4:
                    break;
                default:
                    System.out.println("\nOpcao Invalida");
            }
        }while(opcao != 4);
    }
}
 