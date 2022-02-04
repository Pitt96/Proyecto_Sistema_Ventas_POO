package Clases;

import Interfaces.Acciones;

/**
 *
 * @author Roy Palomino
 */
public class Cajero implements Acciones{
    private String Nombre;

    public Cajero(String Nombre) {
        this.Nombre = Nombre;
    }
    @Override
    public void Informar() {
        System.out.println(this.Nombre+" Informa al cliente.");
    }

    @Override
    public void Consultar() {
        System.out.println(this.Nombre+" Consulta a la base de datos.");
    }
    
    holahola
}
