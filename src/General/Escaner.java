package General;
import java.util.Scanner;

public class Escaner  {

    public int leeSeleccionMenu() {
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        return  entradaEscaner.nextInt ();
    }

    public String leeDatos(){
        Scanner entradaDatos = new Scanner (System.in); //Creación de un objeto Scanner
        return entradaDatos.nextLine();

    }

}
