

public class Main {
    public static void main(String[] args) {

        Empleado empleado = new Gerente();
        empleado.nombre = "Carlos";
        empleado.trabajar(); // Llama al método sobreescrito


        if (empleado instanceof Gerente) {
            Gerente gerente = (Gerente) empleado;
            gerente.nivelAcceso = 3;
            gerente.aprobarPresupuesto(); // Método exclusivo de Gerente

            System.out.println("Nombre: " + gerente.nombre);
            System.out.println("Nivel de acceso: " + gerente.nivelAcceso);
        }
    }
}