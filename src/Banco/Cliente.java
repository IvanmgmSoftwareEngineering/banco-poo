package Banco;

import java.util.ArrayList;

public class Cliente extends Persona {
    protected double saldo;
    protected  boolean esPremium;
    protected ArrayList<PaqueteDeAcciones> acciones;

    public Cliente(String nombre, String dni, double saldo) {
        super(nombre, dni);
        this.saldo = saldo;
        this.esPremium = false;
    }

    // Este constructor esta para poder ser llamado desde la clase hija 'ClientePremium'
    public Cliente(String nombre, String dni, double saldo,boolean esPremium) {
        super(nombre, dni);
        this.saldo = saldo;
        this.esPremium = esPremium;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean isEsPremium() {
        return this.esPremium;
    }
}
