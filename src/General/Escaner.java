package General;
import java.util.Scanner;

public class Escaner {
    String pulsaciones;

    public void Escaner(){
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        pulsaciones = entradaEscaner.nextLine ();
    }

    public String getPulsaciones() {
        return pulsaciones;
    }
}
