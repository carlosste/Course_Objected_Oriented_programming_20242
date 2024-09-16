package Ejer3;

public class ManejoInventario {
    
private String nombre;
private int codigo;
private int cantidadStock;
private double precio;


    public ManejoInventario(String nombre, int codigo, int cantidadStock, double precio){
    this.nombre = nombre;
    this.codigo = codigo;
    this.cantidadStock = cantidadStock;
    this.precio = precio;
    }

    public String vender(int cantidad){
    if (cantidad <= cantidadStock){
        cantidadStock -= cantidad;
        return "Venta exitosa de" + nombre  ;
    }
    else{
        return "No hay suficiente en stock";
    }

    }

    public String comprar(int cantidad){
    cantidadStock += cantidad;
    return "Compra exitosa de" + nombre;    


    }
    public int getCantidadStock(){
        return cantidadStock;
    }
}
