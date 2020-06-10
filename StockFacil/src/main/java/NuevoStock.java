import java.util.Scanner;
public class NuevoStock {

    /**
     * Metodo que interactua en consola para crear un nuevo objeto al inventario.
     */
    public static void crearStock() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre del objeto");
        String nombre = teclado.nextLine();
        while (!Validacion.validarLetras(nombre)){
            System.out.println("Nombre incorrecto vuelva a ingresar el nombre del objeto");
            nombre = teclado.nextLine();
        }
        System.out.println("Ingrese cantidad del objeto creado");
        int cantidad =Validacion.validarEntero();
        Gestordearchivos.nuevaLineaTexto("stock.txt", nombre, cantidad);

    }
}



