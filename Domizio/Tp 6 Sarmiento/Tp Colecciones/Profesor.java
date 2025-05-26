<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {
    public ArrayList<Asignatura> curso;

    public Profesor() {
    }

    public Profesor(String nombre, Integer legajo) {
        super(nombre, legajo);
        curso= new ArrayList<>();
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Legajo: "+legajo);
        System.out.println("Asignaturas: ");
        for (Asignatura asignatura : curso) {
            System.out.println(asignatura.getCodigo());
            }
        }
    }



=======
import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {
    public ArrayList<Asignatura> curso;

    public Profesor() {
    }

    public Profesor(String nombre, Integer legajo) {
        super(nombre, legajo);
        curso= new ArrayList<>();
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Legajo: "+legajo);
        System.out.println("Asignaturas: ");
        for (Asignatura asignatura : curso) {
            System.out.println(asignatura.getCodigo());
            }
        }
    }



>>>>>>> 282639c696d7bd377e9aec96ee6f3ed75d109494
