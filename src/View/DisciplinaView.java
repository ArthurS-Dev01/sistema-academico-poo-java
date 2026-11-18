package View;

import Model.Disciplina;

import java.util.Scanner;

public class DisciplinaView {

    public static void Create(Disciplina disciplina) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o id da disciplina: ");
        int id = Integer.parseInt(scan.nextLine().trim());
        System.out.println("Informe o nome da disciplina: ");
        String nome = scan.nextLine();
        System.out.println("Informe a carga horária: ");
        double cargaHoraria = Double.parseDouble(scan.nextLine().trim().replace(",", "."));

        disciplina.setIdDisciplina(id);
        disciplina.setNome(nome);
        disciplina.setCargaHoraria(cargaHoraria);
    }

    public static int Read() {
        return GetId();
    }

    public static void Update(Disciplina disciplina) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o novo id: (" + disciplina.getIdDisciplina() + ")");
        int id = Integer.parseInt(scan.nextLine().trim());
        System.out.println("Informe o novo nome: (" + disciplina.getNome() + ")");
        String nome = scan.nextLine();
        System.out.println("Informe a nova carga horária: (" + disciplina.getCargaHoraria() + ")");
        double cargaHoraria = Double.parseDouble(scan.nextLine().trim().replace(",", "."));

        disciplina.setIdDisciplina(id);
        disciplina.setNome(nome);
        disciplina.setCargaHoraria(cargaHoraria);
    }

    public static void Delete() {

    }

    public static void Show(Disciplina disciplina) {
        System.out.println("Id: " + disciplina.getIdDisciplina());
        System.out.println("Nome: " + disciplina.getNome());
        System.out.println("Carga horária: " + disciplina.getCargaHoraria());

        if (disciplina.getCurso() != null) {
            System.out.println("Curso: " + disciplina.getCurso().getNome());
        }
    }

    public static void Message(String message) {
        System.out.println(message);
    }

    public static int GetId() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o id da disciplina: ");
        return Integer.parseInt(scan.nextLine().trim());
    }

    public static int GetCursoId() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o ID do curso da disciplina: ");

        return Integer.parseInt(scan.nextLine().trim());
    }
}