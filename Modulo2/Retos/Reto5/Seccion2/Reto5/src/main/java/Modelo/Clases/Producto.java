/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Clases;

/**
 *
 * @author ankar
 */
public class Producto {

    private int ID;
    private String nombre;
    private int cantidad;
    private String categoria;
    private double precio;

    public Producto() {
        this.ID = 0;
        this.nombre = null;
        this.cantidad = 0;
        this.categoria = null;
        this.precio = 0;

    }

    public Producto(
            int ID, String nombre,
            int cantidad, String categoria,
            double precio
    ) {
        this.ID = ID;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.precio = precio;
    }

    public void setID(int id) {
        this.ID = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + ID + ", nombre=" + nombre + ", cantidad=" + cantidad + ", categoria=" + categoria + ", precio=" + precio + '}';
    }
}
