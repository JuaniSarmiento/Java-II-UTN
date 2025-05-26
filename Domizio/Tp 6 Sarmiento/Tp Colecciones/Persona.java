<<<<<<< HEAD
public abstract class Persona {
    protected String nombre;
    public Integer legajo;

    public Persona() {
    }

    public Persona(String nombre, Integer legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Legajo: " + legajo);
    }

=======
public abstract class Persona {
    protected String nombre;
    public Integer legajo;

    public Persona() {
    }

    public Persona(String nombre, Integer legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Legajo: " + legajo);
    }

>>>>>>> 282639c696d7bd377e9aec96ee6f3ed75d109494
}