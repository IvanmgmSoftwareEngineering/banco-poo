package Mensajes;

import Utilidades.Utilidades;

public class MensajeRespuestaCompra extends MensajeCompra {
    private boolean operacionRealizada;
    private int numAccionesCompradas;
    private double precioDeAccion;
    private double dineroSobrante;

    public MensajeRespuestaCompra(int identificador, String nombreCliente, boolean operacionRealizada, int numAccionesCompradas, double precioDeAccion, double dineroSobrante) {
        super(identificador, nombreCliente);
        this.operacionRealizada = operacionRealizada;
        this.numAccionesCompradas = numAccionesCompradas;
        this.precioDeAccion = precioDeAccion;
        this.dineroSobrante = dineroSobrante;
    }

    private String cadenaOperacionRealizada() {
        return String.valueOf(this.operacionRealizada);
    }

    private String cadenaNumAccionesCompradas() {
        return Utilidades.formatoEntero(this.numAccionesCompradas);
    }

    private String cadenaPrecioDeAccion() {
        return Utilidades.formatoDinero(this.precioDeAccion);
    }

    private String cadenaDineroSobrante() {
        return Utilidades.formatoDinero(this.dineroSobrante);
    }

    public String codificar() {
        return cadenaIdentificador() + "|" + nombreCliente + "|" + cadenaOperacionRealizada() + "|" + cadenaNumAccionesCompradas() + "|" + cadenaPrecioDeAccion() + "|" + cadenaDineroSobrante();
    }
}
