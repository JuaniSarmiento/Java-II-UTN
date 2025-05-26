package Ejercicio1;

public class Numero implements Operable<Numero> {
    private double valor;

    public Numero(double valor) {
        this.valor = valor;
    }

    @Override
    public Numero sumar(Numero otro) {
        return new Numero(this.valor + otro.valor);
    }

    @Override
    public Numero restar(Numero otro) {
        return new Numero(this.valor - otro.valor);
    }

    @Override
    public Numero multiplicar(Numero otro) {
        return new Numero(this.valor * otro.valor);
    }

    @Override
    public Numero dividir(Numero otro) {
        return new Numero(this.valor / otro.valor);
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }
}
