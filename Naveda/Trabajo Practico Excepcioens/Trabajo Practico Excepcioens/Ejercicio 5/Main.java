public class Main {
    public static void main(String[] args) {
        try {
            metodoQuePuedeFallar();
        } catch (Exception e) {
            System.out.println("Excepción capturada: " + e.getClass().getName());
        }
    }

    public static void metodoQuePuedeFallar() throws Exception {
        try {
            // Bloque que puede lanzar varias excepciones
            String str = null;
            System.out.println(str.length()); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Capturada NullPointerException");
            throw new IllegalArgumentException("Error de argumento", e);
        } catch (IllegalArgumentException e) {
            System.out.println("Capturada IllegalArgumentException");
            throw new ArithmeticException("Error aritmético");
        } catch (ArithmeticException e) {
            System.out.println("Capturada ArithmeticException");
            throw new Exception("Error general", e);
        }
    }

}
