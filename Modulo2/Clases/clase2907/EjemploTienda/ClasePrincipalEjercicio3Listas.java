import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author JUAN MARIÑO
 */
public class ClasePrincipalEjercicio3Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner miTeclado = new Scanner(System.in);
        List<Venta> compra = new ArrayList<Venta>();
        int condicion = -1;
        while(condicion != 0){
            System.out.println("Ingrese:");
            System.out.println("1. Para registrar producto");
            System.out.println("2. Para mostrar productos");
            System.out.println("3. Para mostrar total");
            System.out.println("0. Para salir");
            System.out.print("Digite su valor: ");
            condicion = miTeclado.nextInt();
            switch(condicion){
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = miTeclado.next();
                    System.out.print("Inrese el precio: ");
                    double precio = miTeclado.nextDouble();
                    System.out.print("Ingrese la cantidad de esos productos: ");
                    int cantidad = miTeclado.nextInt();
                    Producto producto = new Producto(nombre, precio);
                    Venta venta = new Venta(producto, cantidad);
                    compra.add(venta);
                    System.out.println("Registro exitoso");
                    break;
                case 2:
                    System.out.println("***********Cantidad****Precio*****Total");
                    for (int i = 0; i < compra.size(); i++) {
                        Venta venta2 = compra.get(i);
                        System.out.println(venta2.obtenerNombre()+"    "+venta2.getCantidad()+"      "+venta2.obtenerPrecioUnitario()+"      "+venta2.obtenerPrecioTotal());
                    }
                    break;
                case 3:
                    double total = 0;
                    for (int i = 0; i < compra.size(); i++) {
                        total += compra.get(i).obtenerPrecioTotal();
                    }
                    System.out.println("El total es: "+total);
                    break;
                case 0:
                    System.out.println("Usted Salió");
                    break;
                default:
                    System.out.println("Valor incorrecto");
                    break;
            }
            System.out.println("-------------------------------------------");
        }
    }

}
