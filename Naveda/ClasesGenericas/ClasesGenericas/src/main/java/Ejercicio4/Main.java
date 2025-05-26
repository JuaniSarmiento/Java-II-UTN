package Ejercicio4;

import Ejercicio3.Alimento;
import Ejercicio3.Producto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> elementos = new ArrayList<>();
        AlmacenSuper<Object> almacen = new AlmacenSuper<>(elementos);

        almacen.agregarElemento(new Producto("Silla", 30.0));
        almacen.agregarElemento(new Alimento("Queso", 5.5));

        System.out.println("Elementos del almacén:");
        almacen.imprimirElementos(elementos);
    }
}
