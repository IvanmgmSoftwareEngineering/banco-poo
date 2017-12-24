package General;
import java.util.Scanner;

public class Escaner  {

    public int lee() throws Exception{
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        return  entradaEscaner.nextInt ();
    }

}
