package Ejer5;
public class ReservasHotel {
    private String nombre;
    private String fecha;
    private String fechaSalida;
    private int habitacion;


    public ReservasHotel(String nombre, String fecha, String fechaSalida, int habitacion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.fechaSalida = fechaSalida;
        this.habitacion = habitacion;
    }


    public int getNumeroHabitacion() {
        return habitacion;
    }

    public String getNombre() {
    return nombre;

    }
    public String consultarReserva() {
        return "Reserva a nombre de: " + nombre + " Fecha de entrada: " + fecha + " Fecha de salida: " + fechaSalida + " Habitacion: " + habitacion;
    }

    public String nuevaReserva() {
        return "Reserva realizada por: " + nombre + " Fecha de entrada: " + fecha + " Fecha de salida: " + fechaSalida + " Habitacion: " + habitacion;
    }

    public String cancelarReserva() {
        return "Reserva cancelada por: " + nombre + " Fecha de entrada: " + fecha + " Fecha de salida: " + fechaSalida + " Habitacion: " + habitacion;
    }
}
