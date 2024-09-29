import controller.LecturaFicheros;

public class Main {
    public static void main(String[] args) {

        // 1 -> Obtener todos los nombres de los ficheros de un directorio
        LecturaFicheros gestor = new LecturaFicheros();
        gestor.obtenerFicheros("src");
        // gestor.crearDirectorio("");
    }
}