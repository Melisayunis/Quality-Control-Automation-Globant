
import java.util.Scanner;


/**
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
 */
public class Cancion {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese los siguientes datos de la cancion: ");
        System.out.println("Titulo: ");
        String tittle = read.nextLine();
        System.out.println("Autor: ");
        String autor = read.nextLine();
        
        Cancion song = new Cancion(tittle, autor);
        
        System.out.println("----------------");
        System.out.println("La cancion ingresada es: " + song.getTitulo());
        System.out.println("Y su autor es: " + song.getAutor());
        System.out.println("----------------");
    }

    private String titulo;
    private String autor;

    public Cancion() {
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
