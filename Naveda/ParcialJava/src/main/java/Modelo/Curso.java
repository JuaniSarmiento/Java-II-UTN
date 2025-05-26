package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un curso con una materia y una lista de alumnos.
 */
public class Curso {
    private int id;
    private String materia;
    private List<Alumno> alumnos;

    public Curso() {
        this.alumnos = new ArrayList<>();
    }

    public Curso(int id, String materia, List<Alumno> alumnos) {
        this.id = id;
        this.materia = materia;
        this.alumnos = alumnos != null ? alumnos : new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia != null ? materia.trim() : "";
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos != null ? alumnos : new ArrayList<>();
    }

    @Override
    public String toString() {
        return String.format("ID: %d - Materia: %s", id, materia);
    }
}
