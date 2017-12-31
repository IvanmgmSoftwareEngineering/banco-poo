package Mensajes;

import java.util.GregorianCalendar;
import static Utilidades.Utilidades.formatoFecha;

public class MensajeActualizacion extends Mensaje {
    protected GregorianCalendar fechaSolicitud;

    public MensajeActualizacion(int identificador, GregorianCalendar fechaSolicitud) {
        super(identificador);
        this.fechaSolicitud = fechaSolicitud;
    }

    protected String cadenaFechaSolicitud() {
        return formatoFecha(this.fechaSolicitud);
    }

    public String codificar() {
        return cadenaIdentificador() + "|" + cadenaFechaSolicitud();
    }
}
