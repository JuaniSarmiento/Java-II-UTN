public class ReproductorMusica {

        private String nombreApp;

        public ReproductorMusica(String nombreApp) {
            this.nombreApp = nombreApp;
        }

        public void encender() {
            System.out.println("Reproductor " + nombreApp + " listo!");
        }

        // Dependencia: el método reproducir() requiere un objeto Canción
        public void reproducir(Cancion cancion) {
            System.out.println("Reproduciendo: " + cancion.getTitulo() +
                    " (" + cancion.getDuracion() + " mins)");
        }
}
