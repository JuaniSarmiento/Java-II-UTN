<<<<<<< HEAD

import java.io.*;


// Clase Registro (objeto que se guarda)
class Registro implements Serializable {
    private String texto;
    private String opcion;

    public Registro(String texto, String opcion) {
        this.texto = texto;
        this.opcion = opcion;
    }

    public String toString() {
        return "Texto ingresado: " + texto + " | Opción elegida: " + opcion;
    }
}

=======

import java.io.*;


// Clase Registro (objeto que se guarda)
class Registro implements Serializable {
    private String texto;
    private String opcion;

    public Registro(String texto, String opcion) {
        this.texto = texto;
        this.opcion = opcion;
    }

    public String toString() {
        return "Texto ingresado: " + texto + " | Opción elegida: " + opcion;
    }
}

>>>>>>> 282639c696d7bd377e9aec96ee6f3ed75d109494
