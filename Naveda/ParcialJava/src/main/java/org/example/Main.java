package org.example;

import DaoImpl.AlumnoDAOImpl;
import DaoImpl.CursoDAOImpl;
import Modelo.Alumno;
import Modelo.Curso;
import Utils.DatabaseUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Punto de entrada del sistema de gestión académica con menú interactivo CRUD.
 */
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        try (Connection conn = DatabaseUtil.getConnection();
             Scanner scanner = new Scanner(System.in)) {

            AlumnoDAOImpl alumnoDAO = new AlumnoDAOImpl(conn);
            CursoDAOImpl cursoDAO = new CursoDAOImpl(conn);

            logger.info("Aplicación iniciada correctamente.");

            boolean salir = false;

            while (!salir) {
                System.out.println("""
                        \n=== MENU PRINCIPAL ===
                        1. Crear curso
                        2. Crear alumno
                        3. Listar cursos
                        4. Listar alumnos
                        5. Buscar alumno por ID
                        6. Actualizar alumno
                        7. Eliminar alumno
                        8. Buscar alumnos por curso
                        0. Salir
                        """);
                System.out.print("Elegí una opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine(); // limpiar buffer

                switch (opcion) {
                    case 1 -> {
                        System.out.print("¿Cuántos cursos querés crear? ");
                        int n = scanner.nextInt();
                        scanner.nextLine();
                        for (int i = 0; i < n; i++) {
                            Curso curso = crearCursoDesdeConsola(scanner);
                            cursoDAO.guardar(curso);
                        }
                    }
                    case 2 -> {
                        List<Curso> cursos = cursoDAO.listarTodos();
                        if (cursos.isEmpty()) {
                            System.out.println("Primero tenés que crear cursos.");
                        } else {
                            System.out.print("¿Cuántos alumnos querés crear? ");
                            int m = scanner.nextInt();
                            scanner.nextLine();
                            for (int i = 0; i < m; i++) {
                                Alumno alumno = crearAlumnoDesdeConsola(scanner, cursos);
                                alumnoDAO.guardar(alumno);
                            }
                        }
                    }
                    case 3 -> cursoDAO.listarTodos().forEach(System.out::println);
                    case 4 -> alumnoDAO.listarTodos().forEach(System.out::println);
                    case 5 -> {
                        System.out.print("ID del alumno: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        Alumno a = alumnoDAO.buscarPorId(id);
                        System.out.println(a != null ? a : "No existe un alumno con ese ID.");
                    }
                    case 6 -> {
                        System.out.print("ID del alumno a actualizar: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        Alumno a = alumnoDAO.buscarPorId(id);
                        if (a != null) {
                            System.out.print("Nuevo nombre: ");
                            a.setNombre(scanner.nextLine());
                            System.out.print("Nuevo apellido: ");
                            a.setApellido(scanner.nextLine());
                            System.out.print("Nuevo promedio: ");
                            a.setPromedio(scanner.nextDouble());
                            scanner.nextLine();
                            alumnoDAO.actualizar(a);
                            System.out.println("Alumno actualizado.");
                        } else {
                            System.out.println("No existe ese alumno.");
                        }
                    }
                    case 7 -> {
                        System.out.print("ID del alumno a eliminar: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        alumnoDAO.eliminar(id);
                        System.out.println("Alumno eliminado.");
                    }
                    case 8 -> {
                        List<Curso> cursos = cursoDAO.listarTodos();
                        if (cursos.isEmpty()) {
                            System.out.println("No hay cursos cargados.");
                            break;
                        }
                        for (int i = 0; i < cursos.size(); i++) {
                            System.out.println((i + 1) + ". " + cursos.get(i).getMateria());
                        }
                        System.out.print("Elegí un curso: ");
                        int i = scanner.nextInt() - 1;
                        scanner.nextLine();
                        int cursoId = cursos.get(i).getId();
                        List<Alumno> alumnos = alumnoDAO.buscarPorCurso(cursoId);
                        if (alumnos.isEmpty()) {
                            System.out.println("No hay alumnos en ese curso.");
                        } else {
                            alumnos.forEach(System.out::println);
                        }
                    }
                    case 0 -> {
                        salir = true;
                        System.out.println("¡Chau! 👋");
                    }
                    default -> System.out.println("Opción inválida.");
                }
            }

        } catch (SQLException e) {
            logger.error("Error de base de datos", e);
        } catch (InputMismatchException e) {
            logger.error("Entrada inválida", e);
        } catch (Exception e) {
            logger.fatal("Error inesperado", e);
        } finally {
            DatabaseUtil.cerrarPool();
            logger.info("Conexiones cerradas. Aplicación finalizada.");
        }
    }

    private static Curso crearCursoDesdeConsola(Scanner scanner) {
        System.out.print("Nombre del curso: ");
        String materia = scanner.nextLine();
        return new Curso(0, materia, null);
    }

    private static Alumno crearAlumnoDesdeConsola(Scanner scanner, List<Curso> cursos) {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();

        System.out.println("Seleccione el curso:");
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println((i + 1) + ". " + cursos.get(i).getMateria());
        }
        int opcionCurso = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Promedio: ");
        double promedio = scanner.nextDouble();
        scanner.nextLine();

        int cursoId = cursos.get(opcionCurso - 1).getId();
        return new Alumno(0, nombre, apellido, cursoId, promedio);
    }
}
