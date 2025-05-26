<<<<<<< HEAD
package controlador;

import modelo.Autor;
import modelo.Persona;

public class PersonaControlador {

    public static void guardarPersona(int dni, String nombre, boolean esAutor, String pseudonimo) {
        if (esAutor) {
            Autor autor = new Autor(dni, nombre, pseudonimo);
            BDControlador.guardarPersona(autor);
        } else {
            Persona persona = new Persona(dni, nombre);
            BDControlador.guardarPersona(persona);
        }
    }
}

=======
package controlador;

import modelo.Autor;
import modelo.Persona;

public class PersonaControlador {

    public static void guardarPersona(int dni, String nombre, boolean esAutor, String pseudonimo) {
        if (esAutor) {
            Autor autor = new Autor(dni, nombre, pseudonimo);
            BDControlador.guardarPersona(autor);
        } else {
            Persona persona = new Persona(dni, nombre);
            BDControlador.guardarPersona(persona);
        }
    }
}

>>>>>>> 282639c696d7bd377e9aec96ee6f3ed75d109494
