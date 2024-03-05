/**
 * @author GustavoReis
 */
public class Aluno {
    private int RA;
    private double NtPrv1, NtPrv2, NtTrab1, NtTrab2;

    public void setRA(int ra) {
        RA = ra;
    }

    public void setNtPrv1(double p1) {
        NtPrv1 = p1;
    }

    public void setNtPrv2(double p2) {
        NtPrv2 = p2;
    }

    public void setNtTrab1(double t1) {
        NtTrab1 = t1;
    }

    public void setNtTrab2(double t2) {
        NtTrab2 = t2;
    }

    public int getRA() {
        return RA;
    }

    public double getNtPrv1() {
        return NtPrv1;
    }

    public double getNtPrv2() {
        return NtPrv2;
    }

    public double getNtTrab1() {
        return NtTrab1;
    }

    public double getNtTrab2() {
        return NtTrab2;
    }
    
    public double calcMediaProva() {
        return 0.75 * (NtPrv1 + 2*NtPrv2)/3;
    }
    
    public double calcMediaTrab() {
        return 0.25 * (NtTrab1 + NtTrab2)/2;
    }
    
    public double calcMediaFinal() {
        return calcMediaProva() + calcMediaTrab();
    }
}
