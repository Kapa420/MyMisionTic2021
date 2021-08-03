public class Venta {
    //Atributos
    private Producto producto;
    private int cantidad;

    //Constructor
    public Venta(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Venta{" + "producto=" + producto + ", cantidad=" + cantidad + '}';
    }

    public double obtenerPrecioUnitario(){
        return this.producto.getPrecio();//Obtener el precio de cada producto que se almacena en el objeto producto
    }


    public double obtenerPrecioTotal(){
        return this.obtenerPrecioUnitario()*this.cantidad;//Para obtener el precio de todos los productos de la venta
    }

    public String obtenerNombre(){
        return this.producto.getNombre();
    }
}
