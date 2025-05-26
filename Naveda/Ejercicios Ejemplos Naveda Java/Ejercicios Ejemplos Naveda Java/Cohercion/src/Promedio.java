
public class Promedio {

    // Coerción implícita: int -> double al dividir
    public double calcularPromedio(int sumaTotal, int cantidad) {
        return (double) sumaTotal / cantidad; // ¡Aquí ocurre la coerción!
    }
}