import Controller.GestorFicheros;

public class Main {
    public static void main(String[] args) {

        // 1 -> Obtener todos los nombres de los ficheros de un directorio
        GestorFicheros gestor = new GestorFicheros();
        gestor.obtenerFicheros("src");
        // gestor.crearDirectorio("");
    }
}