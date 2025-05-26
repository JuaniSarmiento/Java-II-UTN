
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
