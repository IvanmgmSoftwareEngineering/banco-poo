package Mensajes;

import java.util.GregorianCalendar;

public class MensajeRespuestaActualizacion extends MensajeActualizacion{
    private boolean operacionRealizada;

    public MensajeRespuestaActualizacion(int identificador, GregorianCalendar fechaSolicitud, boolean operacionRealizada) {
        super(identificador, fechaSolicitud);
        this.operacionRealizada = operacionRealizada;
    }

    private String cadenaOperacionRealizada() {
        return String.valueOf(this.operacionRealizada);
    }

    public String codificar() {
        return cadenaIdentificador() + "|" + cadenaFechaSolicitud() + "|" + cadenaOperacionRealizada();
    }
}
