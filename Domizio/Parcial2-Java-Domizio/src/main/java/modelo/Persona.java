<<<<<<< HEAD
package modelo;

import java.io.Serializable;

public class Persona implements Serializable {
    protected int dni;
    protected String nombre;

    public Persona(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public int getDni() { return dni; }
    public String getNombre() { return nombre; }
}
=======
package modelo;

import java.io.Serializable;

public class Persona implements Serializable {
    protected int dni;
    protected String nombre;

    public Persona(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public int getDni() { return dni; }
    public String getNombre() { return nombre; }
}
>>>>>>> 282639c696d7bd377e9aec96ee6f3ed75d109494
