package Utilidades;

import java.text.DecimalFormat;

public class Utilidades {

    public static String formatoDinero(double numero) { // Método estático: no hace falta crear un objeto para llamarla
        DecimalFormat formateador = new DecimalFormat("0000000.00");
        return formateador.format(numero);
    }

    public static String formatoEntero(int numero) {
        DecimalFormat formateador = new DecimalFormat("00000000");
        return formateador.format(numero);
    }
}
