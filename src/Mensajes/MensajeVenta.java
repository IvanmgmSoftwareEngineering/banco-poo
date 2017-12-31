package Mensajes;

import Utilidades.Utilidades;

public class MensajeVenta extends Mensaje {
    protected String nombreCliente;
    protected String nombreEmpresa;
    protected int numAcciones;

    private String cadenaNumAcciones() {
        Utilidades uti = new Utilidades();
        return uti.formatoEntero(this.numAcciones);
    }

    public String codificar() {
        return cadenaIdentificador() + "|" + nombreCliente + "|" + nombreEmpresa + "|" + cadenaNumAcciones();
    }
}
