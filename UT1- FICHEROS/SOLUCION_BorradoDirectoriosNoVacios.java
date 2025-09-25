package ficheros;

import java.io.File;

public class BorradoDirectoriosNoVacios {

    public static void borraElemento(File f){
        try{
            if(f.isFile()||(f.isDirectory()&&f.list().length==0)){
                f.delete();
            }
            else{
                String[] contenido=f.list();
                String ruta=f.getAbsolutePath();
                for(String nombre:contenido){
                    borraElemento(new File(ruta+"\\"+nombre));
                }
                f.delete(); //tenemos que ponerlo para que borre directorios vacíos a la vuelta
                }
        }catch (Exception ex) {
            System.out.println("Error al buscar en la ruta indicada"); }
    }
    public static void main(String[] args) {
        System.out.println("PRUEBA DE BORRAR UN DIRECTORIO CON FICHEROS Y SUBDIRECTORIOS");
        File fich=new File("C:\\borrar");
        if (fich.exists()){
            System.out.println("el directorio existe y se borrará");
            borraElemento(fich);
        }
        else{
            System.out.println("EL DIRECTORIO NO EXISTE");
        }
    }
}