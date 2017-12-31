package Mensajes;

import Utilidades.Utilidades;

public class MensajeVenta extends Mensaje {
    protected String nombreCliente;
    protected String nombreEmpresa;
    protected int numAcciones;

    public MensajeVenta(int identificador, String nombreCliente, String nombreEmpresa, int numAcciones) {
        super(identificador);
        this.nombreCliente = nombreCliente;
        this.nombreEmpresa = nombreEmpresa;
        this.numAcciones = numAcciones;
    }

    protected MensajeVenta(int identificador, String nombreCliente) {   // Para MensajeRespuestaVenta
        super(identificador);
        this.nombreCliente = nombreCliente;
    }

    private String cadenaNumAcciones() {
        Utilidades uti = new Utilidades();
        return uti.formatoEntero(this.numAcciones);
    }

    public String codificar() {
        return cadenaIdentificador() + "|" + nombreCliente + "|" + nombreEmpresa + "|" + cadenaNumAcciones();
    }
}
