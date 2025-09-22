package primero;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        
        //System.out.println("Hello world!");
        try {
         // Creamos el objeto que encapsula el fichero
        File fichero = new File("c:\\prueba\\miFichero.txt");
            // A partir del objeto File creamos el fichero físicamente
        if (fichero.exists())
            System.out.println("El fichero SI existía");
        else
            System.out.println("No ha podido ser creado el fichero");
    } catch (Exception ioe) {
        ioe.getMessage();
    }

    try{
        // Declaración de variables
        String directorio = "C:\\prueba2";
        String varios = "carpeta1/carpeta2/carpeta3";
        // Crear un directorio
        boolean exito = (new File(directorio)).mkdir();
        if (exito)
            System.out.println("Directorio: " + directorio + " creado");
        // Crear varios directorios
        exito = (new File(varios)).mkdirs();
        if (exito)
            System.out.println("Directorios: " + varios + " creados");
        }catch (Exception e){
            System.err.println("Error: " + e.getMessage());
    }
    try{
        File fichero = new File("c:\\prueba\\miFichero.txt");
        if(fichero.delete())
        System.out.println("fichero: " + fichero.getAbsolutePath() + " borrado");
        }catch (Exception e){
            System.err.println("Error: " + e.getMessage());
    }
  }
}