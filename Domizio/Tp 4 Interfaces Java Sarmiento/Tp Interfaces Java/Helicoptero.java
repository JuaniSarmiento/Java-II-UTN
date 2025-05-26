<<<<<<< HEAD
public class Helicoptero extends VehiculoAereo {
    public int cantidadHelices;

    public Helicoptero(char tipoCombustible, float cantCombustible, float alturaVuelo, int cantidadHelices) {
        super(tipoCombustible,cantCombustible,alturaVuelo);
        this.cantidadHelices=cantidadHelices;
    }

    public float VelocMaxima() {
        return 250;
    }


    public float alturaVuelo() {
        return 3000;
    }

    public void mostrarAtributos() {
        System.out.println("Cantidad de helices");
        super.mostrarAtributos();
    }

    @Override
    public float capacidad_max_de_carga() {
        return 500;
    }
=======
public class Helicoptero extends VehiculoAereo {
    public int cantidadHelices;

    public Helicoptero(char tipoCombustible, float cantCombustible, float alturaVuelo, int cantidadHelices) {
        super(tipoCombustible,cantCombustible,alturaVuelo);
        this.cantidadHelices=cantidadHelices;
    }

    public float VelocMaxima() {
        return 250;
    }


    public float alturaVuelo() {
        return 3000;
    }

    public void mostrarAtributos() {
        System.out.println("Cantidad de helices");
        super.mostrarAtributos();
    }

    @Override
    public float capacidad_max_de_carga() {
        return 500;
    }
>>>>>>> 282639c696d7bd377e9aec96ee6f3ed75d109494
}