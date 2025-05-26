import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExcepcion {
    public static void main(String[] args) {
        try {
            // Intentar leer un archivo que no existe
            FileReader file = new FileReader("archivo_inexistente.txt");
            BufferedReader reader = new BufferedReader(file);
            String line = reader.readLine();
            System.out.println(line);
            reader.close();
        } catch (IOException e) {
            System.out.println("Ocurrió un error de E/S: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
