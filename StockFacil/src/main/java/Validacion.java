import java.util.InputMismatchException;
import java.util.Scanner;

public class Validacion {
    /**
     * Metodo que valida una variable de tipo entero.
     *
     * @return retorna una variable de tipo entero Int.
     */
    public static int validarEntero() {
        Scanner teclado = new Scanner(System.in);
        int entrada = 0;
        boolean valido;
        do {
            try {
                entrada = teclado.nextInt();
                if (entrada >= 0) {
                    valido = false;
                } else {
                    System.out.println("Ingreso de negativo, Invalido");
                    valido = true;
                }
            } catch (InputMismatchException ime) {
                System.out.println("No ingrese letras u oraciones");
                teclado.next();
                valido = true;
            }
        } while (valido);
        return entrada;
    }
    /**
     * Metodo que valida letras ingresadas por consola.
     * @param nombre variable ingresada por el usuario de tipo String.
     * @return retorna una variable de tipo booleano que certifica con un true que la variable nombre corresponde a una variable sin numeros ni caracteres extraños.
     * */
        public static boolean validarLetras(String nombre){
        boolean validar = false;
        if ((nombre).matches("([a-z]|[A-Z]|\\s)+")) {
            validar = true;
        }
        return validar;
    }
    }
