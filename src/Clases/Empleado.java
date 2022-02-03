
package Clases;

/**
 *
 * @author Roy Palomino
 */
public class Empleado extends Persona{
    public Empleado(){
        super();
    }
    @Override
    public void consultar() {
        System.out.println("Bienvenido "+super.getNombre());
        System.out.println("Consulta a los demas para cuadrar caja.");
    }

    @Override
    public void tipoPersona() {
        
        System.out.println("*****************************EMPLEADO*****************************");
    }
    
}
