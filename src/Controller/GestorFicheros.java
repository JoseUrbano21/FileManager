package Controller;

import java.io.File;
import java.io.IOException;

public class GestorFicheros {

    // 1 -> Obtener todos los nombres de los ficheros de un directorio
    public void obtenerFicheros(String path) {
        // Guardamos el path que le pasamos en un objeto:
        File file = new File(path);

        // El metodo list() devuelve un array de ficheros que guardamos en una variable(array):
        File[] listaFiles = file.listFiles();

        // Recorrer el array con un for:
        if (listaFiles != null) {
            for (File ele : listaFiles) {
                System.out.println(ele.getName());

                // Llamamos al metodo recursivo para inspeccionar las subcarpetas:
                if (ele.isDirectory()) {
                    obtenerSubficheros(ele);
                }
            }
        } else {
            System.out.println("El directorio está vacío");
        }
    }

    // Metodo recursivo para sacar los ficheros de una subcarpeta y tabularlos:
    private void obtenerSubficheros(File subcarpeta) {
        File[] listaSubcarpeta = subcarpeta.listFiles();
        for (File ele : listaSubcarpeta) {
            System.out.println("\t" + ele.getName());
            if (ele.isDirectory()) {
                obtenerSubficheros(ele);
            }
        }
    }

    /* 2 -> Crear una subcarpeta en el directorio y crear en ella un fichero
         -> Obtener todos los nombres de los ficheros del directorio y la subcarpeta
    */
    public void crearDirectorio(String path) {
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("No se pudo crear el directorio.");
            }
        } else {
            System.out.println("El directorio ya existe.");
        }
    }
}

// 3 -> Listar el nombre de todos los ficheros del SISTEMA (C:/User o /Users)
