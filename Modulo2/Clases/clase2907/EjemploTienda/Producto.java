public class Producto {
    //Atributos
    private String nombre;
    private double precio;

    //Constructor

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //Setters and Getters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.equals("")) {
            System.out.println("Valor incorrecto");
        }else{
            this.nombre = nombre;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio <= 0) {
            System.out.println("El valor es incorrecto");
        }else{
            this.precio = precio;
        }
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }


}
