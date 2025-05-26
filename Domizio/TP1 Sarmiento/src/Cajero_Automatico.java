<<<<<<< HEAD
public class Cajero_Automatico {
    public final double efectivo; //Calificador de acceso Final
    protected boolean acepta; //Calificador de acceso protegido
    private String devuelve; //Calificador de acceso privado

    public Cajero_Automatico(String devuelve, boolean acepta,double efectivo) {
        this.devuelve = devuelve;
        this.acepta = acepta;
        this.efectivo = efectivo;
    }

    public Cajero_Automatico(double efectivo, String devuelve, boolean acepta) {
        this.efectivo = efectivo;
        this.acepta = acepta;
        this.devuelve = devuelve;
    }

    public void procesarPedido(){

    }
    public double pago(){
      return 0;
    }

    public double getEfectivo() {
        return efectivo;
    }

    public boolean isAcepta() {
        return acepta;
    }

    public void setAcepta(boolean acepta) {
        this.acepta = acepta;
    }

    public String getDevuelve() {
        return devuelve;
    }

    public void setDevuelve(String devuelve) {
        this.devuelve = devuelve;
    }
=======
public class Cajero_Automatico {
    public final double efectivo; //Calificador de acceso Final
    protected boolean acepta; //Calificador de acceso protegido
    private String devuelve; //Calificador de acceso privado

    public Cajero_Automatico(String devuelve, boolean acepta,double efectivo) {
        this.devuelve = devuelve;
        this.acepta = acepta;
        this.efectivo = efectivo;
    }

    public Cajero_Automatico(double efectivo, String devuelve, boolean acepta) {
        this.efectivo = efectivo;
        this.acepta = acepta;
        this.devuelve = devuelve;
    }

    public void procesarPedido(){

    }
    public double pago(){
      return 0;
    }

    public double getEfectivo() {
        return efectivo;
    }

    public boolean isAcepta() {
        return acepta;
    }

    public void setAcepta(boolean acepta) {
        this.acepta = acepta;
    }

    public String getDevuelve() {
        return devuelve;
    }

    public void setDevuelve(String devuelve) {
        this.devuelve = devuelve;
    }
>>>>>>> 282639c696d7bd377e9aec96ee6f3ed75d109494
}