package funciones;

import Productos.Celular;
import Productos.ComputadorPortatil;
import Productos.Televisor;
import archivos.Gestordearchivos;
import validar.*;
import java.util.Scanner;
public class NuevoStock {

    /**
     * Metodo que interactua en consola para crear un nuevo objeto al inventario.
     */
    public static void DatosTelevisor() {
        Scanner teclado = new Scanner(System.in);
        Televisor Tele=new Televisor();
        System.out.println("Ingrese la marca del televisor");
        String marca = teclado.nextLine();
        while (!Validacion.validarLetras(marca)){
            System.out.println("marca incorrecta vuelva a ingresar la marca del televisor");
            marca = teclado.nextLine();
        }
        System.out.println("Ingrese el tipo de televisor (Oled,led,UltraHd");
        String tipo = teclado.nextLine();
        while (!Validacion.validarLetras(marca)){
            System.out.println("Tipo incorrecto vuelva a ingresar el Tipo de televisor");
            tipo = teclado.nextLine();
        }

        System.out.println("Ingrese Tamaño de la pantalla (Pulgadas)");
        int tamañopulgadas = Validacion.validarEntero();
        System.out.println("Ingrese cantidad de Televisores");
        int cantidad = Validacion.validarEntero();
        Tele.setMarca(marca);
        Tele.setTamañoPulgadas(tamañopulgadas);
        Tele.setTipo(tipo);

        Gestordearchivos.nuevaLineaTextoTelevisores("stock.txt",Tele,cantidad);

    }
    public static void DatosComputadroPortatil() {
        Scanner teclado = new Scanner(System.in);
        ComputadorPortatil Laptop=new ComputadorPortatil();
        System.out.println("Ingrese la marca");
        String marca = teclado.nextLine();
        while (!Validacion.validarLetras(marca)){
            System.out.println("marca incorrecto vuelva a ingresar ");
            marca = teclado.nextLine();;
        }
        System.out.println("Ingrese el modelo");
        String modelo = teclado.nextLine();
        while (!Validacion.validarLetras(modelo)){
            System.out.println("modelo incorrecto vuelva a ingresar el modelo");
            modelo = teclado.nextLine();;
        }
        System.out.println("Ingrese el color");
        String color = teclado.nextLine();
        while (!Validacion.validarLetras(color)){
            System.out.println("Color incorrecto vuelva a ingresar");
            color = teclado.nextLine();;
        }
        System.out.println("Ingrese cantidad de espacio del Computador Portatil");
        int capacidadGigas= Validacion.validarEntero();
        System.out.println("Ingrese cantidad de computadores que desee ingresar");
        int cantidad = Validacion.validarEntero();
        Laptop.setMarca(marca);
        Laptop.setModelo(modelo);
        Laptop.setColor(color);
        Laptop.setCapacidadGigas(capacidadGigas);

        Gestordearchivos.nuevaLineaTextoComputadores("stock.txt",Laptop,cantidad);

    }
    public static void DatosCelular() {
        Scanner teclado = new Scanner(System.in);
        Celular Celu=new Celular();
        System.out.println("Ingrese la marca");
        String marca = teclado.nextLine();
        while (!Validacion.validarLetras(marca)){
            System.out.println("marca incorrecto vuelva a ingresar ");
            marca = teclado.nextLine();;
        }
        System.out.println("Ingrese el modelo");
        String modelo = teclado.nextLine();
        while (!Validacion.validarLetras(modelo)){
            System.out.println("modelo incorrecto vuelva a ingresar el modelo");
            modelo = teclado.nextLine();;
        }
        System.out.println("Ingrese el color");
        String color = teclado.nextLine();
        while (!Validacion.validarLetras(color)){
            System.out.println("Color incorrecto vuelva a ingresar");
            color = teclado.nextLine();;
        }
        System.out.println("Ingrese cantidad de espacio del Celular");
        int capacidadGigas= Validacion.validarEntero();
        System.out.println("Ingrese cantidad de Celulares");
        int cantidad = Validacion.validarEntero();
        Celu.setMarca(marca);
        Celu.setModelo(modelo);
        Celu.setColor(color);
        Celu.setCapacidadGigas(capacidadGigas);
        Gestordearchivos.nuevaLineaTextoCelulares("stock.txt",Celu,cantidad);
    }
}



