

public class Main {
    public static void main(String[] args) {
        CalculadoraGeometrica calc = new CalculadoraGeometrica();

        // Área de cuadrado
        double areaCuadrado = calc.calcularArea(5.0);
        System.out.println("Área del cuadrado: " + areaCuadrado + "\n");

        // Área de rectángulo
        double areaRectangulo = calc.calcularArea(4.0, 6.0);
        System.out.println("Área del rectángulo: " + areaRectangulo + "\n");

        // Área de círculo
        double areaCirculo = calc.calcularArea(3.0, true);
        System.out.println("Área del círculo: " + areaCirculo + "\n");

        // Perímetro de cuadrado (sobrecarga con mismo tipo de parámetro)
        double perimetro = calc.calcularPerimetro(5.0);
        System.out.println("Perímetro del cuadrado: " + perimetro);
    }
}