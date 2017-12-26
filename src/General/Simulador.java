package General;

import Banco.*;
import Bolsa.BolsaDeValores;
import Bolsa.Empresa;
import ExcepcionesPropias.*;


public class Simulador {

    private InterfazDeUsuario interfaz;
    private BolsaDeValores bolsa;
    private Banco banco;
    private int eleccion;
    private int constructorUtilizado;

    public Simulador() {
        this.constructorUtilizado = 0;
    }

    public Simulador(InterfazDeUsuario menuYEleccion) {
        interfaz = menuYEleccion;
        this.constructorUtilizado = 1;

    }

    public Simulador(BolsaDeValores bolsa) {
        this.bolsa = bolsa;
        this.constructorUtilizado =2;
    }

    public Simulador(InterfazDeUsuario menuYEleccion, BolsaDeValores bolsa) {
        interfaz = menuYEleccion;
        this.bolsa = bolsa;
        this.constructorUtilizado =3;
    }

    public Simulador(Banco banco) {
        this.banco = banco;
        this.constructorUtilizado =4;
    }

    public Simulador(InterfazDeUsuario menuYEleccion, Banco banco) {
        interfaz = menuYEleccion;
        this.constructorUtilizado =5;
    }

    public Simulador(BolsaDeValores bolsa, Banco banco) {
        this.bolsa = bolsa;
        this.banco = banco;
        this.constructorUtilizado =6;
    }

    public Simulador(InterfazDeUsuario menuYEleccion, BolsaDeValores bolsa, Banco banco) {
        interfaz = menuYEleccion;
        this.bolsa = bolsa;
        this.banco = banco;
        this.constructorUtilizado = 7;
    }

    public void principal() throws ObjetoInterfazDeUsuarioNoPasadoConstructorSimulador,ClassCastException, IntentsLimitAchieveException, ObjetoEscannerNoPasadoConstructorInterfazDeUsuario {

            if ((this.constructorUtilizado==0)||(this.constructorUtilizado==2)||(this.constructorUtilizado==4)||(this.constructorUtilizado==6)) {
                throw new ObjetoInterfazDeUsuarioNoPasadoConstructorSimulador("La clase 'Simulador' debe recibir un objeto de tipo 'Interfaz de Usuario' para funcionar correctamente");
            }
            interfaz.muestraMenu();
            eleccion = interfaz.getEleccion();
            while (eleccion !=0) {
                if (eleccion == 1) {
                    banco.showClientes();
                    System.out.print("Pulse la tecla ENTER para volver al MENU");
                    interfaz.leeTeclado.leeDatos();



                } else if (eleccion == 2) {
                    bolsa.showEmpresas();
                    System.out.print("Pulse la tecla ENTER para volver al MENU");
                    interfaz.leeTeclado.leeDatos();

                } else if (eleccion == 3) {
                    interfaz.AltaClienteBanco();
                    Cliente cliente1 = new Cliente(interfaz.getNombrePersona(), interfaz.getDni(),interfaz.getSaldo());
                    banco.addCliente(cliente1);
                    System.out.print("Pulse la tecla ENTER para volver al MENU");
                    interfaz.leeTeclado.leeDatos();

                } else if (eleccion == 4) {
                    interfaz.BajaClienteBanco();
                    banco.removeCliente(interfaz.getDni());
                    System.out.print("Pulse la tecla ENTER para volver al MENU");
                    interfaz.leeTeclado.leeDatos();


                } else if (eleccion == 5) {

                } else if (eleccion == 6) {

                } else if (eleccion == 7) {


                } else if (eleccion == 8) {

                } else if (eleccion == 9) {
                    interfaz.AltaEmpresaBolsa();
                    Empresa empresa1 = new Empresa(interfaz.getNombreEmpresa(), interfaz.getValorActualEmpresa());
                    bolsa.addEmpresa(empresa1);
                    System.out.print("Pulse la tecla ENTER para volver al MENU");
                    interfaz.leeTeclado.leeDatos();

                } else if (eleccion == 10) {
                    interfaz.BajaEmpresaBolsa();
                    bolsa.removeEmpresa(interfaz.getNombreEmpresa());
                    System.out.print("Pulse la tecla ENTER para volver al MENU");
                    interfaz.leeTeclado.leeDatos();

                } else if (eleccion == 11) {

                } else if (eleccion == 12) {

                } else if (eleccion == 13) {

                } else if (eleccion == 14) {

                } else if (eleccion == 15) {

                } else if (eleccion == 16) {

                } else if (eleccion == 17) {

                } else if (eleccion == 18) {

                }
                interfaz.muestraMenu();
                eleccion = interfaz.getEleccion();
            }
            System.out.println("Adios");



    }

        }



















