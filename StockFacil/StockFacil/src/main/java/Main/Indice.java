package Main;

import Ventanas.Menu;
import archivos.Gestordearchivos;
import funciones.NuevoStock;
import validar.Validacion;

public class Indice {
    /**
     * creacion del archivo de texto en caso de que no exista.
     */

    public static void main(String[] args) {
        Gestordearchivos.crearArchivoVacio();
        Menu.menu1();
    }
}