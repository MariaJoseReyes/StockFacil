package archivos;

import Productos.Celular;
import Productos.ComputadorPortatil;
import Productos.Televisor;
import funciones.Fecha_Hora;

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
    public static String nuevaLineaTextoComputadores(String ruta, ComputadorPortatil Laptop, int cantidad) {
        Path archivo = Paths.get(ruta);

        String texto = "";
        String linea =  "Computador Portatil Marca: " + Laptop.getMarca() + ", Modelo: " + Laptop.getModelo() + ", Color: " + Laptop.getColor() +", CapacidadGigas: "+Laptop.getCapacidadGigas() +", Cantidad: " + cantidad + ", Fecha: " + Fecha_Hora.fechaActual() + " ,Hora: " + Fecha_Hora.horaActual();
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
        public static String nuevaLineaTextoCelulares (String ruta, Celular Celu, int cantidad){
            Path archivo = Paths.get(ruta);
            String texto = "";
            String linea = "Celular Marca: " + Celu.getMarca() + ", Modelo: " + Celu.getModelo() + ", Color: " + Celu.getColor()+", CapacidadGigas: "+Celu.getCapacidadGigas() +", Cantidad: " + cantidad + ", Fecha: " + Fecha_Hora.fechaActual() + " ,Hora: " + Fecha_Hora.horaActual();
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
        public static String nuevaLineaTextoTelevisores (String ruta, Televisor Tele, int cantidad){
            Path archivo = Paths.get(ruta);
            String texto = "";
            String linea = "Televisor marca: " + Tele.getMarca() + ", Tipo: " + Tele.getTipo() + ", TamañoPulgadas: " + Tele.getTamañoPulgadas() + " Cantidad:" + cantidad + ", Fecha: " + Fecha_Hora.fechaActual() + " ,Hora: " + Fecha_Hora.horaActual();
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
        public static String leerArchivo (String ruta){
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




