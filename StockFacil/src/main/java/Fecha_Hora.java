import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Fecha_Hora {
    public static String fechaActual(){
        Date fecha=new Date();
        SimpleDateFormat formatoFecha =new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }
    public static String horaActual(){
        Date Hora =new Date();
        DateFormat formatoHora=new SimpleDateFormat("HH:mm:ss");
        return formatoHora.format(Hora);
    }
}