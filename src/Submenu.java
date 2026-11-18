import controller.AlunoController;
import controller.CursoController;
import controller.DisciplinaController;

import java.util.Scanner;

public class Submenu {

    private static final Scanner scan = new Scanner(System.in);

    public static void ShowAlunos() {

        int opcao = -1;

        do {
            System.out.println("\nSUBMENU - ALUNOS");
            System.out.println("====================");
            System.out.println("1 - Criar Aluno");
            System.out.println("2 - Ler Aluno");
            System.out.println("3 - Deletar Aluno");
            System.out.println("4 - Atualizar Aluno");
            System.out.println("5 - Voltar");
            System.out.println("====================");
            System.out.print("Opção: ");

            opcao = scan.nextInt();

            switch (opcao) {

                case 1:
                    AlunoController.Create();
                    break;

                case 2:
                    AlunoController.Read();
                    break;

                case 3:
                    AlunoController.Delete();
                    break;

                case 4:
                    AlunoController.Update();
                    break;

                case 5:
                    System.out.println("Voltando ao menu principal...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 5);
    }


    public static void ShowDisciplinas() {

        int opcao = -1;

        do {
            System.out.println("\nSUBMENU - DISCIPLINAS");
            System.out.println("====================");
            System.out.println("1 - Criar Disciplina");
            System.out.println("2 - Ler Disciplina");
            System.out.println("3 - Deletar Disciplina");
            System.out.println("4 - Atualizar Disciplina");
            System.out.println("5 - Voltar");
            System.out.println("====================");
            System.out.print("Opção: ");

            opcao = scan.nextInt();

            switch (opcao) {

                case 1:
                    DisciplinaController.Create();
                    break;

                case 2:
                    DisciplinaController.Read();
                    break;

                case 3:
                    DisciplinaController.Delete();
                    break;

                case 4:
                    DisciplinaController.Update();
                    break;

                case 5:
                    System.out.println("Voltando ao menu principal...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 5);
    }


    public static void ShowCursos() {

        int opcao = -1;

        do {
            System.out.println("\nSUBMENU - CURSOS");
            System.out.println("====================");
            System.out.println("1 - Criar Curso");
            System.out.println("2 - Ler Curso");
            System.out.println("3 - Deletar Curso");
            System.out.println("4 - Atualizar Curso");
            System.out.println("5 - Voltar");
            System.out.println("====================");
            System.out.print("Opção: ");

            opcao = scan.nextInt();

            switch (opcao) {

                case 1:
                    CursoController.Create();
                    break;

                case 2:
                    CursoController.Read();
                    break;

                case 3:
                    CursoController.Delete();
                    break;

                case 4:
                    CursoController.Update();
                    break;

                case 5:
                    System.out.println("Voltando ao menu principal...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 5);
    }
}