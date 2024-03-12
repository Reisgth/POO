
import java.util.Scanner;

/**
 * @author GustavoReis
 */
public class Aplic {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String uniMed;
        
        System.out.print("Informe a unidade de medida: ");
        uniMed = entrada.next();
        
        Circulo objCirc = new Circulo(uniMed);
        
        System.out.print("Digite o Raio do circulo: ");
        objCirc.setRaio(entrada.nextDouble());
        
        System.out.println("Unidade de Medida: " + objCirc.getUnidadeMedida());
        System.out.println("Raio: " + objCirc.getRaio()+ " " + objCirc.getUnidadeMedida());
        System.out.println("Diametro " + objCirc.diametro()+ " " + objCirc.getUnidadeMedida());
        System.out.println("Perimetro " + objCirc.perimetro()+ " " + objCirc.getUnidadeMedida());
        System.out.println("Area " + objCirc.area()+ " " + objCirc.getUnidadeMedida() + "²");
    }
    
}