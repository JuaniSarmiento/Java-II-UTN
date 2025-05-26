
import java.util.ArrayList;

public class Inventario<T> {
    private ArrayList<T> elementos;

    public Inventario() {
        this.elementos = new ArrayList<>();
    }

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public void listar() {
        System.out.println("--- Inventario ---");
        for (T elemento : elementos) {
            System.out.println(elemento.toString());
        }
    }
}