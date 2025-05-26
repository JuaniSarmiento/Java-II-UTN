class Auto extends Vehiculo {
    public Auto(Matricula matricula) {
        super(matricula);
    }

    @Override
    public void acelera(int incremento) throws MiException {
        int nuevaVelocidad = velocidad + incremento;
        if (nuevaVelocidad > 120) {
            throw new MiException("Velocidad máxima excedida", "Auto");
        }
        velocidad = nuevaVelocidad;
    }
}
