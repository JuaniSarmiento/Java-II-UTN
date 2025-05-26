

public class Auto extends Vehiculo {
    private boolean tieneSunroof;

    public Auto(String marca, boolean tieneSunroof) {
        super(marca);
        this.tieneSunroof = tieneSunroof;
    }

    public void abrirSunroof() {
        if (tieneSunroof) {
            System.out.println("Abriendo sunroof");
        }
    }
}