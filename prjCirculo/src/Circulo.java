/**
 * @author GustavoReis
 */
public class Circulo {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double r) {
        raio = r;
    }
    
    public double area() {
        return raio * Math.pow(3.1415,2);
    }
    
    public double diametro() {
        return raio*2;
    }
    
    public double perimetro() {
        return 2 * 3.1415 * raio;
    }
}
