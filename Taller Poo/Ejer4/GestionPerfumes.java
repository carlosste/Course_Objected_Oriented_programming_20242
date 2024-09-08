package Ejer4;

public class GestionPerfumes {
    private String nombre;  
    private String marca;   
    private double capacidad;
    private double precio;

    public GestionPerfumes(String nombre, String marca, int capacidad, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.capacidad = capacidad;
        this.precio = precio;
    }

    public String aplicarPerfume(double cantidad) {
        capacidad -= cantidad;
        return "Aplicando perfume llamado: " + nombre + " de la marca: " + marca + " Queda una cantidad de: " + capacidad + " ml";
    }
public String precioPerfume() {
    return  " " + precio;
}
     
}
 

    
