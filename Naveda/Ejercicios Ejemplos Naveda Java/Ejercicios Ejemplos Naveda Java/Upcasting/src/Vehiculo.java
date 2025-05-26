

public class Vehiculo {
    private String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public void acelerar() {
        System.out.println(marca + " está acelerando");
    }
}
