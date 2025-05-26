

public class Main {
    public static void main(String[] args) {
        // Upcasting implícito (Auto -> Vehiculo)
        Vehiculo v = new Auto("Toyota", true);
        v.acelerar();  // Usa el método heredado

        // v.abrirSunroof(); // Error: Vehiculo no tiene este método

        // Downcasting seguro (requiere verificación)
        if (v instanceof Auto) {
            Auto a = (Auto) v;
            a.abrirSunroof(); // Ahora sí funciona
        }
    }
}