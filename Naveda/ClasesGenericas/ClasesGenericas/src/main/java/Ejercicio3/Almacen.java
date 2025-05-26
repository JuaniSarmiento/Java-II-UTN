package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Almacen<T extends Producto> {
    private List<T> productos = new ArrayList<>();

    public void agregarProducto(T producto) {
        productos.add(producto);
    }

    public void imprimirProductos(List<? extends Producto> lista) {
        for (Producto p : lista) {
            System.out.println(p);
        }
    }

    public List<T> getProductos() {
        return productos;
    }
}

