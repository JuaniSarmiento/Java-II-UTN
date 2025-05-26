<<<<<<< HEAD
import java.util.Date;

public class Inscripcion {
    private java.util.Date fecha;
    public  Estudiante inscripto;
    private Asignatura en = new Asignatura();

    public Asignatura getEn() {
        return en;
    }

    public void setEn(Asignatura en) {
        this.en = en;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Inscripcion() {}

    public Inscripcion(Date fecha, Estudiante inscripto, Asignatura en) {
        this.fecha = fecha;
        this.inscripto = inscripto;
        this.en = en;
    }

    public void mostrarDatos() {
        System.out.println("Fecha de Inscripción: " + fecha);
        if (en != null) {
            System.out.println("Asignatura inscripta:");
            en.mostrarDatos();
        }
    }

}
=======
import java.util.Date;

public class Inscripcion {
    private java.util.Date fecha;
    public  Estudiante inscripto;
    private Asignatura en = new Asignatura();

    public Asignatura getEn() {
        return en;
    }

    public void setEn(Asignatura en) {
        this.en = en;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Inscripcion() {}

    public Inscripcion(Date fecha, Estudiante inscripto, Asignatura en) {
        this.fecha = fecha;
        this.inscripto = inscripto;
        this.en = en;
    }

    public void mostrarDatos() {
        System.out.println("Fecha de Inscripción: " + fecha);
        if (en != null) {
            System.out.println("Asignatura inscripta:");
            en.mostrarDatos();
        }
    }

}
>>>>>>> 282639c696d7bd377e9aec96ee6f3ed75d109494
