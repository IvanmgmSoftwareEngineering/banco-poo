package Bolsa;

import java.util.HashSet;
import java.util.Iterator;

public class BolsaDeValores {
    private String nombre;
    private HashSet<Empresa> empresas;

    public BolsaDeValores(String nombre) {
        this.nombre = nombre;
    }

    public BolsaDeValores(String nombre, Empresa empresa) {
        this.nombre = nombre;
        empresas.add(empresa);
    }

    public void addEmpresa(Empresa empresa){
        if(!empresas.add(empresa)) System.out.println("La empresa que ha intendado añadir YA esta presente en la bolsa");
        else System.out.println("Empresa añadida con exito!");
    }

    public void removeEmpresa (String nombreEmpresa){
        if(!empresas.remove(nombreEmpresa)) System.out.println("La empresa que ha intendado borrar NO esta presente en la bolsa");
        else System.out.println("Empresa eliminada con exito!");

    }

    public void showEmpresas(){
        Iterator iterador = empresas.iterator();
        while(iterador.hasNext()){
            Empresa empresa = (Empresa)iterador.next();
            System.out.println(empresa.toString());
        }

    }

}
