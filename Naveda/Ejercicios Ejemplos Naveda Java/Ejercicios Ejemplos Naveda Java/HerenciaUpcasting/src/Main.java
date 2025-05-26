
public class Main {
    public static void main(String[] args) {
        // Upcasting implícito (convertir Circulo a Forma)
        Forma forma1 = new Circulo();

        // Upcasting explícito (opcional, el compilador lo hace automáticamente)
        Forma forma2 = (Forma) new Circulo();

        forma1.dibujar();  // Llama al método sobreescrito
        forma2.dibujar();  // Output: "Dibujando un círculo perfecto"

        // forma1.calcularArea(); // Error: Forma no tiene este método
    }
}