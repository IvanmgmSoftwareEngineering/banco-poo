package ExcepcionesPropias;

public class BancoNoTieneGestor extends Exception {

    public BancoNoTieneGestor(String message) {
        super(message);
    }
}
