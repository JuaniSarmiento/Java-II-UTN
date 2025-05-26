<<<<<<< HEAD
public abstract class Vehiculo implements Potencia {
    public char tipoCombustible;
    public float cantCombustible;

    public Vehiculo(float cantCombustible, char tipoCombustible) {
        this.cantCombustible = cantCombustible;
        this.tipoCombustible = tipoCombustible;
    }

    public abstract float VelocMaxima();

    public void mostrarAtributos(){
        System.out.println("Tipo de combustible: " + tipoCombustible);
        System.out.println("Cantidad de combustible: " + cantCombustible);
    }
    public void desdePotencia(int posicion, int cantidad ){
        String[] tipoCombustible1 = Vehiculo.tipo_combustible;

        if (posicion >= 0 && posicion < tipoCombustible1.length) {
            System.out.println("Combustible: " + tipoCombustible1[posicion]);
            System.out.println("Cantidad requerida: " + cantidad + " litros");
        } else {
            System.out.println("Posición inválida. Debe ser entre 0 y " + (tipoCombustible1.length - 1));
        }
    }

    public void mostrarPotencia() {

    }
}

=======
public abstract class Vehiculo implements Potencia {
    public char tipoCombustible;
    public float cantCombustible;

    public Vehiculo(float cantCombustible, char tipoCombustible) {
        this.cantCombustible = cantCombustible;
        this.tipoCombustible = tipoCombustible;
    }

    public abstract float VelocMaxima();

    public void mostrarAtributos(){
        System.out.println("Tipo de combustible: " + tipoCombustible);
        System.out.println("Cantidad de combustible: " + cantCombustible);
    }
    public void desdePotencia(int posicion, int cantidad ){
        String[] tipoCombustible1 = Vehiculo.tipo_combustible;

        if (posicion >= 0 && posicion < tipoCombustible1.length) {
            System.out.println("Combustible: " + tipoCombustible1[posicion]);
            System.out.println("Cantidad requerida: " + cantidad + " litros");
        } else {
            System.out.println("Posición inválida. Debe ser entre 0 y " + (tipoCombustible1.length - 1));
        }
    }

    public void mostrarPotencia() {

    }
}

>>>>>>> 282639c696d7bd377e9aec96ee6f3ed75d109494
