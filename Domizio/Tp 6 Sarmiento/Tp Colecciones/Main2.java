<<<<<<< HEAD
import java.util.Date;
import java.util.HashMap;

public class Main2 {
    public static void main(String[] args) {
        // Crear profesor
        Profesor profe1 = new Profesor("Juani González", 123);
        Profesor profe2 = new Profesor("Luna Pérez", 456);

        // Crear asignaturas
        Asignatura asignatura1 = new Asignatura(101, profe1);
        Asignatura asignatura2 = new Asignatura(202, profe2);

        // Crear estudiante
        Estudiante estudiante = new Estudiante("Martina López", 789, new HashMap<>());

        // Crear inscripciones
        Inscripcion inscripcion1 = new Inscripcion(new Date(), estudiante, asignatura1);
        Inscripcion inscripcion2 = new Inscripcion(new Date(), estudiante, asignatura2);

        // Cargar inscripciones en el formulario
        estudiante.formulario.put("101", inscripcion1);
        estudiante.formulario.put("202", inscripcion2);

        // Mostrar lo pedido
        System.out.println("===== Asignaturas inscriptas y Profesor a cargo =====");
        for (Inscripcion insc : estudiante.formulario.values()) {
            if (insc.getEn() != null) {
                System.out.println("- Asignatura código: " + insc.getEn().getCodigo() +
                        " | Profesor: " + insc.getEn().instructor.getNombre());
            }
        }

        System.out.println("\n===== Fechas de Inscripción y Asignaturas =====");
        for (Inscripcion insc : estudiante.formulario.values()) {
            if (insc.getEn() != null) {
                System.out.println("- Fecha: " + insc.getFecha() +
                        " | Asignatura código: " + insc.getEn().getCodigo());
            }
        }
    }
}
=======
import java.util.Date;
import java.util.HashMap;

public class Main2 {
    public static void main(String[] args) {
        // Crear profesor
        Profesor profe1 = new Profesor("Juani González", 123);
        Profesor profe2 = new Profesor("Luna Pérez", 456);

        // Crear asignaturas
        Asignatura asignatura1 = new Asignatura(101, profe1);
        Asignatura asignatura2 = new Asignatura(202, profe2);

        // Crear estudiante
        Estudiante estudiante = new Estudiante("Martina López", 789, new HashMap<>());

        // Crear inscripciones
        Inscripcion inscripcion1 = new Inscripcion(new Date(), estudiante, asignatura1);
        Inscripcion inscripcion2 = new Inscripcion(new Date(), estudiante, asignatura2);

        // Cargar inscripciones en el formulario
        estudiante.formulario.put("101", inscripcion1);
        estudiante.formulario.put("202", inscripcion2);

        // Mostrar lo pedido
        System.out.println("===== Asignaturas inscriptas y Profesor a cargo =====");
        for (Inscripcion insc : estudiante.formulario.values()) {
            if (insc.getEn() != null) {
                System.out.println("- Asignatura código: " + insc.getEn().getCodigo() +
                        " | Profesor: " + insc.getEn().instructor.getNombre());
            }
        }

        System.out.println("\n===== Fechas de Inscripción y Asignaturas =====");
        for (Inscripcion insc : estudiante.formulario.values()) {
            if (insc.getEn() != null) {
                System.out.println("- Fecha: " + insc.getFecha() +
                        " | Asignatura código: " + insc.getEn().getCodigo());
            }
        }
    }
}
>>>>>>> 282639c696d7bd377e9aec96ee6f3ed75d109494
