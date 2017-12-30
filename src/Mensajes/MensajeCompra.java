package Mensajes;

public class MensajeCompra extends Mensaje{
    protected String nombreCliente;
    protected String nombreEmpresa;
    protected double inversionMaxima;

    protected String cadenaInversionMaxima() {
        return Double.toString(inversionMaxima);
    }

    public String codificar() {
        return cadenaIdentificador() + "|" + nombreCliente + "|" + nombreEmpresa + "|" + cadenaInversionMaxima();
    }
}
