
import fatec.poo.model.Aluno;
import fatec.poo.model.Curso;
import fatec.poo.model.Instrutor;
import fatec.poo.model.Matricula;
import fatec.poo.model.Turma;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author GustavoReis
 */
public class Aplic {
    public static void main(String[] args) {
        // Entrada de dados e mascara de numeros reais
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.0");
        
        // Definindo objetos a serem instanciados
        Curso c1;
        Turma t1, t2;
        Instrutor i1;
        // Utilizando o ArrayList para definir os objetos alunos e matriculas
        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Matricula> matriculas = new ArrayList<>();
        
        // Definindo variaveis auxiliares para instancialção
        String nome, raAluno, siglaCurso, descCurso, dataMatricula;
        int codTurma, codInstrutor;
        
        // Recebendo os valores para instanciação de um novo objeto Curso
        System.out.print("Sigla do Curso: ");
        siglaCurso = entrada.nextLine();
        System.out.print("Descricao do Curso: ");
        descCurso = entrada.nextLine();
        // Instanciando um objeto curso
        c1 = new Curso(siglaCurso, descCurso);
        // Recebendo e utilizando o metodo set para cargaHorária e valor do curso
        System.out.print("Carga Horária do Curso: ");
        c1.setCargaHoraria(entrada.nextInt());
        System.out.print("Valor do Curso: ");
        c1.setValor(entrada.nextDouble());
        
        
        
        // Recebendo os valores para instanciação de uma nova turma
        System.out.print("Codigo da turma 1: ");
        codTurma = entrada.nextInt();
        // Instanciando a turma1
        t1 = new Turma(codTurma);
        
        // Recebendo e utilizando o metodo set para definir as vagas da Turma
        System.out.print("Quantidade de vagas da turma 1: ");
        t1.setQtdeVagas(entrada.nextInt());
        
        // Recebendo os valores para instanciação de uma nova tur
        System.out.print("Codigo da turma 2: ");
        codTurma = entrada.nextInt();
        // Instanciando a turma2
        t2 = new Turma(codTurma);    
        // Recebendo e utilizando o metodo set para definir as vagas da Turma
        System.out.print("Quantidade de vagas da turma 2: ");
        t2.setQtdeVagas(entrada.nextInt());
        
        
        
        // Recebendo os valores para instanciação de um instrutos
        System.out.print("Codigo do instrutor: ");
        codInstrutor = entrada.nextInt();
        System.out.print("Nome do instrutor: ");
        nome = entrada.next( );
        // Instanciando um novo instrutor
        i1 = new Instrutor(codInstrutor, nome);
        // Recebendo e armazenando no cadastro do instrutor 
        // os dados herdados da superclasse pessoa
        System.out.print("Data de nascimento do instrutor: ");
        i1.setDtNascimento(entrada.nextLine());
        System.out.print("Endereco do instrutor: ");
        i1.setEndereco(entrada.nextLine());
        // Recebendo os dados restantes de utilizando e armazenando
        // utiliziando o metodo set
        System.out.print("Area de atuação do instrutor: ");
        i1.setAreaAtuacao(entrada.nextLine());
        System.out.print("Valor da hora trabalhada do instrutor: ");
        i1.setValorHora(entrada.nextDouble());
        
        
        
        
        // Instanciação dos 5 objetos aluno e 5 objetos matriculas
        for(int i=0; i<5; i++){
            // Recebendo o nome e o RA do aluno
            System.out.print("Nome do aluno: ");
            nome = entrada.nextLine();
            System.out.print("RA do aluno: ");
            raAluno = entrada.nextLine();
            // Fazendo a instanciação do objeto aluno
            alunos.add(new Aluno(nome, raAluno));
            // Recebendo a escolaridade do aluno e utilizando o metodo 
            // setEscolaridade para armazenar
            System.out.print("Escolaridade do aluno: ");
            alunos.get(i).setEscolaridade(entrada.nextLine());
            // Recebendo e armazenando o cadastro do instrutor, herdado da superclasse pessoa
            System.out.print("Data de nascimento do instrutor: ");
            i1.setDtNascimento(entrada.nextLine());
            System.out.print("Endereco do instrutor: ");
            i1.setEndereco(entrada.nextLine());
            // Recebendo e armazenando no cadastro de alunos os dados
            // herdados da superclasse pessoa
            System.out.print("Data de nascimento do instrutor: ");
            i1.setDtNascimento(entrada.nextLine());
            System.out.print("Endereco do instrutor: ");
            i1.setEndereco(entrada.nextLine());
            
            // Recebendo os dados o objeto matricula
            System.out.print("Data da Matricula: ");
            dataMatricula = entrada.nextLine();
            // Instanciando o objeto matricula
            matriculas.add(new Matricula(dataMatricula));
            
            // Definindo a ligação entre o aluno e a matricula
            alunos.get(i).setMatricula(matriculas.get(i));
            matriculas.get(i).setAluno(alunos.get(i));
            
            // Fazendo a interação das matriculas com as turmas
            if(i<3)
                //Até a terceira matricula, pertencente a turma 1
                matriculas.get(i).setTurma(t1);
            else
                //As matriculas restantes pertencentes a turma 2
                matriculas.get(i).setTurma(t2);
            
            // Entrada de dados genericas, definindo as notas dos alunos e suas faltas.
            System.out.println("Média: "); 
            matriculas.get(i).setMedia(entrada.nextDouble());
            System.out.println("Faltas: "); 
            matriculas.get(i).setQtdeFaltas(entrada.nextInt());
        }
        
        t1.listarAlunos();
    }
}
