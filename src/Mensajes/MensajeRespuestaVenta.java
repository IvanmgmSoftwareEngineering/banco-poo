package Mensajes;

import Utilidades.Utilidades;

public class MensajeRespuestaVenta extends MensajeVenta {
    private boolean operacionRealizada;
    private double precioDeAccion;
    private double beneficioTotal; //Coste de accion x numero de acciones vendidas

    public MensajeRespuestaVenta(int identificador, String nombreCliente, boolean operacionRealizada, double precioDeAccion, double beneficioTotal) {
        super(identificador, nombreCliente);
        this.operacionRealizada = operacionRealizada;
        this.precioDeAccion = precioDeAccion;
        this.beneficioTotal = beneficioTotal;
    }

    private String cadenaOperacionRealizada() {
        return String.valueOf(this.operacionRealizada);
    }

    private String cadenaPrecioDeAccion() {
        return Utilidades.formatoDinero(this.precioDeAccion);
    }

    private String cadenaBeneficioTotal() {
        return Utilidades.formatoDinero(this.beneficioTotal);
    }

    public String codificar() {
        return cadenaIdentificador() + "|" + nombreCliente + "|" + cadenaOperacionRealizada() + "|" + cadenaPrecioDeAccion() + "|" + cadenaBeneficioTotal();
    }
}
