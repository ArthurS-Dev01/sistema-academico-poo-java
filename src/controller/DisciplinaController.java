package controller;

import Model.Curso;
import View.CursoView;
import dao.CursoDAO;
import dao.DisciplinaDAO;
import Model.Disciplina;
import View.DisciplinaView;

import java.util.Optional;

public class DisciplinaController {

    public static void Create() {

        if (CursoDAO.cursoList.isEmpty()) {
            DisciplinaView.Message(
                    "Nenhum curso cadastrado. Cadastre um curso primeiro!"
            );
            return;
        }

        Disciplina disciplina = new Disciplina();

        DisciplinaView.Create(disciplina);

        System.out.println("\nCURSOS DISPONÍVEIS");
        System.out.println("====================");

        for (Curso curso : CursoDAO.cursoList) {

            CursoView.Show(curso);

            System.out.println("--------------------");
        }

        int idCurso = DisciplinaView.GetCursoId();

        Optional<Curso> curso = CursoDAO.Read(idCurso);

        if (curso.isPresent()) {

            disciplina.setCurso(curso.get());

            curso.get().adicionarDisciplina(disciplina);

            if (disciplina.getIdDisciplina() != 0) {

                DisciplinaDAO.Create(disciplina);

                DisciplinaView.Message(
                        "Disciplina cadastrada com sucesso!"
                );

            } else {

                DisciplinaView.Message(
                        "Disciplina inválida!"
                );
            }

        } else {

            DisciplinaView.Message(
                    "Curso não encontrado!"
            );
        }
    }

    public static void Read() {
        int id = DisciplinaView.Read();
        Optional<Disciplina> disciplina = DisciplinaDAO.Read(id);
        if (disciplina.isPresent()) {
            DisciplinaView.Show(disciplina.get());
        } else {
            DisciplinaView.Message("Disciplina não encontrada!");
        }
    }

    public static void Update() {
        int id = DisciplinaView.Read();
        Optional<Disciplina> disciplina = DisciplinaDAO.Read(id);
        if (disciplina.isPresent()) {
            DisciplinaView.Update(disciplina.get());
        } else {
            DisciplinaView.Message("Disciplina não encontrada!");
        }
    }

    public static void Delete() {

        int id = DisciplinaView.Read();

        Optional<Disciplina> disciplina = DisciplinaDAO.Read(id);

        if (disciplina.isPresent()) {

            Disciplina disciplinaEncontrada = disciplina.get();

            if (disciplinaEncontrada.getCurso() != null) {

                disciplinaEncontrada
                        .getCurso()
                        .removerDisciplina(disciplinaEncontrada);
            }

            DisciplinaDAO.Delete(id);

            DisciplinaView.Message(
                    "Disciplina excluída com sucesso!"
            );

        } else {

            DisciplinaView.Message(
                    "Disciplina não encontrada!"
            );
        }
    }

}