package Clases;

/**
 *
 * @author Roy Palomino
 */
public class Tarea_4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Administrador a1=new Administrador("Roy");
        Cajero c1=new Cajero("Alex");
        
        System.out.println("***********Administrador***********");
        a1.Consultar();
        a1.Informar();
        System.out.println("***********Cajero***********");
        c1.Consultar();
        c1.Informar();
    }
    
}
