import java.util.TreeSet;
import java.util.SortedSet;

public class Usuario{
  SortedSet<String> telefono = new TreeSet<String>();
  public void addTelefono(String Telefono){
    telefono.add(Telefono);
  }
  public void mostrarTelefonos(){
    System.out.println(telefono);
  }
}
