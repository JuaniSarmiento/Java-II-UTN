package Dao;

import Modelo.Curso;

/**
 * DAO específico para Curso.
 */
public interface CursoDAO extends GenericDAO<Curso, Integer> {
    Curso buscarPorMateria(String materia);
}
