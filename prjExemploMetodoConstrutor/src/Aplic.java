
import java.util.Scanner;

/*
 * @author GustavoReis
 */
public class Aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double medAlt, medBase;
        String uniMed;
        
        System.out.print("Informe a unidade de medida: ");
        uniMed = entrada.next();
        
        Retangulo objRet = new Retangulo(uniMed);

        System.out.print("Digite a medida da base: ");
        medBase = entrada.nextDouble();

        System.out.print("Digite a medida da altura: ");
        medAlt = entrada.nextDouble();

        objRet.setAltura(medAlt);
        objRet.setBase(medBase);

        System.out.println("\nValor da Altura: " + objRet.getAltura() + " " + objRet.getUnidadeMedida());
        System.out.println("Valor do Base: " + objRet.getBase() + " " + objRet.getUnidadeMedida());
        
        System.out.println("Valor da area: " + objRet.calcArea() + " " + objRet.getUnidadeMedida() +  "²");
        System.out.println("Valor do Perimetro: " + objRet.calcPerimetro() + " " + objRet.getUnidadeMedida());
        System.out.println("Valor da Diagonal: " + objRet.calcDiagonal() + " " + objRet.getUnidadeMedida());
    }
}
