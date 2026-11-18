package dao;

import Model.Disciplina;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DisciplinaDAO {

    public static List<Disciplina> disciplinaList = new ArrayList<>();

    public static void Create(Disciplina disciplina) {
        disciplinaList.add(disciplina);
    }

    public static Optional<Disciplina> Read(int idDisciplina) {
        return disciplinaList.stream().filter(disciplina -> disciplina.getIdDisciplina() == idDisciplina).findFirst();
    }

    public static boolean Delete(int idDisciplina) {
        Optional<Disciplina> disciplina = Read(idDisciplina);
        if (disciplina.isPresent()) {
            disciplinaList.remove(disciplina.get());
            return true;
        } else {
            return false;
        }
    }

}