package Mensajes;

import Utilidades.Utilidades;

public class MensajeCompra extends Mensaje{
    protected String nombreCliente;
    private String nombreEmpresa;
    private double inversionMaxima;

    public MensajeCompra(int identificador, String nombreCliente, String nombreEmpresa, double inversionMaxima) {
        super(identificador);
        this.nombreCliente = nombreCliente;
        this.nombreEmpresa = nombreEmpresa;
        this.inversionMaxima = inversionMaxima;
    }

    protected MensajeCompra(int identificador, String nombreCliente) {  // Para MensajeRespuestaCompra
        super(identificador);
        this.nombreCliente = nombreCliente;
    }

    private String cadenaInversionMaxima() {
        return Utilidades.formatoDinero(this.inversionMaxima); //Estamos usando un método estático
    }

    public String codificar() {
        return cadenaIdentificador() + "|" + nombreCliente + "|" + nombreEmpresa + "|" + cadenaInversionMaxima();
    }
}
