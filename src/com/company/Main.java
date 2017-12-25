package com.company;

import ExcepcionesPropias.IntentsLimitAchieveException;
import ExcepcionesPropias.ObjetoEscannerNoPasadoConstructorInterfazDeUsuario;
import ExcepcionesPropias.ObjetoInterfazDeUsuarioNoPasadoConstructorSimulador;
import General.Escaner;
import General.InterfazDeUsuario;
import General.Simulador;


public class Main {

    public static void main(String[] args) {
        String respuesta;

        try {
            Escaner escanner = new Escaner();
            InterfazDeUsuario interfazUsusario = new InterfazDeUsuario(escanner);
            Simulador simula = new Simulador(interfazUsusario);
            simula.principal();













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
