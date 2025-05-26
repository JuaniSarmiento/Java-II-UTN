package Cohercion;

public class Main {
    public static void main(String[] args) {
        int puntaje1 = 18;
        int puntaje2 = 20;
        int totalNotas = 2;

        Promedio promedio = new Promedio();
        double resultado = promedio.calcularPromedio(puntaje1 + puntaje2, totalNotas);

        System.out.println("Promedio sin coerción: " + (puntaje1 + puntaje2) / totalNotas); // 19 (incorrecto)
        System.out.println("Promedio con coerción: " + resultado); // 19.0 (correcto)
    }
}