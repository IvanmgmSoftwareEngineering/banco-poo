package General;

import Banco.Banco;
import Bolsa.BolsaDeValores;
import ExcepcionesPropias.*;


public class Simulador {
    private InterfazDeUsuario MenuYEleccion;
    private BolsaDeValores bolsa;
    private Banco banco;
    private int eleccion;
    private int constructorUtilizado;

    public Simulador() {
        this.constructorUtilizado = 0;
    }

    public Simulador(InterfazDeUsuario menuYEleccion) {
        MenuYEleccion = menuYEleccion;
        this.constructorUtilizado = 1;

    }

    public Simulador(BolsaDeValores bolsa) {
        this.bolsa = bolsa;
        this.constructorUtilizado =2;
    }

    public Simulador(InterfazDeUsuario menuYEleccion, BolsaDeValores bolsa) {
        MenuYEleccion = menuYEleccion;
        this.bolsa = bolsa;
        this.constructorUtilizado =3;
    }

    public Simulador(Banco banco) {
        this.banco = banco;
        this.constructorUtilizado =4;
    }

    public Simulador(InterfazDeUsuario menuYEleccion, Banco banco) {
        MenuYEleccion = menuYEleccion;
        this.constructorUtilizado =5;
    }

    public Simulador(BolsaDeValores bolsa, Banco banco) {
        this.bolsa = bolsa;
        this.banco = banco;
        this.constructorUtilizado =6;
    }

    public Simulador(InterfazDeUsuario menuYEleccion, BolsaDeValores bolsa, Banco banco) {
        MenuYEleccion = menuYEleccion;
        this.bolsa = bolsa;
        this.banco = banco;
        this.constructorUtilizado = 7;
    }

    public void principal() throws ObjetoInterfazDeUsuarioNoPasadoConstructorSimulador,ClassCastException, IntentsLimitAchieveException, ObjetoEscannerNoPasadoConstructorInterfazDeUsuario {

            if ((this.constructorUtilizado==0)||(this.constructorUtilizado==2)||(this.constructorUtilizado==4)||(this.constructorUtilizado==6)) {
                throw new ObjetoInterfazDeUsuarioNoPasadoConstructorSimulador("La clase 'Simulador' debe recibir un objeto de tipo 'Interfaz de Usuario' para funcionar correctamente");
            }
            MenuYEleccion.muestraMenu();
            eleccion = MenuYEleccion.getEleccion();

            if (eleccion == 1) {


            } else if (eleccion == 2) {


            } else if (eleccion == 3) {

            } else if (eleccion == 4) {

            } else if (eleccion == 5) {

            } else if (eleccion == 6) {

            } else if (eleccion == 7) {


            } else if (eleccion == 8) {

            } else if (eleccion == 9) {

            } else if (eleccion == 10) {

            } else if (eleccion == 11) {

            } else if (eleccion == 12) {

            } else if (eleccion == 13) {

            } else if (eleccion == 14) {

            } else if (eleccion == 15) {

            } else if (eleccion == 16) {

            } else if (eleccion == 17) {

            } else if (eleccion == 18) {

            }

        }

        }



















