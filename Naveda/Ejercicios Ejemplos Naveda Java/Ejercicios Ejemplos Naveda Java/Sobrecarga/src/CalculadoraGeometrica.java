
public class CalculadoraGeometrica {

    // 1. Calcular área de un cuadrado (1 parámetro)
    public double calcularArea(double lado) {
        System.out.println("Calculando área de cuadrado (lado " + lado + ")");
        return lado * lado;
    }

    // 2. Sobrecarga: área de rectángulo (2 parámetros)
    public double calcularArea(double largo, double ancho) {
        System.out.println("Calculando área de rectángulo (" + largo + "x" + ancho + ")");
        return largo * ancho;
    }

    // 3. Sobrecarga: área de círculo (parámetro tipo diferente)
    public double calcularArea(double radio, boolean esCirculo) {
        if (esCirculo) {
            System.out.println("Calculando área de círculo (radio " + radio + ")");
            return Math.PI * radio * radio;
        }
        return 0;
    }

    // 4. Sobrecarga: perímetro (mismo tipo de parámetro, distinto propósito)
    public double calcularPerimetro(double lado) {
        System.out.println("Calculando perímetro de cuadrado (lado " + lado + ")");
        return 4 * lado;
    }
}