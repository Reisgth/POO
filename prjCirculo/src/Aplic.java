/**
 *
 * @author GustavoReis
 */
public class Aplic {
    public static void main(String[] args) {
        Circulo objCirc = new Circulo();
        
        objCirc.setRaio(1);
        
        System.out.println("Raio: " + objCirc.getRaio());
        System.out.println("Diametro " + objCirc.diametro());
        System.out.println("Perimetro " + objCirc.perimetro());
        System.out.println("Area " + objCirc.area());
    }
    
}
