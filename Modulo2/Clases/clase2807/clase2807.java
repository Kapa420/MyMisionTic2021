import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class clase2807{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    List<habitante> habitantes = new ArrayList<habitante>();
    System.out.println("Hola, bienvenido.");
    int i = -1;
    while (i != 0)
    {
      System.out.println("Ingrese: ");
      System.out.println("1.Ingresar habitante.");
      System.out.println("2.Lista habitantes.");
      System.out.println("3.Generar reporte.");
      System.out.println("0.Salir.");
      i = in.nextInt();
      switch(i){
        case 1:
          System.out.print("Ingrese nombre: ");
          String nombre = in.next();
          System.out.print("Ingrese edad: ");
          int edad = in.nextInt();
          System.out.println("Ingrese sexo: ");
          System.out.println("1. Hombre ");
          System.out.println("0. Mujer ");
          int sexo = in.nextBoolean();
          if (sexo == 1){
            
          }
          System.out.println("Ingrese Estado de residencia: ");
          String Estado_Residencia = in.nextLine();
          habitante Habitante = new habitante(nombre, edad, sexo, Estado_Residencia);
          habitantes.add(Habitante);
          break;
        case 2:
          Iterator it = habitantes.iterator();
          while(it.hasNext())
          {
            System.out.print(it.next());
          }
          break;
      }

    }
  }
}
