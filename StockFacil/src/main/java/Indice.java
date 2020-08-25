import java.util.InputMismatchException;
import java.util.Scanner;

public class Indice { //desde donde empezara lo que se quiera hacer.

    public static void main(String[] args) {
        Gestordearchivos.crearArchivoVacio();
        menu();
    }
    
    /**
     * Metodo que interactua sin el usuario mediante consola.
     */
    public static void menu() {
        boolean ejec = true;
        do {
            System.out.println("Selecciona la operacion a realizar\n1- Crear Objeto\n2- Mostrar Inventario\n3- Venta \n4- Salir");
            int validarEntero= Validacion.validarEntero();
            int opcion = validarEntero;
            if (opcion >= 1 && opcion <= 3) {
                seleccion(opcion, true);
            } else if (opcion == 4) {
                ejec = false;
            } else {
                System.out.println("Opcion no valida");
            }
        } while (ejec=true);
    }
    /**
     * Metodo que realiza la operacion de la opción escogida del metodo menu.
     */
    public static void seleccion(int opcion, boolean ejec) {
        switch (opcion) {
            case 1:
                NuevoStock.crearStock();
                break;
            case 2:
                Gestordearchivos.leerArchivo("stock.txt");
                break;
            case 3:
                Venta.vender();
            default:
                break;
        }
    }
}

