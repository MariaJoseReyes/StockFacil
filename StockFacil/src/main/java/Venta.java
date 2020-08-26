import java.util.Scanner;

public class Venta {


    public static void vender(){
        boolean realizar = true;

        while (realizar = true) {

            System.out.println("Elige tu celular");
            elegirCelular();

            System.out.println("¿Quieres comprar otro celular más?\n1-Si \n2-No"); //podria eliminarse
            int opcion = Validacion.validarEntero();

            if (opcion== 2){
                realizar = false;
            }else if(opcion == 1){
                System.out.println("Seguiremos con la compra");
            }
        }
    }

    public static void elegirCelular(){
        Celular celular = new Celular();
        System.out.println("Deseas buscar por \n1-Marca o por \n2-Precio?");
        int opcion = Validacion.validarEntero();

        switch (opcion) {
            case 1: //por marca -> modelo -> color -> precio
                String marca = elegir(1,"", "Huawei", "Apple", "-","-" );
                celular.setMarca(marca);
                String modelo = elegir(2, marca, "Y7", "Y9", "A1", "A2" );
                celular.setModelo(modelo);
                //String color = elegir (3, modelo, "Azul","Negro", "Blanco", "Gris");
                //celular.setColor(color);
                int precio = elegirNum (marca, modelo, "Huawei", "Apple");
                celular.setPrecio(precio);

                break;
            case 2:
                System.out.println("quiere por precio");
                break;
            default:
            break;
        }

    }
    public static String elegir(int eleccion, String selecAnterior, String op1, String op2, String op3, String op4){
        String elegido = "";

        switch (eleccion){
            case 1:
                System.out.println("Tenemos dos marcas \n1- "+op1+ " y \n2- "+op2);
                int opcion1 = Validacion.validarEntero();
                if (opcion1 == 1){
                    elegido = op1;
                } else {
                    elegido = op2;
                }
                break;

            case 2:
                if (selecAnterior.equals(op1)){
                    System.out.println("Tenemos 2 modelos \n1-"+op1+" \n2-"+op2);
                    int opcion2 = Validacion.validarEntero();
                    if (opcion2 == 1){
                        elegido = op1;
                    } else {
                        elegido = op2;
                    }
                }
                else if (selecAnterior.equals(op2)){
                    System.out.println("Tenemos 2 modelos \n1-"+op3+" \n2-"+op4);
                    int opcion3 = Validacion.validarEntero();
                    if (opcion3 == 1){
                        elegido = op3;
                    } else {
                        elegido = op4;
                    }
                }
                break;
        }
        return elegido;
    }

    public static int elegirNum(String marca, String modelo, String a, String b){
        int valor;
        int valorMarca = 0;

        if (marca.equals(a)){
            valorMarca = 150;
        } else if (marca.equals(b)){
            valorMarca = 120;
        }
        valor = valorMarca;

        return valor;
    }
}
