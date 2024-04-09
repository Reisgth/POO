package fatec.poo.model;

/**
 * @author GustavoReis
 */
public class Projeto {
    // numFunc - armazena a quantidade de funcionario no projeto
    private int codigo, numFunc=0;
    private String descricao, dtInicio, dtTermino;
    
    // implementação da multiplicidade entre funcionario e projeto
    private Funcionario[] funcionarios;

    public Projeto(int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
        funcionarios = new Funcionario[5];
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public void setDtTermino(String dtTermino) {
        this.dtTermino = dtTermino;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDtInicio() {
        return dtInicio;
    }

    public String getDtTermino() {
        return dtTermino;
    }
    
    //Parametro de entrada eh um objeto da classe de funcionario
    public void addFuncionario(Funcionario f) {
        funcionarios[numFunc] = f;
        numFunc++;
    }
    
    public void listarFuncionario() {
        System.out.println("\n\nCodigo:          " + codigo);
        System.out.println("Descricao:           " + descricao);
        System.out.println("Inicio:              " + dtInicio);
        System.out.println("Termino:             " + dtTermino);
        System.out.println("Qtde Funcionarios:   " + numFunc);
        
        System.out.println("\nRegistro\tNome\t\t\tCargo\t\t\tDepartamento");
        for(int i=0; i<numFunc; i++){
            System.out.print(funcionarios[i].getRegistro() + "\t\t");
            System.out.print(funcionarios[i].getNome()+ "\t\t");
            System.out.print(funcionarios[i].getCargo()+ "\t\t");
            System.out.print(funcionarios[i].getDepartamento().getNome()+ "\n");
        }
    }
}
