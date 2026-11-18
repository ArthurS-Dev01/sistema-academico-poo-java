package controller;

import dao.AlunoDAO;
import dao.CursoDAO;

import Model.Aluno;
import Model.Curso;

import View.AlunoView;
import View.CursoView;

import java.util.Optional;

public class AlunoController {

    public static void Create() {

        Aluno aluno = new Aluno();

        AlunoView.Create(aluno);

        if (CursoDAO.cursoList.isEmpty()) {
            AlunoView.Message("Nenhum curso cadastrado. Cadastre um curso primeiro!");
            return;
        }

        System.out.println("\nCURSOS DISPONÍVEIS");

        for (Curso curso : CursoDAO.cursoList) {
            CursoView.Show(curso);
            System.out.println("--------------------");
        }
        int idCurso = AlunoView.GetCursoId();
        Optional<Curso> curso = CursoDAO.Read(idCurso);

        if (curso.isPresent()) {
            aluno.setCurso(curso.get());

            if (aluno.getMatricula() != 0) {

                AlunoDAO.Create(aluno);

                AlunoView.Message("Aluno cadastrado com sucesso!");

            } else {

                AlunoView.Message("Aluno inválido!");
            }

        } else {

            AlunoView.Message("Curso não encontrado!");
        }
    }

    public static void Read() {
        int matricula = AlunoView.Read();
        Optional<Aluno> aluno = AlunoDAO.Read(matricula);
        if (aluno.isPresent()) {
            AlunoView.Show(aluno.get());
        } else {
            AlunoView.Message("Aluno não encontrado!");
        }
    }

    public static void Update() {
        int matricula = AlunoView.Read();
        Optional<Aluno> aluno = AlunoDAO.Read(matricula);
        if (aluno.isPresent()) {
            AlunoView.Update(aluno.get());
        } else {
            AlunoView.Message("Aluno não encontrado!");
        }
    }

    public static void Delete() {
        int matricula = AlunoView.Read();
        if (AlunoDAO.Delete(matricula)) {
            AlunoView.Message("Aluno excluido com sucesso!");
        } else {
            AlunoView.Message("Aluno não encontrado!");
        }
    }

}
