import java.util.Scanner;
public class Venta {


    public static void vender(){
        Scanner leer = new Scanner (System.in);
        boolean realizar = true;

        while (realizar = true) {

            System.out.println("Elige tu celular");
            elegirCelular();

            System.out.println("¿Quieres comprar otro celular más?\n1-Si \n2-No"); //podria eliminarse
            int validarEntero= Validacion.validarEntero();
            int opcion = validarEntero;

            if (opcion== 2){
                realizar = false;
            }else if(opcion == 1){
                System.out.println("Seguiremos con la compra");
            }
        }
    }

    public static void elegirCelular(){
        Celular celular = new Celular();
        Scanner leer = new Scanner(System.in);

        System.out.println("Deseas buscar por \n1-Marca o por \n2-Precio?");
        int validarEntero= Validacion.validarEntero();
        int opcion = validarEntero;

        int marca = 0;
        switch (opcion) {
            case 1: //por marca -> modelo -> color -> precio
                System.out.println("tenemos dos marcas: \n1-Huawei y \n2-Apple");
                marca = leer.nextInt();
                if (marca == 1){
                    celular.setMarca("Huawei");
                } else {
                    celular.setMarca("Apple");
                }

                break;
            case 2:
                System.out.println("quiere por precio");
                break;
            default:
            break;
        }

    }
    public static void elegirMarca (){

    }
     //       try{
     //         System.out.println("Ingrese nombre");
     //         String kakita = leer.nextLine();
     //         estudiante1.setNombre(kakita);
     //       } catch (Exception e){
     //         System.out.println("TE EQUIVOCASTE");
     //       }
}
