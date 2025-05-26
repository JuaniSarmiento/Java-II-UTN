<<<<<<< HEAD
import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear profesores
        Profesor profe1 = new Profesor("Juan González", 111);
        Profesor profe2 = new Profesor("Luna Pérez", 222);

        // Crear asignaturas
        Asignatura asig1 = new Asignatura(101, profe1);
        Asignatura asig2 = new Asignatura(202, profe2);
        Asignatura asig3 = new Asignatura(303, profe1);
        Asignatura asig4 = new Asignatura(401, profe2);

        // Crear estudiantes
        Estudiante estudiante = new Estudiante("Martina López", 333, new HashMap<>());
        Estudiante estudiante2 = new Estudiante("Luciano Rodriguez", 327, new HashMap<>());
        Estudiante estudiante3 = new Estudiante("Cristian Castro", 123, new HashMap<>());

        // Crear inscripciones (mínimo dos por alumno)
        Inscripcion inscripcion1 = new Inscripcion(new Date(), estudiante, asig1); // Martina - 101
        Inscripcion inscripcion2 = new Inscripcion(new Date(), estudiante, asig4); // Martina - 401
        Inscripcion inscripcion3 = new Inscripcion(new Date(), estudiante2, asig2); // Luciano - 202
        Inscripcion inscripcion4 = new Inscripcion(new Date(), estudiante2, asig3); // Luciano - 303
        Inscripcion inscripcion5 = new Inscripcion(new Date(), estudiante3, asig3); // Cristian - 303
        Inscripcion inscripcion6 = new Inscripcion(new Date(), estudiante3, asig4); // Cristian - 401

        // Agregar inscripciones al formulario de cada estudiante
        estudiante.formulario.put("101", inscripcion1);
        estudiante.formulario.put("401", inscripcion2);
        estudiante2.formulario.put("202", inscripcion3);
        estudiante2.formulario.put("303", inscripcion4);
        estudiante3.formulario.put("303", inscripcion5);
        estudiante3.formulario.put("401", inscripcion6);

        // Guardar inscripciones en una lista general
        List<Inscripcion> todasLasInscripciones = new ArrayList<>();
        todasLasInscripciones.add(inscripcion1);
        todasLasInscripciones.add(inscripcion2);
        todasLasInscripciones.add(inscripcion3);
        todasLasInscripciones.add(inscripcion4);
        todasLasInscripciones.add(inscripcion5);
        todasLasInscripciones.add(inscripcion6);

        // 1. Mostrar estudiante y asignatura de cada inscripción
        System.out.println("===== Estudiante y Asignatura de cada Inscripción =====");
        for (Inscripcion insc : todasLasInscripciones) {
            System.out.println("Estudiante: " + insc.inscripto.getNombre());
            System.out.println("Asignatura código: " + insc.getEn().getCodigo());
            System.out.println("-------------------------------");
        }

        // 2. Mostrar fecha de inscripción y profesor de cada asignatura
        System.out.println("\n===== Fecha de Inscripción y Profesor de cada Asignatura =====");
        for (Inscripcion insc : todasLasInscripciones) {
            System.out.println("Fecha de inscripción: " + insc.getFecha());
            System.out.println("Profesor: " + insc.getEn().instructor.getNombre());
            System.out.println("-------------------------------");
        }

        // 3. Mostrar todas las asignaturas de un alumno pedido por pantalla
        System.out.println("\nIngrese el nombre del alumno para mostrar sus asignaturas:");
        String nombreAlumno = scanner.nextLine().trim();

        System.out.println("\n===== Asignaturas de " + nombreAlumno + " =====");
        boolean encontrado = false;
        for (Inscripcion insc : todasLasInscripciones) {
            if (insc.inscripto != null && insc.inscripto.getNombre() != null &&
                    insc.inscripto.getNombre().equalsIgnoreCase(nombreAlumno)) {
                System.out.println("Asignatura código: " + insc.getEn().getCodigo());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron inscripciones para ese alumno.");
        }
    }
}
=======
import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear profesores
        Profesor profe1 = new Profesor("Juan González", 111);
        Profesor profe2 = new Profesor("Luna Pérez", 222);

        // Crear asignaturas
        Asignatura asig1 = new Asignatura(101, profe1);
        Asignatura asig2 = new Asignatura(202, profe2);
        Asignatura asig3 = new Asignatura(303, profe1);
        Asignatura asig4 = new Asignatura(401, profe2);

        // Crear estudiantes
        Estudiante estudiante = new Estudiante("Martina López", 333, new HashMap<>());
        Estudiante estudiante2 = new Estudiante("Luciano Rodriguez", 327, new HashMap<>());
        Estudiante estudiante3 = new Estudiante("Cristian Castro", 123, new HashMap<>());

        // Crear inscripciones (mínimo dos por alumno)
        Inscripcion inscripcion1 = new Inscripcion(new Date(), estudiante, asig1); // Martina - 101
        Inscripcion inscripcion2 = new Inscripcion(new Date(), estudiante, asig4); // Martina - 401
        Inscripcion inscripcion3 = new Inscripcion(new Date(), estudiante2, asig2); // Luciano - 202
        Inscripcion inscripcion4 = new Inscripcion(new Date(), estudiante2, asig3); // Luciano - 303
        Inscripcion inscripcion5 = new Inscripcion(new Date(), estudiante3, asig3); // Cristian - 303
        Inscripcion inscripcion6 = new Inscripcion(new Date(), estudiante3, asig4); // Cristian - 401

        // Agregar inscripciones al formulario de cada estudiante
        estudiante.formulario.put("101", inscripcion1);
        estudiante.formulario.put("401", inscripcion2);
        estudiante2.formulario.put("202", inscripcion3);
        estudiante2.formulario.put("303", inscripcion4);
        estudiante3.formulario.put("303", inscripcion5);
        estudiante3.formulario.put("401", inscripcion6);

        // Guardar inscripciones en una lista general
        List<Inscripcion> todasLasInscripciones = new ArrayList<>();
        todasLasInscripciones.add(inscripcion1);
        todasLasInscripciones.add(inscripcion2);
        todasLasInscripciones.add(inscripcion3);
        todasLasInscripciones.add(inscripcion4);
        todasLasInscripciones.add(inscripcion5);
        todasLasInscripciones.add(inscripcion6);

        // 1. Mostrar estudiante y asignatura de cada inscripción
        System.out.println("===== Estudiante y Asignatura de cada Inscripción =====");
        for (Inscripcion insc : todasLasInscripciones) {
            System.out.println("Estudiante: " + insc.inscripto.getNombre());
            System.out.println("Asignatura código: " + insc.getEn().getCodigo());
            System.out.println("-------------------------------");
        }

        // 2. Mostrar fecha de inscripción y profesor de cada asignatura
        System.out.println("\n===== Fecha de Inscripción y Profesor de cada Asignatura =====");
        for (Inscripcion insc : todasLasInscripciones) {
            System.out.println("Fecha de inscripción: " + insc.getFecha());
            System.out.println("Profesor: " + insc.getEn().instructor.getNombre());
            System.out.println("-------------------------------");
        }

        // 3. Mostrar todas las asignaturas de un alumno pedido por pantalla
        System.out.println("\nIngrese el nombre del alumno para mostrar sus asignaturas:");
        String nombreAlumno = scanner.nextLine().trim();

        System.out.println("\n===== Asignaturas de " + nombreAlumno + " =====");
        boolean encontrado = false;
        for (Inscripcion insc : todasLasInscripciones) {
            if (insc.inscripto != null && insc.inscripto.getNombre() != null &&
                    insc.inscripto.getNombre().equalsIgnoreCase(nombreAlumno)) {
                System.out.println("Asignatura código: " + insc.getEn().getCodigo());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron inscripciones para ese alumno.");
        }
    }
}
>>>>>>> 282639c696d7bd377e9aec96ee6f3ed75d109494
