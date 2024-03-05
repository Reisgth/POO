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
            
        System.out.println("Valor da Altura: " + objRet1.getAltura());
        System.out.println("Valor do Base: " + objRet1.getBase());
        System.out.println("Valor da area: " + objRet1.calcArea());
        System.out.println("Valor do Perimetro: " + objRet1.calcPerimetro());
        System.out.println("Valor da Diagonal: " + objRet1.calcDiagonal());
    }
    
}
