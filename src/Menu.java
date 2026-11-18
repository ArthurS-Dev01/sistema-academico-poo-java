import java.util.Scanner;

public class Menu {

    public static void Show() {

        Scanner scan = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("\nMENU");
            System.out.println("====================");
            System.out.println("1 - Gerenciar Alunos");
            System.out.println("2 - Gerenciar Disciplinas");
            System.out.println("3 - Gerenciar Cursos");
            System.out.println("4 - Sair");
            System.out.println("====================");
            System.out.print("Opção: ");

            opcao = scan.nextInt();

            switch (opcao) {

                case 1:
                    Submenu.ShowAlunos();
                    break;

                case 2:
                    Submenu.ShowDisciplinas();
                    break;

                case 3:
                    Submenu.ShowCursos();
                    break;

                case 4:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 4);
    }
}