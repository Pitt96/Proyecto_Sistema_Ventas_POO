
package Clases;

/**
 *
 * @author Roy Palomino
 */
public class Cliente extends Persona{
    public Cliente(){
        super();
        
    }
    @Override
    public void tipoPersona() {
        System.out.println("**************************CLIENTE**************************");
        
    }
    @Override
    public void consultar() {
        System.out.println("Bienvenido "+super.getNombre());
        System.out.println("Consulta para comprar un producto.");
    }

    
    
}
