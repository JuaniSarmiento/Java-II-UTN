package Modelo;

/**
 * Representa un alumno con sus datos personales y académicos.
 */
public class Alumno {
    private int id;
    private String nombre;
    private String apellido;
    private int curso;
    private double promedio;

    public Alumno() {}

    public Alumno(int id, String nombre, String apellido, int curso, double promedio) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.promedio = promedio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre != null ? nombre.trim() : "";
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido != null ? apellido.trim() : "";
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        if (promedio < 0 || promedio > 10) {
            throw new IllegalArgumentException("El promedio debe estar entre 0 y 10.");
        }
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return String.format("%s %s - Curso ID: %d - Promedio: %.2f", nombre, apellido, curso, promedio);
    }
}
