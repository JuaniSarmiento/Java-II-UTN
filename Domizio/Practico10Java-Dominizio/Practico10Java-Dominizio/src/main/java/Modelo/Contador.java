<<<<<<< HEAD
package Modelo;

public class Contador {
    private int segundo;
    private int minuto;
    private int hora;

    public Contador() {}

    public Contador(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getSegundo() {
        return segundo;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getHora() {
        return hora;
    }
}
=======
package Modelo;

public class Contador {
    private int segundo;
    private int minuto;
    private int hora;
    public Contador() {}
    public Contador(int segundo, int minuto, int hora) {
        this.segundo = segundo;
        this.minuto = minuto;
        this.hora = hora;
    }

    public int getSegundo() {
        return segundo;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getHora() {
        return hora;
    }

}
>>>>>>> 282639c696d7bd377e9aec96ee6f3ed75d109494
