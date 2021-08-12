/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Clases.Producto;
import Modelo.Persistencia.CRUD;
import Modelo.Persistencia.DbConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JUAN MARIÑO
 */
public abstract class Controller {

    public static boolean registrarProducto
        (
         String nombre, 
         int cantidad, 
         String categoria, 
         double precio
        ) 
        throws SQLException 
        {
        Producto pr = new Producto(0, nombre, cantidad, categoria, precio);
        CRUD.setConnection(DbConnection.ConexionBD()); //Establece conexion con bd
        String sentencia = "INSERT INTO productos(nombre,cantidad,categoria, precio) "
                + " VALUES ('" + pr.getNombre()+ "','" 
                               + pr.getCantidad()+ "','" 
                               + pr.getCategoria()+ "','"
                               + pr.getPrecio() + "');";
        if (CRUD.setAutoCommitBD(false)) {
            if (CRUD.insertarBD(sentencia)) {
                CRUD.commitBD();
                CRUD.cerrarConexion();
                return true;
            } else {
                CRUD.rollbackBD();
                CRUD.cerrarConexion();
                return false;
            }
        } else {
            CRUD.cerrarConexion();
            return false;
        }
    }

    public static boolean actualizarProducto
        (
         int ID,
         String nombre, 
         int cantidad, 
         String categoria, 
         double precio
        ) 
            {
        Producto pr = new Producto(ID, nombre, cantidad, categoria, precio);
        CRUD.setConnection(DbConnection.ConexionBD());
        String Sentencia = "UPDATE `productos` SET nombre='" + pr.getNombre() 
                + "',cantidad='" + pr.getCantidad()
                + "',categoria='" + pr.getCategoria()
                + "',precio='" + pr.getPrecio()
                + "' WHERE id=" + pr.getID()+ ";";
        if (CRUD.setAutoCommitBD(false)) {
            if (CRUD.actualizarBD(Sentencia)) {
                CRUD.commitBD();
                CRUD.cerrarConexion();
                return true;
            } else {
                CRUD.rollbackBD();
                CRUD.cerrarConexion();
                return false;
            }
        } else {
            CRUD.cerrarConexion();
            return false;
        }
    }

    public static boolean borrarProducto(int id) {
        CRUD.setConnection(DbConnection.ConexionBD());
        String Sentencia = "DELETE FROM `productos` WHERE `id`='" + id + "';";
        if (CRUD.setAutoCommitBD(false)) {
            if (CRUD.actualizarBD(Sentencia)) {
                CRUD.commitBD();
                CRUD.cerrarConexion();
                return true;
            } else {
                CRUD.rollbackBD();
                CRUD.cerrarConexion();
                return false;
            }
        } else {
            CRUD.cerrarConexion();
            return false;
        }
    }

    public static Producto obtenerProducto(int id) {
        CRUD.setConnection(DbConnection.ConexionBD());
        String sql = "select * from productos where id=" + id + "";
        ResultSet rs = CRUD.consultarBD(sql);
        Producto pr = new Producto();
        try {
            if (rs.next()) {
                pr.setID(rs.getInt("ID"));
                pr.setNombre(rs.getString("nombre"));
                pr.setCantidad(rs.getInt("cantidad"));
                pr.setCategoria(rs.getString("categoria"));
                pr.setPrecio(rs.getDouble("precio"));

                CRUD.cerrarConexion();
            } else {
                CRUD.cerrarConexion();
                return null;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
        return pr;
    }

    public static List<Producto> listarProductos() {
        CRUD.setConnection(DbConnection.ConexionBD());
        List<Producto> listaProductos = new ArrayList<>();
        try {
            String sql = "select * from productos";

            ResultSet rs = CRUD.consultarBD(sql);
            
            while (rs.next()) {
                Producto pr = new Producto();
                pr.setID(rs.getInt("ID"));
                pr.setNombre(rs.getString("nombre"));
                pr.setCantidad(rs.getInt("cantidad"));
                pr.setCategoria(rs.getString("categoria"));
                pr.setPrecio(rs.getDouble("precio"));
                listaProductos.add(pr);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            CRUD.cerrarConexion();
        }

        return listaProductos;
    }

}
