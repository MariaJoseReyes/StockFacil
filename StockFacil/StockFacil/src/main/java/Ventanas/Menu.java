package Ventanas;

import archivos.Gestordearchivos;
import funciones.NuevoStock;
import validar.Validacion;

public class Menu {
    public static void menu1() {
        boolean ejec = true;
        do {
            System.out.println("Selecciona la operacion a realizar\n1- Crear Objeto\n2- Mostrar Inventario\n3- Salir");
            int validarEntero = Validacion.validarEntero();
            int opcion = validarEntero;
            if (opcion >= 1 && opcion <= 2) {
                seleccion(opcion, true);
            } else if (opcion == 3) {
                ejec = false;
            } else {
                System.out.println("Opcion no valida");
            }
        } while (ejec);
    }

    public static void menu2() {
        boolean ejecu = true;
        do {
            System.out.println("Selecciona objeto a crear \n1- ComputadorPortatil\n2- Celular\n3- Televisor\n 4-salir");
            int validarEntero2 = Validacion.validarEntero();
            int opcion2 = validarEntero2;
            if (opcion2 >= 1 && opcion2 <= 3) {
                seleccion2(opcion2,true);
            } else if (opcion2 == 4) {
                ejecu = false;
            } else {
                System.out.println("Opcion no valida");
            }
        } while (ejecu);
    }


    /**
     * Metodo que realiza la operacion de la opción escogida del metodo menu.
     */
    public static void seleccion(int opcion, boolean ejec) {
        switch (opcion) {
            case 1: menu2();
                break;
            case 2:
                Gestordearchivos.leerArchivo("stock.txt");
                break;
            default:
                break;
        }
    }

    private static void seleccion2(int opcion2, boolean ejecu) {
        switch (opcion2) {
            case 1:
                NuevoStock.DatosComputadroPortatil();
                break;
            case 2:
                NuevoStock.DatosCelular();
                break;
            case 3:
                NuevoStock.DatosTelevisor();
                break;
            default:
                break;
        }

    }

}
