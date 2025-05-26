<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {
        // Empresa y Trabajador
        Empresa empresa = new Empresa("UTN");

        Trabajador trabajador1 = new Trabajador("Pedro", "40123456", empresa);
        Trabajador trabajador2 = new Trabajador("Alberto", "40987654", empresa);
        Trabajador trabajador3 = null;

        // Agrego los empleados a la empresa
        Trabajador[] empleados = {trabajador1, trabajador2, trabajador3}; 
        empresa.setEmpleados(empleados);

        // Mostrar razón social desde trabajador
        System.out.println("Razón social: " + trabajador1.getEmpresa().getRazonSocial());

        // Viajero y Equipaje
        Equipaje e1 = new Equipaje(12.5);
        Equipaje e2 = new Equipaje(7.3);
        Equipaje[] equipajes = {e1, e2};
        Viajero viajero = new Viajero("Carlos", equipajes);

        // Mostrar peso de los equipajes
        System.out.println("Pesos de los equipajes:");
        for (Equipaje e : viajero.getEquipajes()) {
            System.out.println(e.getPeso() + " kg");
        }

        // Chofer y Taxis
        Taxi t1 = new Taxi("ABC123");
        Taxi t2 = new Taxi("DEF456");
        Taxi t3 = new Taxi("GHI789");
        Taxi[] taxis = {t1, t2, t3};
        Chofer chofer = new Chofer("Martín", taxis);

        // Mostrar matrículas
        System.out.println("Matrículas de los taxis:");
        for (Taxi t : chofer.getTaxis()) {
            System.out.println(t.getMatricula());
        }

        // Desde Empresa mostrar DNIs de empleados no nulos
        System.out.println("DNI de empleados de la empresa:");
        empresa.mostrarDniEmpleados();
    }
}

=======
public class Main {
    public static void main(String[] args) {
        // Empresa y Trabajador
        Empresa empresa = new Empresa("UTN");

        Trabajador trabajador1 = new Trabajador("Pedro", "40123456", empresa);
        Trabajador trabajador2 = new Trabajador("Alberto", "40987654", empresa);
        Trabajador trabajador3 = null;

        // Agrego los empleados a la empresa
        Trabajador[] empleados = {trabajador1, trabajador2, trabajador3}; 
        empresa.setEmpleados(empleados);

        // Mostrar razón social desde trabajador
        System.out.println("Razón social: " + trabajador1.getEmpresa().getRazonSocial());

        // Viajero y Equipaje
        Equipaje e1 = new Equipaje(12.5);
        Equipaje e2 = new Equipaje(7.3);
        Equipaje[] equipajes = {e1, e2};
        Viajero viajero = new Viajero("Carlos", equipajes);

        // Mostrar peso de los equipajes
        System.out.println("Pesos de los equipajes:");
        for (Equipaje e : viajero.getEquipajes()) {
            System.out.println(e.getPeso() + " kg");
        }

        // Chofer y Taxis
        Taxi t1 = new Taxi("ABC123");
        Taxi t2 = new Taxi("DEF456");
        Taxi t3 = new Taxi("GHI789");
        Taxi[] taxis = {t1, t2, t3};
        Chofer chofer = new Chofer("Martín", taxis);

        // Mostrar matrículas
        System.out.println("Matrículas de los taxis:");
        for (Taxi t : chofer.getTaxis()) {
            System.out.println(t.getMatricula());
        }

        // Desde Empresa mostrar DNIs de empleados no nulos
        System.out.println("DNI de empleados de la empresa:");
        empresa.mostrarDniEmpleados();
    }
}

>>>>>>> 282639c696d7bd377e9aec96ee6f3ed75d109494
