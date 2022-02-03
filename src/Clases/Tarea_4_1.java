
package Clases;

/**
 *
 * @author Roy Palomino
 */
public class Tarea_4_1 {

    public static void main(String[] args) {
        Persona p1=new Cliente();
        p1.setNombre("Juan");
        p1.tipoPersona();
        p1.consultar();
        Persona p2=new Empleado();
        p2.setNombre("Jose");
        p2.tipoPersona();
        p2.consultar();
    }
    
}
