package Bolsa;

public class Empresa {
    private String nombre;
    private  double valorTituloActual;
    private  double valorTituloPrevio;

    public Empresa(String nombre, double valorTituloActual) {
        this.nombre = nombre;
        this.valorTituloActual = valorTituloActual;
        this.valorTituloPrevio= valorTituloActual;
    }

    public String getNombre() {
        return nombre;
    }

    public double getValorTituloActual() {
        return this.valorTituloActual;
    }

    public double getValorTituloPrevio() {
        return valorTituloPrevio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setValorTituloActual(double valorTituloActual) {
        this.valorTituloActual = valorTituloActual;
    }

    public void setValorTituloPrevio(double valorTituloPrevio) {
        this.valorTituloPrevio = valorTituloPrevio;
    }
}
