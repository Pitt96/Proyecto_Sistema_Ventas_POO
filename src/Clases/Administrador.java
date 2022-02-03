package Clases;

import Interfaces.Acciones;

/**
 *
 * @author Roy Palomino
 */
public class Administrador implements Acciones{
    private String Nombre;

    public Administrador(String Nombre) {
        this.Nombre = Nombre;
    }
    @Override
    public void Informar() {
        System.out.println(this.Nombre+" Reaiza un informe general.");
    }

    @Override
    public void Consultar() {
        System.out.println(this.Nombre+" Consulta la base de datos.");
    }
    
    
}
