package General;

import Banco.*;
import Bolsa.BolsaDeValores;
import Bolsa.Empresa;
import ExcepcionesPropias.*;
import Utilidades.*;

import java.io.IOException;


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

    public void principal() throws ClassNotFoundException,IOException, BancoNoTieneGestor,ObjetoInterfazDeUsuarioNoPasadoConstructorSimulador,ClassCastException, IntentsLimitAchieveException, ObjetoEscannerNoPasadoConstructorInterfazDeUsuario {

            if ((this.constructorUtilizado==0)||(this.constructorUtilizado==2)||(this.constructorUtilizado==4)||(this.constructorUtilizado==6)) {
                throw new ObjetoInterfazDeUsuarioNoPasadoConstructorSimulador("La clase 'Simulador' debe recibir un objeto de tipo 'Interfaz de Usuario' para funcionar correctamente");
            }
            interfaz.muestraMenu();
            eleccion = Integer.parseInt(interfaz.getEleccion());
            while (eleccion !=0) {

                if (eleccion == 1) {// IMPRIMIR ESTADO DE LOS CLIENTES
                    interfaz.muestraClientesBanco();
                    banco.showClientes();

                } else if (eleccion == 2) {//IMPRIMIR ESTADO DE LAS EMPRESAS DE LA BOLSA
                    interfaz.muestraEmpresasBanco();
                    bolsa.showEmpresas();

                } else if (eleccion == 3) {//AÑADIR UN NUEVO CLIENTE AL BANCO
                    interfaz.altaClienteBanco();
                    Cliente cliente1 = new Cliente(interfaz.getNombrePersona(), interfaz.getDni(),interfaz.getSaldo());
                    banco.addCliente(cliente1);

                } else if (eleccion == 4) {//ELIMINAR A UN CLIENTE DEL BANCO
                    interfaz.bajaClienteBanco();
                    banco.removeCliente(interfaz.getDni());

                } else if (eleccion == 5) {//REALIZAR COPIA DE SEGURIDAD DEL BANCO (CLIENTES)
                    if(banco.getClientes().size()==0) System.out.println("El Banco no tiene clientes. No se puede guardar nada.");
                    else {
                        Output serializa = new Output();
                        interfaz.hazCopiaSeguridadBanco();
                        banco.copiaSeguridadBanco(interfaz.getPath(),serializa);
                        System.out.println("Copia realizada con exito.");
                        System.out.println();
                    }

                } else if (eleccion == 6) {//RESTAURAR COPIA DE SEGURIDAD DEL BANCO (CLIENTES)
                    Input deserializa = new Input();
                    interfaz.restauraCopiaSeguridadBanco();
                    banco.restaurarCopiaSeguridadClientes(interfaz.getPath(),deserializa);
                    System.out.println("Restauración realizada con exito.");
                    System.out.println();

                } else if (eleccion == 7) { //MEJORAR A CLIENTE PREMIUM
                    interfaz.promocionaPremium();
                    banco.promocionAClientePremium(interfaz.getDni());

                } else if (eleccion == 8) {//SOLICITA RECOMENDACION DE INVERSION AL GESTOR

                } else if (eleccion == 9) {//AÑADIR EMPRESA A LA BOLSA
                    interfaz.altaEmpresaBolsa();
                    Empresa empresa1 = new Empresa(interfaz.getNombreEmpresa(), interfaz.getValorActualEmpresa());
                    bolsa.addEmpresa(empresa1);

                } else if (eleccion == 10) { //ELIMINAR EMPRESA DE LA BOLSA
                    interfaz.bajaEmpresaBolsa();
                    bolsa.removeEmpresa(interfaz.getNombreEmpresa());

                } else if (eleccion == 11) {//ACTUALIZAR VALORES

                } else if (eleccion == 12) {//REALIZAR COPIA DE SEGURIDAD BOLSA (EMPRESAS)
                    if(bolsa.getEmpresas().size()==0) System.out.println("la Bolsa no tiene empresas. No se puede guardar nada disco.");
                    else {
                        Output serializa = new Output();
                        interfaz.hazCopiaSeguridadBolsa();
                        bolsa.copiaSeguridadEmpresas(interfaz.getPath(), serializa);
                        System.out.println("Copia realizada con exito.");
                        System.out.println();
                    }

                } else if (eleccion == 13) {//RESTAURAR COPIA DE SEGURIDAD DE LA BOLSA (EMPRESAS)
                    Input deserializa = new Input();
                    interfaz.restauraCopiaSeguridadBolsa();
                    bolsa.restaurarCopiaSeguridadEmpresas(interfaz.getPath(),deserializa);
                    System.out.println("Restauración realizada con exito.");
                    System.out.println();


                } else if (eleccion == 14) {//SOLICITAR COMPRA DE ACCIONES

                } else if (eleccion == 15) {//SOLICITAR VENTA DE ACCIONES

                } else if (eleccion == 16) {//SOLICITAR ACTUALIZACION DE VALORES DE LAS CARTERAS DE UN CLIENTE

                } else if (eleccion == 17) {//IMPRIMIR OPERACIONES PENDIENTES

                } else if (eleccion == 18) {//EJECUTAR OPERACIONES PENDIENTES

                }
                System.out.println();
                System.out.print("Pulse la tecla ENTER para volver al MENU");
                interfaz.leeTeclado.leeDatos();
                interfaz.muestraMenu();
                eleccion = Integer.parseInt(interfaz.getEleccion());
            }
            System.out.println("Adios");



    }

        }



















