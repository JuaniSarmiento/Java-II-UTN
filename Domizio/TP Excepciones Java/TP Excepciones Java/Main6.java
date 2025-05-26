<<<<<<< HEAD
public class Main6 {
    public static void main(String[] args) {
        int f = 0;
        for (int i = -5; i < 5; i++) {
            try {
                f /= i;
                System.out.println("f: " + f);
            } catch (ArithmeticException e) {
                System.out.println("Error: división por cero en i = " + i);
            }
        }
        System.out.println("Programa terminado correctamente.");
    }
}


=======
public class Main6 {
    public static void main(String[] args) {
        int f = 0;
        for (int i = -5; i < 5; i++) {
            try {
                f /= i;
                System.out.println("f: " + f);
            } catch (ArithmeticException e) {
                System.out.println("Error: división por cero en i = " + i);
            }
        }
        System.out.println("Programa terminado correctamente.");
    }
}


>>>>>>> 282639c696d7bd377e9aec96ee6f3ed75d109494
