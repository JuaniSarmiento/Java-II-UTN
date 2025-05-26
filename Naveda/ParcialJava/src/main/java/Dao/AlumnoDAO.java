package Dao;

import Modelo.Alumno;

import java.util.List;

/**
 * DAO específico para Alumno.
 */
public interface AlumnoDAO extends GenericDAO<Alumno, Integer> {
    List<Alumno> buscarPorCurso(int cursoId);
}
