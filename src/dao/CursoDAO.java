package dao;

import Model.Curso;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CursoDAO {

    public static List<Curso> cursoList = new ArrayList<>();

    public static void Create(Curso curso) {
        cursoList.add(curso);
    }

    public static Optional<Curso> Read(int id) {
        return cursoList.stream().filter(curso -> curso.getId() == id).findFirst();
    }

    public static boolean Delete(int id) {
        Optional<Curso> curso = Read(id);
        if (curso.isPresent()) {
            cursoList.remove(curso.get());
            return true;
        } else {
            return false;
        }
    }

}
