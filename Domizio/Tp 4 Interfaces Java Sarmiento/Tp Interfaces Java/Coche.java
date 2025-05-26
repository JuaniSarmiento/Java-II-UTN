<<<<<<< HEAD
public class Coche extends VehiculoTerrestre {
    public int cantidadPuertas;

    public Coche(char tipoCombustible, float cantCombustible, int cantRuedas, int cantidadPuertas) {
        super(tipoCombustible, cantCombustible, cantRuedas);
        this.cantidadPuertas = cantidadPuertas;
    }


    public float VelocMaxima() {
        return 200;
    }

    public void mostrarAtributos() {
        System.out.println("Cantidad de puertas: " + cantidadPuertas);
        super.mostrarAtributos();
    }

    @Override
    public void mostrarPotencia() {
        super.mostrarPotencia();
    }

    @Override
    public float capacidad_max_de_carga() {
        return 300;
    }
=======
public class Coche extends VehiculoTerrestre {
    public int cantidadPuertas;

    public Coche(char tipoCombustible, float cantCombustible, int cantRuedas, int cantidadPuertas) {
        super(tipoCombustible, cantCombustible, cantRuedas);
        this.cantidadPuertas = cantidadPuertas;
    }


    public float VelocMaxima() {
        return 200;
    }

    public void mostrarAtributos() {
        System.out.println("Cantidad de puertas: " + cantidadPuertas);
        super.mostrarAtributos();
    }

    @Override
    public void mostrarPotencia() {
        super.mostrarPotencia();
    }

    @Override
    public float capacidad_max_de_carga() {
        return 300;
    }
>>>>>>> 282639c696d7bd377e9aec96ee6f3ed75d109494
}