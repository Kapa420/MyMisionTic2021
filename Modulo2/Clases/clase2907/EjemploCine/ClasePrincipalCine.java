import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author JUAN MARIÑO AND CIRO GAMBOA
 *
 *Un cine de un pueblo pequeño nos propone hacer una aplicación para controlar las personas de una cola de un cine en los grandes estrenos de películas.
 *
 *Un conjunto de personas esperarán la cola para sacar una entrada, tendremos que calcular la entrada según la edad de la persona (minimo 5 años). Entre 5 y 10 años pagan 1 dolar, entre 11 y 17 pagarán 2.5 dólares y los mayores de 18 pagarán 3.5 dólares.
 *
 *Al final, deberemos mostrar la cantidad total recaudada.
 */
public class ClasePrincipalCine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Persona> colaCine = new ArrayList<Persona>();
        Scanner miTeclado = new Scanner(System.in);
        int opcion = -1;
        while(opcion != 0){
            System.out.println("Ingrese:");
            System.out.println("1. Para ingresar persona a la cola");
            System.out.println("2. Para mostrar personas en la cola");
            System.out.println("3. Para mostrar dinero recaudado");
            System.out.println("0. Para salir");
            opcion = miTeclado.nextInt();
            switch(opcion){
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    String nombre = miTeclado.next();
                    System.out.print("Ingrese la edad: ");
                    int edad = miTeclado.nextInt();
                    System.out.print("Ingrese el número de identificación: ");
                    String dni = miTeclado.next();
                    Persona persona = new Persona(nombre, edad, dni);
                    colaCine.add(persona);
                    System.out.println("La persona añadida a la cola es: "+persona);
                    break;
                case 2:
                    Iterator i = colaCine.iterator();
                    while (i.hasNext()) {
                        System.out.println(i.next());
                    }
                    break;
                case 3:
                    double recaudo = 0;
                    for (int j = 0; j < colaCine.size(); j++) {
                        recaudo += colaCine.get(j).obtenerPrecioBoleta();
                    }
                    System.out.println("El dinero recaudado es: "+recaudo);
                    break;
                case 0:
                    System.out.println("Usted Salió");
                    break;
                default:
                    System.out.println("Valor incorrecto");
                    break;
            }
            System.out.println("**********************************************");
        }
    }

}
