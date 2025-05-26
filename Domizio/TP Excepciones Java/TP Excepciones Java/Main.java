<<<<<<< HEAD
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int contador = 0;

        while (contador < 3) {
            System.out.print("Ingrese un número entero negativo (" + (contador + 1) + "/3): ");
            int numero = scanner.nextInt();

            try {
                verificarNegativo(numero);
                suma += numero;
                contador++;
            } catch (NoPositivosException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Suma de los 3 números negativos: " + suma);
    }


    public static void verificarNegativo(int numero) throws NoPositivosException {
        if (numero >= 0) {
            throw new NoPositivosException("Se esperaba un número NEGATIVO, pero se ingresó: " + numero);
        }
    }
}
=======
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int contador = 0;

        while (contador < 3) {
            System.out.print("Ingrese un número entero negativo (" + (contador + 1) + "/3): ");
            int numero = scanner.nextInt();

            try {
                verificarNegativo(numero);
                suma += numero;
                contador++;
            } catch (NoPositivosException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Suma de los 3 números negativos: " + suma);
    }


    public static void verificarNegativo(int numero) throws NoPositivosException {
        if (numero >= 0) {
            throw new NoPositivosException("Se esperaba un número NEGATIVO, pero se ingresó: " + numero);
        }
    }
}
>>>>>>> 282639c696d7bd377e9aec96ee6f3ed75d109494
