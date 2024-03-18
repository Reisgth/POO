
import fatec.poo.model.Cliente;
import fatec.poo.model.Instrutor;

/**
 * @author Gustavo Reis
 */
public class Aplic {

    public static void main(String[] args) {
        Instrutor inst1 = new Instrutor(001, "Vinicius Matos", "1599999999");

        Cliente cli1 = new Cliente("123.456.789-00", "Tiago Sala", "15900000000");

        inst1.setAreaAtuacao("Personal Training");

        System.out.println("Identificação: " + inst1.getIdentificacao());
        System.out.println("Nome: " + inst1.getNome());
        System.out.println("Telefone: " + inst1.getTelefone());
        System.out.println("Area de atuacao: " + inst1.getAreaAtuacao());

        cli1.setAltura(1.70);
        cli1.setPeso(87);

        System.out.println("\n\nCPF: " + cli1.getCpf());
        System.out.println("Nome: " + cli1.getNome());
        System.out.println("Telefone: " + cli1.getTelefone());
        System.out.println("Peso: " + cli1.getPeso());
        System.out.println("Altura: " + cli1.getAltura());
        System.out.println("IMC: " + cli1.calcIMC());
    }

}
