package View;

import java.util.Scanner;
import Model.Aluno;

public class AlunoView {

    public static void Create(Aluno aluno) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe sua matricula: ");
        int matricula = scan.nextInt();
        System.out.println("Informe sua nome: ");
        String nome = scan.next();
        System.out.println("Informe sua idade: ");
        int idade = scan.nextInt();

        aluno.setMatricula(matricula);
        aluno.setNome(nome);
        aluno.setIdade(idade);
    }

    public static int Read() {
        return GetMatricula();
    }

    public static void Update(Aluno aluno) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a nova matricula: (" + aluno.getMatricula() + ")");
        int matricula = scan.nextInt();
        System.out.println("Informe o novo nome: (" + aluno.getNome() + ")");
        String nome = scan.next();
        System.out.println("Informe a nova idade: (" + aluno.getIdade() + ")");
        int idade = scan.nextInt();

        aluno.setMatricula(matricula);
        aluno.setNome(nome);
        aluno.setIdade(idade);
    }

    public static void Delete() {

    }

    public static void Show(Aluno aluno) {
        System.out.println("Matricula: " + aluno.getMatricula());
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Curso: " + aluno.getCurso().getNome() + " (" + aluno.getCurso().getTurno() + ")");
    }

    public static void Message(String message) {
        System.out.println(message);
    }

    public static int GetMatricula() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a matricula: ");
        return scan.nextInt();
    }
    public static int GetCursoId() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o ID do curso do aluno: ");
        return scan.nextInt();
    }
}
