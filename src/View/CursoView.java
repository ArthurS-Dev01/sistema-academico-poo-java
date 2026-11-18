package View;

import java.util.Scanner;
import Model.Curso;
import Model.Disciplina;

public class CursoView {

    public static void Create(Curso curso) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o Id: ");
        int id = scan.nextInt();
        System.out.println("Informe o nome: ");
        String nome = scan.next();
        System.out.println("Informe o turno: ");
        String turno = scan.next();

        curso.setId(id);
        curso.setNome(nome);
        curso.setTurno(turno);
    }

    public static int Read() {return GetId();}

    public static  void Update (Curso curso) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o novo id: (" + curso.getId() + ")");
        int id = scan.nextInt();
        System.out.println("Informe o novo nome: (" + curso.getNome() + ")");
        String nome = scan.next();
        System.out.println("Informe o novo turno: (" + curso.getTurno() + ")");
        String turno = scan.next();

        curso.setId(id);
        curso.setNome(nome);
        curso.setTurno(turno);
    }

    public static void Delete() {
        System.out.println("Curso deletado!");
    }

    public static void Show(Curso curso) {

        System.out.println("Id: " + curso.getId());
        System.out.println("Nome: " + curso.getNome());
        System.out.println("Turno: " + curso.getTurno());

        System.out.println("Disciplinas:");

        if (curso.getDisciplinas().isEmpty()) {

            System.out.println("Nenhuma disciplina cadastrada.");

        } else {

            for (Disciplina disciplina : curso.getDisciplinas()) {

                System.out.println(
                        "- " +
                                disciplina.getIdDisciplina() +
                                " | " +
                                disciplina.getNome() +
                                " | " +
                                disciplina.getCargaHoraria() +
                                "h"
                );
            }
        }
    }

    public static void Message(String message) {
        System.out.println(message);
    }

    public static int GetId() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o ID: ");
        return scan.nextInt();
    }
}
