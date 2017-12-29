package Banco;

import java.io.Serializable;
import java.util.HashSet;

public class Cliente extends Persona {
    protected float saldo;
    protected  boolean esPremium;
    protected HashSet<PaqueteDeAcciones> paquetesAcciones;

    public Cliente(String nombre, String dni, float saldo) {
        super(nombre, dni);
        this.saldo = saldo;
        this.esPremium = false;
    }

    // Este constructor esta para poder ser llamado desde la clase hija 'ClientePremium'
    public Cliente(String nombre, String dni, float saldo,boolean esPremium) {
        super(nombre, dni);
        this.saldo = saldo;
        this.esPremium = esPremium;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public boolean isEsPremium() {
        return this.esPremium;
    }





    public String toString (){
        //faltan añadir las acciones entre saldo y acciones
            return "Nombre Cliente: "+this.nombre + "  ||||  dni: "+this.dni +"  ||||Saldo: "+ this.saldo+ "    |||| Categoria: NO Premium"+"\n";
    }

    @Override
    public boolean equals (Object o) {
        if(o instanceof Cliente) {
            Cliente cliente = (Cliente) o;
            return this.dni.equals(cliente.dni);
        }
        else return false;

    }
    @Override
    public int hashCode(){
        return this.dni.length();
    }
}
