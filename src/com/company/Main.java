package com.company;

import ExcepcionesPropias.*;
import General.*;
import Bolsa.*;
import Banco.*;


public class Main {

    public static void main(String[] args) {
        String respuesta;

        try {
            Escaner escanner = new Escaner();//Creamo un objeto de tipo Escaner
            InterfazDeUsuario interfazUsusario = new InterfazDeUsuario(escanner); //creamos un objeto de tipo InterfazDeUsuario y utilizamos el contructor que recibe un parametro de entrada de tipo Escaner
            BolsaDeValores bolsa = new BolsaDeValores ("Bolsa Española");//Creamos un objeto de tipo BolsaDeValores.
            Banco banco = new Banco ("Banco Bilbao Vizcaya");//Creamos un banco
            Simulador simula = new Simulador(interfazUsusario,bolsa,banco); // Creamos un objeto de tipo Simulador y utilizamos el constructor que recibe como parmatros de entrada un objeto de tipo InterfazDeUsuario y un objeto de tipo BolsaDeValores9
            simula.principal();// Llamamos al metodo principal() de la clase Simulador.



            respuesta="Programa terminado con exito!!";
        }
        catch (IntentsLimitAchieveException e1){
            respuesta = e1.getMessage();
        }
        catch (ClassCastException castException){
            respuesta = "La opción debe ser numérica";
        }
        catch (ObjetoEscannerNoPasadoConstructorInterfazDeUsuario e2) {
            respuesta = e2.getMessage();
        }
        catch (ObjetoInterfazDeUsuarioNoPasadoConstructorSimulador e3) {
            respuesta = e3.getMessage();
        }

        System.err.println(respuesta);


    }
}
