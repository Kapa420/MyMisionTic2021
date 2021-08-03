import javax.swing.JOptionPane;

public class clase0107_2{
  public static void main(String[] args) {
    int categoria; double sueldo=0, sueldo_base = 500000;
    categoria = Integer.parseInt
                (JOptionPane.showInputDialog("Ingrese su categoria"));
    switch(categoria){
      case 1:
      sueldo = sueldo_base + (sueldo_base * (0.1));
      break;
      case 2:
      sueldo = sueldo_base + (sueldo_base * (0.05));
      break;
    }
    JOptionPane.showMessageDialog(null, "Su sueldo es: "+ sueldo);
  }
}
