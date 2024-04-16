
package fatec.poo.model;

/**
 * @author Gustavo Reis
 */

public class Departamento {
    private String sigla;
    private String nome;
    private Funcionario[] funcionarios; //implementação da multiplicidade 1..*
    private int numFunc; //representa o índice da matriz funcionários

    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[5];
    }  

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    
    //tem como parametro de entrada o endereço de um obj da classe funcionario 
    //horista, mensalista ou comissionado
    public void addFuncionario(Funcionario f){
        funcionarios[numFunc] = f;
        numFunc++;
    }
    
    public void listarFuncionarios () {
        System.out.println("\nSigla:      " + sigla);
        System.out.println("Nome:       " + nome);
        System.out.println("Qntd func:  " + numFunc);
        
        System.out.println("\nRegistro\tNome\t\tCargo");
        for(int i=0; i<numFunc; i++){
            System.out.println(funcionarios[i].getRegistro() + "\t\t" + 
                               funcionarios[i].getNome() + "\t" + 
                               funcionarios[i].getCargo());
        }
    }
}