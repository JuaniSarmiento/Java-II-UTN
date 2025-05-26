

public class Gerente extends Empleado {
    int nivelAcceso;

    @Override
    public void trabajar() {
        System.out.println("Gestionando equipo y recursos");
    }

    public void aprobarPresupuesto() {
        System.out.println("Presupuesto aprobado (solo gerentes)");
    }
}