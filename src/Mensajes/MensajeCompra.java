package Mensajes;

import Utilidades.Utilidades;

public class MensajeCompra extends Mensaje{
    protected String nombreCliente;
    protected String nombreEmpresa;
    protected double inversionMaxima;

    protected String cadenaInversionMaxima() {
        return Utilidades.formatoDinero(this.inversionMaxima); //Estamos usando un método estático
    }

    public String codificar() {
        return cadenaIdentificador() + "|" + nombreCliente + "|" + nombreEmpresa + "|" + cadenaInversionMaxima();
    }
}
