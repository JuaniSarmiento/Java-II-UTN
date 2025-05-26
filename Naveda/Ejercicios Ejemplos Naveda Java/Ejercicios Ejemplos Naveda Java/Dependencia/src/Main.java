

public class Main {
    public static void main(String[] args) {
        Cancion cancion = new Cancion("Bohemian Rhapsody", 5.55);
        ReproductorMusica reproductor = new ReproductorMusica("Spotify");

        reproductor.reproducir(cancion);
    }
}