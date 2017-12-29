package Utilidades;

import java.io.*;
import Banco.*;
import Bolsa.*;

public class Output { //SERIALIZA

    private FileOutputStream file;
    private ObjectOutputStream output;

    //Abrimos el fichero
    public void abrir(String path) throws IOException{

        file = new FileOutputStream(path);
        output = new ObjectOutputStream(file);

    }
    //Escribir el fichero un Cliente
    public void escribirCliente (Cliente cliente)throws IOException{
        if (output!=null) output.writeObject(cliente);
    }

    //Escribir el fichero una Empresa
    public void escribirEmpresa(Empresa empresa)throws IOException{
        if (output!=null) output.writeObject(empresa);
    }

    //Cerramos el fichero
    public void cerrar ()throws IOException{
        if (output!=null) output.close();
    }

}
