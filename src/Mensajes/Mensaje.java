package Mensajes;

public class Mensaje {
    protected int identificador;

    protected String cadenaIdentificador() {
        return Integer.toString(identificador);
    }

    public Mensaje(int identificador) {
        this.identificador = identificador;
    }

    //public String codificar() {
        //Como mensaje no puede ser abstracta, tenemos que implementar "codificar"
        //en cada una de las clases hijas pero no podemos en la padre
    //}
}
