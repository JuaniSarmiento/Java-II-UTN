package Ejercicio3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Almacen<Producto> almacen = new Almacen<>();
        almacen.agregarProducto(new Alimento("Pan", 1.5));
        almacen.agregarProducto(new Electronico("Auriculares", 25.0));

        System.out.println("Productos almacenados:");
        almacen.imprimirProductos(almacen.getProductos());
    }
}

