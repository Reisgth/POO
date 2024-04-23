
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Dimas
 */
public class Departamento {
    private String sigla;
    private String nome;
    private ArrayList<Funcionario> funcionarios; //multiplicidade 1..*
    
    private int numFunc; 
    
    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new ArrayList<Funcionario>();
        numFunc = 0;
    }

    public String getSigla() { 
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    
    //Tem como parametro de entrada o endereço de um objeto da subclasse
    //funcionarioHorista
    public void addFuncionario(Funcionario f){
        // Utiliza a classe ArrayList para criar uma lista dinamica
        // fazendo a ligação entre funcionario e o departamento
        funcionarios.add(f);
        //Estabelecendo a associação binária entre 1
        //objeto da classe Funcionario, qualquer que seja, com
        //1 objeto da classe Departamento
        f.setDepartamento(this);
    }
    
    public void listarFuncionarios(){
        System.out.println("\n\nSigla: " + sigla);
        System.out.println("Nome: " + nome);
        System.out.println("Qtde. Funcionarios: " + funcionarios.size());
        System.out.println("\nRegistro\t\tNome\t\tCargo");
        for (int x = 0; x < funcionarios.size(); x++){
            System.out.print(funcionarios.get(x).getRegistro() + "\t\t");
            System.out.print(funcionarios.get(x).getNome() + "\t\t");
            System.out.println(funcionarios.get(x).getCargo());
        }
    }
}
