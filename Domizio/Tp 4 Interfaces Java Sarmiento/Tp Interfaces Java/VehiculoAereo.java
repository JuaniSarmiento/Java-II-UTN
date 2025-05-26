<<<<<<< HEAD
public abstract class VehiculoAereo extends Vehiculo {

    public float alturaVuelo;

    public VehiculoAereo(char tipoCombustible , float cantCombustible,float alturaVuelo) {
        super(cantCombustible, tipoCombustible);
        this.alturaVuelo = alturaVuelo;
    }


    public void mostrarAtributos() {
        System.out.println("Altura de vuelo: " + alturaVuelo + " metros");
        super.mostrarAtributos();
    }

}
=======
public abstract class VehiculoAereo extends Vehiculo {

    public float alturaVuelo;

    public VehiculoAereo(char tipoCombustible , float cantCombustible,float alturaVuelo) {
        super(cantCombustible, tipoCombustible);
        this.alturaVuelo = alturaVuelo;
    }


    public void mostrarAtributos() {
        System.out.println("Altura de vuelo: " + alturaVuelo + " metros");
        super.mostrarAtributos();
    }

}
>>>>>>> 282639c696d7bd377e9aec96ee6f3ed75d109494
