package fatec.poo.model;

/**
 * @author Gustavo Reis
 */
public class Professor extends Pessoa {

    private int registroFuncional;
    private double salario;

    public Professor(int rf, String n, String dn) {
        super(n, dn);
        registroFuncional = rf;
    }

    public int getRegistroFuncional() {
        return registroFuncional;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double sal) {
        salario = sal;
    }
}
