import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
    public static String nuevaLineaTexto(String ruta, String nombreObjeto, int cantidad) {
        Path archivo = Paths.get(ruta);
        String texto = "";
        String linea = nombreObjeto+", Cantidad: "+cantidad+", Fecha: "+Fecha_Hora.fechaActual()+" ,Hora: "+Fecha_Hora.horaActual();
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
     * Metodo que entrega por consola lo que contiene el archivo Stock.txt.
     * @param ruta variable para acceder a la ruta del archivo Stock.txt.
     * @return retorna un texto que corresponde a lo que contiene el archivo Stock.txt.
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



