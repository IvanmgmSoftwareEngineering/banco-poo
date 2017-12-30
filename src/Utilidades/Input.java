package Utilidades;

import java.io.*;
import Banco.*;
import Bolsa.*;

public class Input { //DESSERIALIZA

    private FileInputStream file;
    private ObjectInputStream input;

    //Abrimos el fichero
    public void abrir(String path) throws IOException{

        file = new FileInputStream(path);
        input = new ObjectInputStream(file);

    }
    //Leer el fichero un Cliente
    public Cliente leerCliente ()throws IOException,ClassNotFoundException{

        Cliente cliente = null;
        if (input!=null) {
            try{
                cliente = (Cliente) input.readObject();

            }

            catch ( EOFException eof){
                //Fin del fichero
            }
        }
        return cliente;
    }

    //Leer el fichero una Empresa
    public Empresa leerEmpresa()throws IOException,ClassNotFoundException{

        Empresa empresa = null;
        if (input!=null) {
            try{
                empresa = (Empresa) input.readObject();
            }

            catch ( EOFException eof){
                //Fin del fichero
            }
        }
        return empresa;
    }

    //Cerramos el fichero
    public void cerrar ()throws IOException{
        if (input!=null) input.close();
    }

}