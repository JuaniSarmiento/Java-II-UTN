package Ejercicio4;

import java.util.List;

public class AlmacenSuper<T> {
    private List<T> elementos;

    public AlmacenSuper(List<T> elementos) {
        this.elementos = elementos;
    }

    public void agregarElemento(T elem) {
        elementos.add(elem);
    }

    public void imprimirElementos(List<? super T> lista) {
        for (Object o : lista) {
            System.out.println(o);
        }
    }
}
