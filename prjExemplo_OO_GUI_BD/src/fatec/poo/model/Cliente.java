package fatec.poo.model;

/**
 * @author Cainna Carolina
 */
public class Cliente {
    private String cpf, nome;
    private double limCred, limCredDisp;
    
    public Cliente(String cpf, String nome, double limCred) {
        this.cpf = cpf;
        this.nome = nome;
        this.limCred = limCred;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public double getLimCred() {
        return limCred;
    }

    public double getLimCredDisp() {
        return limCredDisp;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLimCred(double limCred) {
        this.limCred = limCred;
    }

    public void setLimCredDisp(double limCredDisp) {
        this.limCredDisp = limCredDisp;
    }
}
