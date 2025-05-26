<<<<<<< HEAD
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creamos el profesor
        Profesor profe = new Profesor("Juan González", 123);

        // Creamos asignaturas y las agregamos al curso del profesor
        Asignatura matematica = new Asignatura(101, profe);
        Asignatura fisica = new Asignatura(102, profe);
        profe.curso.add(matematica);
        profe.curso.add(fisica);

        // Creamos estudiantes y los inscribimos
        Estudiante e1 = new Estudiante("Lucas", 1, new HashMap<>());
        Estudiante e2 = new Estudiante("Martina", 2, new HashMap<>());
        Estudiante e3 = new Estudiante("Tomás", 3, new HashMap<>());

        Inscripcion ins1 = new Inscripcion(new Date(), e1, matematica);
        Inscripcion ins2 = new Inscripcion(new Date(), e2, matematica);
        Inscripcion ins3 = new Inscripcion(new Date(), e3, fisica);

        // Agregamos las inscripciones a los formularios de los estudiantes
        e1.formulario.put("101", ins1);
        e2.formulario.put("101", ins2);
        e3.formulario.put("102", ins3);

        // Lista de estudiantes
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(e1);
        estudiantes.add(e2);
        estudiantes.add(e3);

        // PEDIR código de asignatura
        System.out.println("Ingrese el código de la asignatura para ver inscriptos:");
        Integer codigoElegido = scanner.nextInt();

        // Mostrar datos del profesor
        System.out.println("===== Datos del Profesor =====");
        profe.mostrarDatos();

        // Contar cuántos estudiantes están inscriptos en esa asignatura
        int contador = 0;
        for (Estudiante est : estudiantes) {
            if (est.formulario != null) {
                for (Inscripcion insc : est.formulario.values()) {
                    if (insc.getEn() != null && insc.getEn().getCodigo().equals(codigoElegido)) {
                        contador++;
                    }
                }
            }
        }

        System.out.println("Cantidad de alumnos inscriptos en la asignatura código " + codigoElegido + ": " + contador);
    }
}
=======
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creamos el profesor
        Profesor profe = new Profesor("Juan González", 123);

        // Creamos asignaturas y las agregamos al curso del profesor
        Asignatura matematica = new Asignatura(101, profe);
        Asignatura fisica = new Asignatura(102, profe);
        profe.curso.add(matematica);
        profe.curso.add(fisica);

        // Creamos estudiantes y los inscribimos
        Estudiante e1 = new Estudiante("Lucas", 1, new HashMap<>());
        Estudiante e2 = new Estudiante("Martina", 2, new HashMap<>());
        Estudiante e3 = new Estudiante("Tomás", 3, new HashMap<>());

        Inscripcion ins1 = new Inscripcion(new Date(), e1, matematica);
        Inscripcion ins2 = new Inscripcion(new Date(), e2, matematica);
        Inscripcion ins3 = new Inscripcion(new Date(), e3, fisica);

        // Agregamos las inscripciones a los formularios de los estudiantes
        e1.formulario.put("101", ins1);
        e2.formulario.put("101", ins2);
        e3.formulario.put("102", ins3);

        // Lista de estudiantes
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(e1);
        estudiantes.add(e2);
        estudiantes.add(e3);

        // PEDIR código de asignatura
        System.out.println("Ingrese el código de la asignatura para ver inscriptos:");
        Integer codigoElegido = scanner.nextInt();

        // Mostrar datos del profesor
        System.out.println("===== Datos del Profesor =====");
        profe.mostrarDatos();

        // Contar cuántos estudiantes están inscriptos en esa asignatura
        int contador = 0;
        for (Estudiante est : estudiantes) {
            if (est.formulario != null) {
                for (Inscripcion insc : est.formulario.values()) {
                    if (insc.getEn() != null && insc.getEn().getCodigo().equals(codigoElegido)) {
                        contador++;
                    }
                }
            }
        }

        System.out.println("Cantidad de alumnos inscriptos en la asignatura código " + codigoElegido + ": " + contador);
    }
}
>>>>>>> 282639c696d7bd377e9aec96ee6f3ed75d109494
