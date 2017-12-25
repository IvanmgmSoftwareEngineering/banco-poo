package Banco;
import Bolsa.Empresa;
public class PaqueteDeAcciones {
    private int numeroAcciones;
    private Empresa empresa;

    public PaqueteDeAcciones(int numeroAcciones) {
        this.numeroAcciones = numeroAcciones;
    }

    public int getNumeroAcciones() {
        return numeroAcciones;
    }

    public double calculaValorPaquete(Empresa empresa){

        return empresa.getValorTituloActual()*this.numeroAcciones;


    }
}
