package Banco;

public class ClientePremium extends Cliente {// Esta clase permite a un cliente normal hacerle premium
    private String nombreGestorDeInversiones;


    public ClientePremium(String nombre, String dni, float saldo) {
        super(nombre, dni, saldo, true);
    }

    public ClientePremium(String nombre, String dni, float saldo, String nombreGestorDeInversiones) {
                super(nombre, dni, saldo,true);
                this.nombreGestorDeInversiones = nombreGestorDeInversiones;
    }

    public ClientePremium(Cliente clienteOrigen, String nombreGestorDeInversiones) {
                super(clienteOrigen.nombre, clienteOrigen.dni, clienteOrigen.saldo,true);
                this.nombreGestorDeInversiones = nombreGestorDeInversiones;
    }

    public String getNombreGestorDeInversiones() {
        return nombreGestorDeInversiones;
    }

    @Override
    public String toString() {
        //faltan añadir las acciones entre saldo y acciones
         return "Nombre Cliente: "+this.nombre + "  ||||  dni: "+this.dni +"  ||||Saldo: "+ this.saldo + "    ||||Categoria: Premium " +"    ||||Nombre Gestor: "+nombreGestorDeInversiones ;
    }
}






