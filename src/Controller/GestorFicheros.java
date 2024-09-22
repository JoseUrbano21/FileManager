import java.io.File;

public class GestorFicheros {

    // 1 -> Obtener todos los nombres de los ficheros de un directorio
    public void obtenerFicheros(String path) {
        // Guardamos el path que le pasamos en un objeto:
        File file = new File(path);

        // El metodo list() devuelve un array de ficheros que guardamos en una variable(array):
        String[] listaStrings = file.list();
        File[] listaFiles = file.listFiles();

        // Recorrer el array con un for:
        if (listaFiles != null) {
            for (File ele : listaFiles) {
                System.out.println(ele.getName());

                // Añadimos la recursiva:
                if (ele.isDirectory()) {
                    String elePath = ele.getAbsolutePath();
                    obtenerFicheros(elePath);
                }
            }
        } else {
            System.out.println("El directorio está vacío");
        }
    }

    /* 2 -> Crear una subcarpeta en el directorio y crear en ella un fichero
         -> Obtener todos los nombres de los ficheros del directorio y la subcarpeta
    */
    public void crearDirectorio(String path) {
        File file = new File(path);
    }

    // 3 -> Listar el nombre de todos los ficheros del SISTEMA ( C:/User o /Users )
}