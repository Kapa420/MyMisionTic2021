import java.util.Scanner;

public class clase0107{
public static void main(String[] args) {
  int categoria, edad, copago=0;
  System.out.println("Ingrese su categoria");
  Scanner input = new Scanner(System.in);
  categoria = input.nextInt();
  System.out.println("Ingrese su edad");
  edad = input.nextInt();
  switch(categoria) {
    case 1:
      if((edad >= 60 && edad < 90)|| (edad < 15)  ) {
        copago = 0;
      }
      else if(edad > 15 && edad < 60)
      {
      copago = 500;
      }
      break;
      case 2:
      copago = 1000;
      break;
    case 3:
      copago = 1000;
      break;
    case 4:
      copago = 1000;
      break;
    case 0:
    copago = 0;
      break;
    default:
      if(edad > 18 && edad < 80)
      {
      copago = 5000;
      }
  }
  System.out.print("Su edad es: ");
  System.out.println(edad);
  System.out.print("Su categoria es: ");
  System.out.println(categoria);
  System.out.print("Su copago es: ");
  System.out.println(copago);
}
}
