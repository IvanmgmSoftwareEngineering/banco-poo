package Utilidades;

import java.text.DecimalFormat;
import java.util.GregorianCalendar;

public class Utilidades {

    public static String formatoDinero(double numero) { // Método estático: no hace falta crear un objeto para llamarla
        DecimalFormat formateador = new DecimalFormat("0000000.00");
        return formateador.format(numero);
    }

    public static String formatoEntero(int numero) {
        DecimalFormat formateador = new DecimalFormat("00000000");
        return formateador.format(numero);
    }

    public static String formatoFecha(GregorianCalendar fecha) {
        int anyo = fecha.YEAR;
        int mes = fecha.MONTH;
        int diaDelMes = fecha.DAY_OF_MONTH;
        int hora = fecha.HOUR_OF_DAY;
        int minuto = fecha.MINUTE;
        int segundo = fecha.SECOND;

        return Integer.toString(anyo) + Integer.toString(mes) + Integer.toString(diaDelMes) + Integer.toString(hora) + Integer.toString(minuto) + Integer.toString(segundo);
    }
}
