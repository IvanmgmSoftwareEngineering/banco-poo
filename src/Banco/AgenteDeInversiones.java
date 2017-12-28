package Banco;

import Bolsa.BolsaDeValores;

public class AgenteDeInversiones extends Persona {
    private BolsaDeValores bolsa;



    public AgenteDeInversiones(String nombre, String dni) {
        super(nombre, dni);
    }

    public AgenteDeInversiones(String nombre, String dni, BolsaDeValores bolsa) {
        super(nombre, dni);
        this.bolsa = bolsa;
    }






}
