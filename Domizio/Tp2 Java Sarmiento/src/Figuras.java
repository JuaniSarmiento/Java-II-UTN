import java.util.Scanner;
public class Figuras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangulo[] Rectangulo = new Rectangulo[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese la base del rectángulo " + (i + 1) + ": ");
            float base = scanner.nextFloat();
            System.out.println("Ingrese la altura del rectángulo " + (i + 1) + ": ");
            float altura = scanner.nextFloat();
            System.out.println("Ingrese el color del rectangulo " + (i + 1) + ": ");
            String color = scanner.next();

            Rectangulo[i] = new Rectangulo(base, altura, color);
        }
        System.out.println("\nDatos de los rectángulos:");
        for (Rectangulo rect : Rectangulo) {
            rect.mostrarTodos();
        }

    }
}