package General;

import ExcepcionesPropias.IntentsLimitAchieveException;
import ExcepcionesPropias.ObjetoEscannerNoPasadoConstructorInterfazDeUsuario;

public class InterfazDeUsuario {
    Escaner leeTeclado;
    private int eleccion;
    private int intentos;


    public InterfazDeUsuario() {
    }

    public InterfazDeUsuario(Escaner leeTeclado) {
        this.leeTeclado = leeTeclado;
    }

    public int getEleccion() {
        return eleccion;
    }

    public void menu() {
        System.out.println("********************** MENU *********************");

        System.out.println("0.- Salir");
        System.out.println("----------------- ESTADO ----------------------");
        System.out.println("1.- Imprimir estado de los clientes");
        System.out.println("2.- Imprimir estado de la bolsa");
        System.out.println("------------------- BANCO ----------------------");
        System.out.println("3.- Añadir cliente");
        System.out.println("4.- Eliminar cliente");
        System.out.println("5.- Realizar copia de seguridad");
        System.out.println("6.- Restaurar copia de seguridad");
        System.out.println("7.- Mejorar cliente a premium");
        System.out.println("8.- Solicita recomendación de inversión");
        System.out.println("----------------- BOLSA ------------------------");
        System.out.println("9.- Añadir empresa a la bolsa");
        System.out.println("10.- Eliminar empresa de la bolsa");
        System.out.println("11.- Acutalización de valores");
        System.out.println("12.- Realizar copia de seguridad");
        System.out.println("13.- Restaurar copia de seguridad");
        System.out.println("----------------- OPERACIONES --------------------");
        System.out.println("14.- Solicitar copia de acciones");
        System.out.println("15.- Solicitar venta de acciones");
        System.out.println("16.- Solicitar actualización de valores");
        System.out.println("------------------- BROKER -----------------------");
        System.out.println("17.- Imprimir operaciones pendientes");
        System.out.println("18.- Ejecutar operaciones pendientes");
        System.out.println("**************************************************");
    }


        public void muestraMenu() throws ClassCastException,IntentsLimitAchieveException,ObjetoEscannerNoPasadoConstructorInterfazDeUsuario{
        do {
            this.menu();
            System.out.print("Inserte la opción deseada: ");
            try {
                eleccion = leeTeclado.lee();
                intentos = 5;
                while ((eleccion < 0) || (eleccion > 18)) {
                    if (intentos == 0){
                        throw new IntentsLimitAchieveException("Se ha superado el límite de veces que el usuario puede introducir una opción no válida");
                    }
                    this.menu();
                    System.out.println("¡La opción solicitada no existe; escoja una opción entre las mostradas en el menú!");
                    System.out.print("Inserte la opción deseada (le quedan "+ intentos +" intentos): ");
                    eleccion = leeTeclado.lee();
                    intentos = intentos -1;
                }

            }
            catch(ClassCastException eleccionNoEsNumeroEntero ){
                throw eleccionNoEsNumeroEntero;
            }
            catch(NullPointerException e ) {
                throw new ObjetoEscannerNoPasadoConstructorInterfazDeUsuario("La clase 'Interfaz Ususario' debe recibir un objeto de tipo 'Escanner' para funcionar correctamente");
            }


        }
            while (eleccion != 0);

            System.out.println("Adios");





        }

        /*  while((eleccion != "0")&&(eleccion != "1")&&(eleccion != "2")&&(eleccion != "3")&&(eleccion != "4")&&(eleccion != "5")&&(eleccion != "6")&&(eleccion != "7")&&(eleccion != "8")&&(eleccion != "9")&&(eleccion != "10")&&(eleccion != "11")&&(eleccion != "12")&&(eleccion != "13")&&(eleccion != "14")&&(eleccion != "15")&&(eleccion != "16")&&(eleccion != "17")&&(eleccion != "18")){
                System.out.println("La opcion solicitada no existe; escoja una opción entre las mostradas en el menú");
                leeTeclado = new Escaner();
                eleccion = leeTeclado.lee();
            }

            if (eleccion == "1") {
            } else if (eleccion == "2") {
            } else if (eleccion == "3") {

            } else if (eleccion == "4") {

            } else if (eleccion == "5") {

            } else if (eleccion == "6") {

            } else if (eleccion == "7") {

            } else if (eleccion == "8") {

            } else if (eleccion == "9") {

            } else if (eleccion == "10") {

            } else if (eleccion == "11") {

            } else if (eleccion == "12") {

            } else if (eleccion == "13") {

            } else if (eleccion == "14") {

            } else if (eleccion == "15") {

            } else if (eleccion == "16") {

            } else if (eleccion == "17") {

            } else if (eleccion == "18") {

            }



            }
            while (eleccion != "0");

            System.out.println("Adios");*/
}
