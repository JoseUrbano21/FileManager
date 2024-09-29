import controller.LecturaFicheros;

public class Main {
    public static void main(String[] args) {

        // Creamos un objeto de la clase LecturaFicheros para probar los distintos metodos de la clase:
        LecturaFicheros gestor = new LecturaFicheros();

        // 1 -> Obtener todos los nombres de los ficheros de un directorio
        gestor.obtenerFicheros("src");

        // 2 -> Crear una subcarpeta en el directorio y crear en ella un fichero
        gestor.crearDirectorio("src/resources/pokedex");
        gestor.crearFichero("src/resources/pokedex/pokemonIniciales.txt");

        //   -> Obtener todos los nombres de los ficheros del directorio y la subcarpeta

    }
}