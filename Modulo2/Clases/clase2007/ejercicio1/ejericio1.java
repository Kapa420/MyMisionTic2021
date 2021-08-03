import java.util.Scanner;

public class ejericio1{
  public static void main(String[] args) {
    int usr = 1;
    Scanner in = new Scanner(System.in);
    while(usr > 0){
      double precio = in.nextDouble();
      if(usr <= 10)
      {
        precio *= (0.3);
        System.out.println("Precio final es: " + String.valueOf(precio));
      }
      else if(usr <= 10)
      {
        precio *= (0.15);
        System.out.println("Precio final es: " + String.valueOf(precio));
      }
      else
      {
        System.out.println("Precio final es: " + String.valueOf(precio));
      }
      usr++;
    }

  }
}
