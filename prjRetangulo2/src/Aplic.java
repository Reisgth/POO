import java.util.Scanner;

/**
 *
 * @author GustavoReis
 */
public class Aplic {
    public static void main(String[] args) {
        Retangulo objRet = new Retangulo();
        Scanner entrada = new Scanner(System.in);
        
        double medAlt, medBase;
        
        System.out.print("Digite a medida da base: ");
        medBase = entrada.nextDouble();
        
        System.out.print("Digite a medida da altura: ");
        medAlt = entrada.nextDouble();
        
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        System.out.println("Valor da Altura: " + objRet.getAltura());
        System.out.println("Valor do Base: " + objRet.getBase());
        System.out.println("Valor da area: " + objRet.calcArea());
        System.out.println("Valor do Perimetro: " + objRet.calcPerimetro());
        System.out.println("Valor da Diagonal: " + objRet.calcDiagonal());
    }
    
}
