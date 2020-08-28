package funciones;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Fecha_Hora {
    /**
     * este programa nos da la fecha del dia de hoy con mes y año
     * @return   devuelve  la fecha para ser usada en el gestor de archivos
     */
    public static String fechaActual(){
        Date fecha=new Date();
        SimpleDateFormat formatoFecha =new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }

    /**
     *
     * @return devuelve la hora para ser utilizada en el programa de gestor de archivos
     */
    public static String horaActual(){
        Date Hora =new Date();
        DateFormat formatoHora=new SimpleDateFormat("HH:mm:ss");
        return formatoHora.format(Hora);
    }
}