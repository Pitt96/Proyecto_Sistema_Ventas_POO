
package Clases;

/**
 *
 * @author Roy Palomino
 */
public abstract class Persona {
    private String Nombre;
    
    
    public Persona(){
    }
    public abstract void tipoPersona();
    public abstract void consultar();

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}
