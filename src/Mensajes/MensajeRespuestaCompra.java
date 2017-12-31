package Mensajes;

import Utilidades.Utilidades;

public class MensajeRespuestaCompra extends MensajeCompra {
    private boolean operacionRealizada;
    private int numAccionesCompradas;
    private double precioDeAccion;
    private double dineroSobrante;

    private String cadenaNumAccionesCompradas() {
        return Utilidades.formatoEntero(this.numAccionesCompradas);
    }

    private String cadenaPrecioDeAccion() {
        return Utilidades.formatoDinero(this.precioDeAccion);
    }

    private String cadenaDineroSobrante() {
        return Utilidades.formatoDinero(this.dineroSobrante);
    }

    private String cadenaOperacionRealizada() {
        return String.valueOf(this.operacionRealizada);
    }

    public String codificar() {
        return cadenaIdentificador() + "|" + nombreCliente + "|" + cadenaOperacionRealizada() + "|" + cadenaNumAccionesCompradas() + "|" + cadenaPrecioDeAccion() + "|" + cadenaDineroSobrante();
    }
}
