package fatec.poo.model;

/**
 * @author GustavoReis
 */

public class Pessoa {
    private String nome, dtNascimento, endereco;
    
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getNome () {
        return nome;
    }
    
    public String getDtNascimento () {
        return dtNascimento;
    }
    
    public String getEndereco () {
        return endereco;
    }
}
