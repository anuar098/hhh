
package suma;
import java.util.Scanner;

/**
 *
 * @author CBN
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int num1;
        int num2;
        int resultado;
        System.out.println("ingrese el primer numero");
        num1=leer.nextInt();
        System.out.println("ingrese el segundo numero");
        num2=leer.nextInt();
        resultado = num1+num2;
        System.out.println("resultado: "+resultado);
                
    }
        
    }
    

