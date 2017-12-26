package General;

import ExcepcionesPropias.*;

public class InterfazDeUsuario {

    //ESPACIO PARA CONSTANTES
    private final int INTENTOS = 5;
    // FIN CONSTANTES------------

    //ESPACIO RESERVADO PARA VARIABLES
    Escaner leeTeclado;
    private int eleccion;
    private String nombreEmpresa;
    private String nombrePersona;
    private String dni;
    private double valorActualEmpresa;
    // -FIN VARIABLES

    //ESPACIO RESERVADO PARA CONSTRUCTORES
    //constructor por defecto
    public InterfazDeUsuario() {
    }

    //constructor que recibe un objeto tipo escaner como parametro de entrada
    public InterfazDeUsuario(Escaner leeTeclado) {
        this.leeTeclado = leeTeclado;
    }

    // -FIN CONSTRUCTORES

    //ESPACIO RESERVADO PARA GETTERS
    public int getEleccion() {
        return eleccion;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public double getValorActualEmpresa() {
        return valorActualEmpresa;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public String getDni() {
        return dni;
    }

    // -FIN GETTERS

    //ESPACIO RESERVADO PARA METODOS PRIVADOS DE LA CLASE

    /*Nombre método: leeCadenaTextoTeclado
      Entradas: ninguna
      Salidas: String (cadena de caracteres introducidos por teclado)
      Excepciones: IntentsLimitAchieveException
      Descripción: utiliza el objeto escaner de la clase para leer de teclado una cade de caracteres. Si el formato de la cadena no es correcxto y se superan el límite de intentos se lanza una excepción.
      */
    private String leeCadenaTextoTeclado() throws IntentsLimitAchieveException {
        String datos;
        boolean encontrado;
        int intentos;
        int i = 0;
        intentos = INTENTOS;
        datos = leeTeclado.leeDatos();
        char letraNombre;
        while (intentos > 0) {
            encontrado = false;
            datos = leeTeclado.leeDatos();
            while (!encontrado && i < datos.length()) {
                letraNombre = datos.charAt(i);
                if (!(((letraNombre >= 65) && (letraNombre <= 90)) || ((letraNombre >= 97) && (letraNombre <= 122)))) {
                    encontrado = true;
                }
                i = i + 1;
            }
            if (encontrado) {
                System.out.println("El nombre debe contener caracteres válidos; no números, no acentos, solo letras desde a-z o A-Z ");
                intentos = intentos - 1;
                System.out.println("Vuelva a intentarlo. Le quedan " + intentos + " intentos para hacerlo bien.");
                System.out.print("Nombre empresa: ");
            } else {
                return datos;
            }
        }
        throw new IntentsLimitAchieveException("Se ha superado el límite de veces que el usuario puede introducir una opción no válida");
    }

    /*Nombre método: leeNumeroDecimalTeclado
      Entradas: ninguna
      Salidas: double (numero introducido por teclado)
      Excepciones: IntentsLimitAchieveException
      Descripción: utiliza el objeto escaner de la clase para leer de teclado un número. Si el número es no positivo y se superan el límite de intentos se lanza una excepción.
      */
    private double leeNumeroDecimalTeclado() throws IntentsLimitAchieveException {
        double numero;
        int intentos;
        intentos = INTENTOS;
        while (intentos > 0) {
            numero = Double.valueOf(leeTeclado.leeDatos()).doubleValue();
            if (numero < 0) {
                intentos = intentos - 1;
                System.out.println("El numero debe ser mayor o igual que cero;  no números negativos");
                System.out.println("Vuelva a intentarlo. Le quedan " + intentos + " intentos para hacerlo bien.");
                System.out.print("Inserte valor: ");

            }
            return numero;
        }

        throw new IntentsLimitAchieveException("Se ha superado el límite de veces que el usuario puede introducir una opción no válida");
    }

    /*Nombre método: menu
      Entradas: ninguna
      Salidas: ninguna
      Excepciones: no
      Descripción: imprime por pantalla el menú
      */
    private void menu() {
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
    //-FIN METODOS PRIVADOS


    //ESPACIO RESERVADO PARA METODOS PUBLICOS DE LA CLASE

    /*Nombre método: AltaEmpresaBolsa
      Entradas: ninguna
      Salidas: ninguna
      Excepciones: IntentsLimitAchieveException
      Descripción: cambia el valor de los atributos de la clase llamados: nombreEmpresa y valorActualEmpresa, através de la solicitud por teclado de datos al usuario.
      */

    public void AltaEmpresaBolsa() throws IntentsLimitAchieveException {
        System.out.println("Se va a proceder a dar de alta una nueva empresa en la bolsa de valores.");
        System.out.println("A continuación le solicitaremos los siguientes datos necesarios: ");
        System.out.print("Nombre empresa: ");
        nombreEmpresa = this.leeCadenaTextoTeclado();
        System.out.print("Valor actual empresa: ");
        valorActualEmpresa = this.leeNumeroDecimalTeclado();
    }

    /*Nombre método: BajaEmpresaBolsa
      Entradas: ninguna
      Salidas: ninguna
      Excepciones: IntentsLimitAchieveException
      Descripción: cambia el valor de los atributos de la clase llamados: nombreEmpresa, através de la solicitud por teclado de datos al usuario.
      */
    public void BajaEmpresaBolsa() throws IntentsLimitAchieveException {
        System.out.println("Se va a proceder a dar de baja una empresa en la bolsa de valores.");
        System.out.println("A continuación le solicitaremos los siguientes datos necesarios: ");
        System.out.print("Nombre empresa: ");
        nombreEmpresa = this.leeCadenaTextoTeclado();

    }

    /*Nombre método: muestraMenu
      Entradas: ninguna
      Salidas: ninguna
      Excepciones: ClassCastException,IntentsLimitAchieveException,ObjetoEscannerNoPasadoConstructorInterfazDeUsuario
      Descripción: Muestra el menu y pide al usuario ingresar un valor por teclado que se corresponda con una de las opciones del menu. Si esa entrada no es una de las opciones del menu o se supera el limite de intentos entonces se lanza excepcion.
      */
    public void muestraMenu() throws ClassCastException, IntentsLimitAchieveException, ObjetoEscannerNoPasadoConstructorInterfazDeUsuario {
        int intentos;
        do {
            this.menu();
            System.out.print("Inserte la opción deseada: ");
            try {
                eleccion = leeTeclado.leeSeleccionMenu();
                intentos = INTENTOS;
                while ((eleccion < 0) || (eleccion > 18)) {
                    if (intentos == 0) {
                        throw new IntentsLimitAchieveException("Se ha superado el límite de veces que el usuario puede introducir una opción no válida");
                    }
                    this.menu();
                    System.out.println("¡La opción solicitada no existe; escoja una opción entre las mostradas en el menú!");
                    System.out.print("Inserte la opción deseada (le quedan " + intentos + " intentos): ");
                    eleccion = leeTeclado.leeSeleccionMenu();
                    intentos = intentos - 1;
                }
            } catch (ClassCastException eleccionNoEsNumeroEntero) {
                throw eleccionNoEsNumeroEntero;
            } catch (NullPointerException e) {
                throw new ObjetoEscannerNoPasadoConstructorInterfazDeUsuario("La clase 'Interfaz Ususario' debe recibir un objeto de tipo 'Escanner' para funcionar correctamente");
            }
        }
        while (eleccion != 0);

        System.out.println("Adios");
    }

}