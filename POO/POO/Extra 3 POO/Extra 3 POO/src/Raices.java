
import Servicio.ServicioRaices;
import java.util.Scanner;



/**
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor.
* 
* Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b
 */
public class Raices {

    public static void main(String[] args) {
        
        ServicioRaices serviceRow = new ServicioRaices();
        Entidad.Raices equation = serviceRow.crearRaiz();
        
        serviceRow.calcular(equation);
    }
    
}
