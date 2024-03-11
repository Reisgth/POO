/**
 *
 * @author GustavoReis
 */
public class Aplic {
    public static void main(String[] args) {
        Retangulo objRet1; //definição do ponteiro
        Retangulo objRet2;
        
        objRet1 = new Retangulo();//Instanciação do objeto
                                  //da classe Retangulo
             
        objRet2 = new Retangulo();
        
        objRet1.setAltura(5.0);
        objRet1.setBase(8.0);        
        
        System.out.println("Objeto Ret1\n");
        System.out.println("Medida da altura: " + objRet1.getAltura());
        System.out.println("Medida da base: " + objRet1.getBase());
        System.out.println("Valor da Área: " + objRet1.calcArea());
        System.out.println("Valor do Perímetro: " + objRet1.calcPerimetro());
        System.out.println("Valor da Diagonal: " + objRet1.calcDiagonal());
    
    
        objRet2.setAltura(3.0);
        objRet2.setBase(4.0);
        
        System.out.println("\n\nObjeto Ret2\n");
        System.out.println("Medida da altura: " + objRet2.getAltura());
        System.out.println("Medida da base: " + objRet2.getBase());
        System.out.println("Valor da Área: " + objRet2.calcArea());
        System.out.println("Valor do Perímetro: " + objRet2.calcPerimetro());
        System.out.println("Valor da Diagonal: " + objRet2.calcDiagonal());
    }
}
