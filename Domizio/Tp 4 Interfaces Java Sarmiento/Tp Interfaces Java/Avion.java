<<<<<<< HEAD
public class Avion extends VehiculoAereo {
    public int cantidadMotores;

    public Avion(char tipoCombustible, float cantCombustible, float alturaVuelo, int cantidadMotores) {
        super(tipoCombustible,cantCombustible,alturaVuelo);
        this.cantidadMotores = cantidadMotores;
    }


    public float VelocMaxima() {
        return 900;
    }


    public float alturaVuelo() {
        return 10000;
    }

    public void mostrarAtributos() {
        System.out.println("Cantidad de motores: " + cantidadMotores);
        super.mostrarAtributos();
    }

    @Override
    public float capacidad_max_de_carga() {
        return 1000;
    }
=======
public class Avion extends VehiculoAereo {
    public int cantidadMotores;

    public Avion(char tipoCombustible, float cantCombustible, float alturaVuelo, int cantidadMotores) {
        super(tipoCombustible,cantCombustible,alturaVuelo);
        this.cantidadMotores = cantidadMotores;
    }


    public float VelocMaxima() {
        return 900;
    }


    public float alturaVuelo() {
        return 10000;
    }

    public void mostrarAtributos() {
        System.out.println("Cantidad de motores: " + cantidadMotores);
        super.mostrarAtributos();
    }

    @Override
    public float capacidad_max_de_carga() {
        return 1000;
    }
>>>>>>> 282639c696d7bd377e9aec96ee6f3ed75d109494
}