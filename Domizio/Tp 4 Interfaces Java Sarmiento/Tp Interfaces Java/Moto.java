<<<<<<< HEAD
public class Moto extends VehiculoTerrestre {
    public String marca;

    public Moto(char tipoCombustible, float cantCombustible, int cantRuedas, String marca) {
        super(tipoCombustible, cantCombustible, cantRuedas);
        this.marca = marca;
    }

    public float VelocMaxima() {
        return 180;
    }

    public void mostrarAtributos() {
        System.out.println("La marca es :");
        super.mostrarAtributos();
    }

    @Override
    public float capacidad_max_de_carga() {
        return 100;
    }
}
=======
public class Moto extends VehiculoTerrestre {
    public String marca;

    public Moto(char tipoCombustible, float cantCombustible, int cantRuedas, String marca) {
        super(tipoCombustible, cantCombustible, cantRuedas);
        this.marca = marca;
    }

    public float VelocMaxima() {
        return 180;
    }

    public void mostrarAtributos() {
        System.out.println("La marca es :");
        super.mostrarAtributos();
    }

    @Override
    public float capacidad_max_de_carga() {
        return 100;
    }
}
>>>>>>> 282639c696d7bd377e9aec96ee6f3ed75d109494
