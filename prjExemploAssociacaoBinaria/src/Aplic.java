
import fatec.poo.model.Departamento;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.Projeto;

/**
 * @author GustavoReis
 */
public class Aplic {
    public static void main(String[] args) {               
        
        //Instanciando objetos Funcionários
        FuncionarioHorista funcHor = new FuncionarioHorista(1010,
                                                            "Pedro Silveira",
                                                            "14/05/1978",
                                                            15.80);
        
        FuncionarioMensalista funcMen = new FuncionarioMensalista(2020,
                                                                  "Ana Beatriz", 
                                                                  "22/10/1997",
                                                                  600.0);
        
        FuncionarioComissionado funcCom = new FuncionarioComissionado(3030, 
                                                                     "Joao Mendes",
                                                                     "10/12/1975",
                                                                     10);
        
        //instanciação de objetos da classe Departamento
        Departamento dep1 = new Departamento("RH", "Recursos Humanos");
        Departamento dep2 = new Departamento("VD", "Vendas");
        
        // Instanciando objetos da classe projeto
        Projeto prj1 = new Projeto(123, "Back-end Fatec");
        
        // Definindo as datas de inicio e termino do projeto
        prj1.setDtInicio("01/02/2024");
        prj1.setDtTermino("31/10/2024");
        
        
        funcHor.setCargo("Programador");
        funcHor.setQtdeHorTrab(90);
               
        funcMen.setCargo("Aux. Admin.");
        funcMen.setNumSalMin(2.5);       
        
        funcCom.setCargo("Vendedor");
        funcCom.setSalBase(900);
        funcCom.addVendas(1000); 
        funcCom.addVendas(3000);
        funcCom.addVendas(4000);   
              
        //estabelecer a ligação entre um objeto da classe funcHorista, Mensalista
        //ou Comissionado com um obj da classe departamento
        funcHor.setDepartamento(dep1);
        System.out.println("O funcionario horista " + funcHor.getNome() + " é do departamento de " + funcHor.getDepartamento().getNome());
        
        funcMen.setDepartamento(dep1);
        System.out.println("O funcionario mensalista " + funcMen.getNome() + " é do departamento de " + funcMen.getDepartamento().getNome());
        
        funcCom.setDepartamento(dep2);
        System.out.println("O funcionario comissionado " + funcCom.getNome() + " é do departamento de " + funcCom.getDepartamento().getNome());
        
        // Estabelecendo a ligação entre um objeto departamento com um funcionario horista, mensalista
        dep1.addFuncionario(funcHor);
        dep1.addFuncionario(funcMen);
        
        dep1.listarFuncionarios();
        
        // Estabelecendo a ligação entre um objeto departamento com um funcionario comissionado
        dep2.addFuncionario(funcCom);
        
        dep2.listarFuncionarios();
        
        // Estabelecendo a ligação entre o funcionario e o projeto, no caso, todos os funcionarios no mesmo projeto
        funcHor.setProjeto(prj1);
        funcMen.setProjeto(prj1);
        funcCom.setProjeto(prj1);
        
        System.out.println("\n\nO Funcinario horista esta no projeto " + funcHor.getProjeto().getDescricao());
        System.out.println("O Funcinario mensalista esta no projeto " + funcMen.getProjeto().getDescricao());
        System.out.println("O Funcinario comissionado esta no projeto " + funcCom.getProjeto().getDescricao());
        
        // Estabelecendo a ligação do proejto com o funcionário
        prj1.addFuncionario(funcHor);
        prj1.addFuncionario(funcMen);
        prj1.addFuncionario(funcCom);
        
        prj1.listarFuncionario();
    }
}
