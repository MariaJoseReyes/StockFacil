import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Metodo sujeto a modificaciones devido al funcionamiento.
 */
public class Gestordearchivos {
        /**
         * Metodo que comprueba si existe el archivo stock.txt, si no existe lo crea.
         */
        public static void crearArchivoVacio() {
            if (new File("stock.txt").exists()) {
            } else {
                try {
                    Files.write(Paths.get("stock.txt"), new String().getBytes());
                } catch (IOException e) {
                }
            }
        }


    /**
     * Metodo que ingresa una nueva linea de texto al inventario stock.txt
     */
    public static String nuevaLineaTexto(String ruta, String nonbreObjeto, int cantidad) {
        Path archivo = Paths.get(ruta);
        String texto = "";
        String linea = nonbreObjeto + ", Cantidad: " + cantidad;
        try {
            texto = new String(Files.readAllBytes(archivo));
            texto = texto + "\n" + linea;
            Files.write(archivo, texto.getBytes());
            System.out.println("Ingresado...");
        } catch (IOException e) {
            System.out.println("No se pudo agregar una nueva linea");
        }
        return texto;
    }

    /**
     * Metodo que entrega por consola lo que contiene el archivo libreria.json.
     *
     * @param ruta variable para acceder a la ruta del archivo libreria.json.
     * @return retorna un texto que corresponde a lo que contiene el archivo libreria.json.
     */
    public static String leerArchivo(String ruta) {
        Path archivo = Paths.get(ruta);
        String texto = "";
        try {
            texto = new String(Files.readAllBytes(archivo));
            System.out.println(texto);
        } catch (IOException var4) {
            System.out.println("El archivo no pudo ser leido");
        }
        return texto;
    }

}



