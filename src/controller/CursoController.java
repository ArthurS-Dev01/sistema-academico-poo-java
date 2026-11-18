package controller;

import dao.CursoDAO;
import Model.Curso;
import View.CursoView;

import java.util.Optional;

public class CursoController {

    public static void Create() {
        Curso curso = new Curso();
        CursoView.Create(curso);

        if (curso.getId() != 0) {
            CursoDAO.Create(curso);
        } else {
            CursoView.Message("Curso inválido!");
        }
    }

    public static void Read() {
        int id = CursoView.Read();
        Optional<Curso> curso = CursoDAO.Read(id);
        if (curso.isPresent()) {
            CursoView.Show(curso.get());
        } else {
            CursoView.Message("Curso não encontrado!");
        }
    }

    public static void Update() {
        int id = CursoView.Read();
        Optional<Curso> curso = CursoDAO.Read(id);
        if (curso.isPresent()) {
            CursoView.Update(curso.get());
        } else {
            CursoView.Message("Curso não encontrado!");
        }
    }

    public static void Delete() {
        int id = CursoView.Read();
        if (CursoDAO.Delete(id)) {
            CursoView.Message("Curso excluido com sucesso!");
        } else {
            CursoView.Message("Curso não encontrado!");
        }
    }

}
