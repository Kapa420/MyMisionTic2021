/**
 *
 * @author JUAN MARIÑO AND CIRO GAMBOA
 */
public class Persona {
    //Atributos
    private String nombre;
    private int edad;
    private String dni;

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + '}';
    }

    public double obtenerPrecioBoleta(){
        double precio = 0;
        if (this.edad >= 5 && this.edad <= 10) {
            precio = 1;
        }else if(this.edad >= 11 && this.edad <= 17){
            precio = 2.5;
        }else if(this.edad >= 18){
            precio = 3.5;
        }else{
            precio = 0;
        }
        return precio;
    }
}
