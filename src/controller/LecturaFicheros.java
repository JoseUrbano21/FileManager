package controller;

import java.io.File;
import java.io.IOException;

public class LecturaFicheros {

    // 1 -> Obtener todos los nombres de los ficheros de un directorio
    public void obtenerFicheros(String path) {
        // Guardamos el path que le pasamos en un objeto:
        File file = new File(path);

        // El metodo listFiles() devuelve un array de ficheros que guardamos en una variable(array):
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
        boolean subcarpeta = file.mkdirs();
        if (subcarpeta) {
            System.out.println("El directorio ha sido creado");
        } else {
            System.out.println("No se ha podido crear el directorio");
        }
    }

    public void crearFichero(String path) {
        File file = new File(path);
        boolean newFile = false;
        try {
            newFile = file.createNewFile();
            System.out.println("El fichero se ha creado");
        } catch (IOException e) {
            System.out.println("No se ha podido crear el fichero");
        }
    }

    public void crearFicheroEnDirectorio(String path){
        File file = new File(path);

    }
}

// 3 -> Listar el nombre de todos los ficheros del SISTEMA (C:/User o /Users)
