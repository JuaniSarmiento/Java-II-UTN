<<<<<<< HEAD
import java.util.HashMap;
import java.util.List;

public class Estudiante extends Persona {
    public HashMap<String, Inscripcion> formulario;

    public Estudiante() {
    }

    public Estudiante(HashMap<String, Inscripcion> formulario) {
        this.formulario = formulario;
    }

    public Estudiante(String nombre, Integer legajo, HashMap<String, Inscripcion> formulario) {
        super(nombre, legajo);
        this.formulario = formulario;
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Formulario de Inscripciones:");
        if (formulario != null) {
            for (String clave : formulario.keySet()) {
                formulario.get(clave).mostrarDatos();
            }
        }
        }
}
=======
import java.util.HashMap;
import java.util.List;

public class Estudiante extends Persona {
    public HashMap<String, Inscripcion> formulario;

    public Estudiante() {
    }

    public Estudiante(HashMap<String, Inscripcion> formulario) {
        this.formulario = formulario;
    }

    public Estudiante(String nombre, Integer legajo, HashMap<String, Inscripcion> formulario) {
        super(nombre, legajo);
        this.formulario = formulario;
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Formulario de Inscripciones:");
        if (formulario != null) {
            for (String clave : formulario.keySet()) {
                formulario.get(clave).mostrarDatos();
            }
        }
        }
}
>>>>>>> 282639c696d7bd377e9aec96ee6f3ed75d109494
