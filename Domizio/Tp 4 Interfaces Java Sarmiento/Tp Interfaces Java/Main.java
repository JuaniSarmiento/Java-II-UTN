<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche('N', 50.0f, 4, 5);
        Moto miMoto = new Moto('G', 15.0f, 2, "Ducati");
        Avion miAvion = new Avion('J', 5000.0f, 12000.0f, 2);
        Helicoptero miHelicoptero = new Helicoptero('Q', 800.0f, 3000.0f, 4);

        // Mostrar atributos
        System.out.println("COCHE:");
        miCoche.mostrarAtributos();
        miCoche.desdePotencia(2,5);
        System.out.println("\nMOTO:");
        miMoto.mostrarAtributos();
        miMoto.desdePotencia(1,2);
        System.out.println("\nAVIÓN:");
        miAvion.mostrarAtributos();
        miAvion.desdePotencia(5,6);
        System.out.println("\nHELICÓPTERO:");
        miHelicoptero.mostrarAtributos();
        miHelicoptero.desdePotencia(4,2);


        // Mostrar velocidad máxima
        System.out.println("\n--- VELOCIDADES MÁXIMAS ---");
        System.out.println("Coche: " + miCoche.VelocMaxima() + " km/h");
        System.out.println("Moto: " + miMoto.VelocMaxima() + " km/h");
        System.out.println("Avión: " + miAvion.VelocMaxima() + " km/h");
        System.out.println("Helicóptero: " + miHelicoptero.VelocMaxima() + " km/h");

        // Mostrar capacidad máxima de carga
        System.out.println("\n--- CAPACIDADES MÁXIMAS DE CARGA ---");
        System.out.println("Coche: " + miCoche.capacidad_max_de_carga() + " kg");
        System.out.println("Moto: " + miMoto.capacidad_max_de_carga() + " kg");
        System.out.println("Avión: " + miAvion.capacidad_max_de_carga() + " kg");
        System.out.println("Helicóptero: " + miHelicoptero.capacidad_max_de_carga() + " kg");
            }
        }









=======
public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche('N', 50.0f, 4, 5);
        Moto miMoto = new Moto('G', 15.0f, 2, "Ducati");
        Avion miAvion = new Avion('J', 5000.0f, 12000.0f, 2);
        Helicoptero miHelicoptero = new Helicoptero('Q', 800.0f, 3000.0f, 4);

        // Mostrar atributos
        System.out.println("COCHE:");
        miCoche.mostrarAtributos();
        miCoche.desdePotencia(2,5);
        System.out.println("\nMOTO:");
        miMoto.mostrarAtributos();
        miMoto.desdePotencia(1,2);
        System.out.println("\nAVIÓN:");
        miAvion.mostrarAtributos();
        miAvion.desdePotencia(5,6);
        System.out.println("\nHELICÓPTERO:");
        miHelicoptero.mostrarAtributos();
        miHelicoptero.desdePotencia(4,2);


        // Mostrar velocidad máxima
        System.out.println("\n--- VELOCIDADES MÁXIMAS ---");
        System.out.println("Coche: " + miCoche.VelocMaxima() + " km/h");
        System.out.println("Moto: " + miMoto.VelocMaxima() + " km/h");
        System.out.println("Avión: " + miAvion.VelocMaxima() + " km/h");
        System.out.println("Helicóptero: " + miHelicoptero.VelocMaxima() + " km/h");

        // Mostrar capacidad máxima de carga
        System.out.println("\n--- CAPACIDADES MÁXIMAS DE CARGA ---");
        System.out.println("Coche: " + miCoche.capacidad_max_de_carga() + " kg");
        System.out.println("Moto: " + miMoto.capacidad_max_de_carga() + " kg");
        System.out.println("Avión: " + miAvion.capacidad_max_de_carga() + " kg");
        System.out.println("Helicóptero: " + miHelicoptero.capacidad_max_de_carga() + " kg");
            }
        }









>>>>>>> 282639c696d7bd377e9aec96ee6f3ed75d109494
