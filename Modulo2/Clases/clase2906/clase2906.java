import java.util.Scanner;
import javax.swing.JOptionPane;

public class clase2906{

  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    String nombre = input.nextLine();
    System.out.println("Hola mundo: " + nombre);
    JOptionPane.showMessageDialog(null, "Programacion en Java","Pregunta",
                JOptionPane.QUESTION_MESSAGE);

    nombre = JOptionPane.showInputDialog("Ingrese su nombre");
    JOptionPane.showMessageDialog(null, "Hola mundo: "+ nombre);
  }
}
