<<<<<<< HEAD

public abstract class VehiculoTerrestre extends Vehiculo {
    public int cantRuedas;

    public VehiculoTerrestre(char tipoCombustible,float cantCombustible,int cantRuedas) {
        super(cantCombustible,tipoCombustible);
        this.cantRuedas = cantRuedas;
    }

    public void mostrarAtributos() {
        System.out.println("Cantidad de ruedas: " + cantRuedas);
        super.mostrarAtributos();
    }
=======

public abstract class VehiculoTerrestre extends Vehiculo {
    public int cantRuedas;

    public VehiculoTerrestre(char tipoCombustible,float cantCombustible,int cantRuedas) {
        super(cantCombustible,tipoCombustible);
        this.cantRuedas = cantRuedas;
    }

    public void mostrarAtributos() {
        System.out.println("Cantidad de ruedas: " + cantRuedas);
        super.mostrarAtributos();
    }
>>>>>>> 282639c696d7bd377e9aec96ee6f3ed75d109494
}