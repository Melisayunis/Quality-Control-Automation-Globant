
import java.util.Scanner;

/**
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. 
* A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. 
* El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
public class MesSecreto {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean exit = true;
        String monthUser;
        
        String[] month = {"enero", "febrero" , "marzo" , "abril" , "mayo" , 
            "junio" , "julio" , "agosto" , "septiembre" , "octubre" , "noviembre" , "diciembre"};
        String secretMonth = month[(int) (Math.random() *12)];
        
        System.out.println("Adivine el mes secreto. " 
                + "\n   Introduzca el nombre del mes: ");
        monthUser = read.nextLine().toLowerCase();
        
        do {
            if (secretMonth.equals(monthUser)) {
                System.out.println("Felicidades, ha adivinado el mes secreto. Era " + secretMonth);
                System.out.println(" :D");
                exit = false;
            } else {
                System.out.println("El mes ingresado no es el mes secreto. Intentelo nuevamente!");
                monthUser = read.nextLine().toLowerCase();
            }
        } while (exit);
    }
    
}
