<<<<<<< HEAD
public class Asignatura {
    private Integer codigo;
    public Profesor instructor;
public Asignatura(){}
    public Asignatura(Integer codigo, Profesor profesor){
    this.codigo = codigo;
    this.instructor = profesor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void mostrarDatos() {
        System.out.println("Código de Asignatura: " + codigo);
        if (instructor != null) {
            System.out.println("Profesor a cargo:");
            instructor.mostrarDatos();
        }
    }
}
=======
public class Asignatura {
    private Integer codigo;
    public Profesor instructor;
public Asignatura(){}
    public Asignatura(Integer codigo, Profesor profesor){
    this.codigo = codigo;
    this.instructor = profesor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void mostrarDatos() {
        System.out.println("Código de Asignatura: " + codigo);
        if (instructor != null) {
            System.out.println("Profesor a cargo:");
            instructor.mostrarDatos();
        }
    }
}
>>>>>>> 282639c696d7bd377e9aec96ee6f3ed75d109494
