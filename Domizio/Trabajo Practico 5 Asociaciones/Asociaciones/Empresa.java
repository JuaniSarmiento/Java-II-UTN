<<<<<<< HEAD
public class Empresa {
        private String razonSocial;
        private Trabajador[] empleados;

        public Empresa(String razonSocial) {
            this.razonSocial = razonSocial;
        }

        public String getRazonSocial() {
            return razonSocial;
        }

        public void setEmpleados(Trabajador[] empleados) {
            this.empleados = empleados;
        }

        public void mostrarDniEmpleados() {
            for (Trabajador t : empleados) {
                if (t != null) {
                    System.out.println(t.getDni());
                }
            }
        }
    }


=======
public class Empresa {
        private String razonSocial;
        private Trabajador[] empleados;

        public Empresa(String razonSocial) {
            this.razonSocial = razonSocial;
        }

        public String getRazonSocial() {
            return razonSocial;
        }

        public void setEmpleados(Trabajador[] empleados) {
            this.empleados = empleados;
        }

        public void mostrarDniEmpleados() {
            for (Trabajador t : empleados) {
                if (t != null) {
                    System.out.println(t.getDni());
                }
            }
        }
    }


>>>>>>> 282639c696d7bd377e9aec96ee6f3ed75d109494
