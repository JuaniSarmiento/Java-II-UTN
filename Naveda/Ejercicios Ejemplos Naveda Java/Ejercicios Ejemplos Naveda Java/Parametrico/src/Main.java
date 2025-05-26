

public class Main {
    public static void main(String[] args) {
        // Inventario para productos
        Inventario<Producto> inventarioProductos = new Inventario<>();
        inventarioProductos.agregar(new Producto("Laptop", 999.99));
        inventarioProductos.agregar(new Producto("Teléfono", 699.99));

        // Inventario para números (demostración versatilidad)
        Inventario<Integer> inventarioNumeros = new Inventario<>();
        inventarioNumeros.agregar(100);
        inventarioNumeros.agregar(200);

        // Mostrar contenidos
        inventarioProductos.listar();
        inventarioNumeros.listar();
    }
}