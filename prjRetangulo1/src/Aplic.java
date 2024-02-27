/**
 *
 * @author GustavoReis
 */
public class Aplic {

    public static void main(String[] args) {
        Retangulo objRet1;
        
        objRet1 = new Retangulo();
        
        objRet1.setAltura(5.0);
        objRet1.setBase(8.0);
            
        System.out.println("Valor da Area: " + objRet1.calcArea());
        System.out.println("Valor do Perimetro: " + objRet1.calcPerimetro());
    }
    
}
