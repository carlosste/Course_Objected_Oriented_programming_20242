package Ejer5;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.List;

public class Ejer5 {


    public static void main (String[] args) {

    ReservasHotel reserva1 = new ReservasHotel("Juan","14 de agosto de 2024" ,"20 de agosto de 2024" , 103);
    ReservasHotel reserva2 = new ReservasHotel("Pedro","16 de agosto de 2024" ,"21 de agosto de 2024" , 104);

    List<Integer> habitacionesDisponibles = new ArrayList<>();
    habitacionesDisponibles.add(103);
    habitacionesDisponibles.add(104);
    habitacionesDisponibles.add(105);
    habitacionesDisponibles.add(106);
    habitacionesDisponibles.add(107);
    habitacionesDisponibles.add(108);
    habitacionesDisponibles.add(201);  
    habitacionesDisponibles.add(202);
    habitacionesDisponibles.add(203);
    habitacionesDisponibles.add(204);
    habitacionesDisponibles.add(205);
    habitacionesDisponibles.add(206);

    Scanner sn = new Scanner(System.in);
    boolean salir = false;
    int opcion;
    while (!salir) {
        
        System.out.println("1. Consultar reserva");
        System.out.println("2. Nueva reserva");
        System.out.println("3. Cancelar reserva");
        System.out.println("4. Salir");

        


        try {
            System.out.println("Escribe la opcion que desea realizar");
            opcion = sn.nextInt();


            switch (opcion) {
                case 1:
                    System.out.println("Por favor digite su nombre, si no está en la lista de reservas, le invitamos a realizar una nueva reserva");
                    String nombre = sn.nextLine();
                    if (nombre.equals(reserva1.getNombre())) {
                        System.out.println(reserva1.consultarReserva());
                    } else if (nombre.equals(reserva2.getNombre())) {
                        System.out.println(reserva2.consultarReserva());
                    } else {
                        System.out.println("No hay reservas con ese nombre");
                    }
                    break;
                case 2:
                    if (habitacionesDisponibles.isEmpty()) {
                        System.out.println("Lo siento, no hay habitaciones disponibles.");
                        break;
                    }
                        System.out.println("Ha solicitado hacer una reserva porfavor necesito que brinde la informacion necesaria para hacer su reserva con exito");
                        System.out.println("Ingrese su nombre:");
                        String nuevoNombre = sn.nextLine();

                        System.out.println("Ingrese la fecha de inicio (ej. 14 de agosto de 2024):");
                        String nuevaFechaInicio = sn.nextLine();

                        System.out.println("Ingrese la fecha de fin (ej. 20 de agosto de 2024):");
                        String nuevaFechaFin = sn.nextLine();

           
                        int nuevoNumeroHabitacion = habitacionesDisponibles.remove(0);
            

                        ReservasHotel nuevaReserva = new ReservasHotel(nuevoNombre, nuevaFechaInicio, nuevaFechaFin, nuevoNumeroHabitacion);
                        System.out.println("Reserva creada exitosamente:");
                        System.out.println(nuevaReserva.consultarReserva());
                        break;

                    case 3:
                        System.out.println("Ingrese el nombre de la reserva que desea cancelar:");
                        String nombreCancelar = sn.nextLine();
                        if (nombreCancelar.equals(reserva1.getNombre())) {
                            habitacionesDisponibles.add(reserva1.getNumeroHabitacion());
                            reserva1 = null;
                            System.out.println("Reserva cancelada exitosamente.");
                        } else if (nombreCancelar.equals(reserva2.getNombre())) {
                            habitacionesDisponibles.add(reserva2.getNumeroHabitacion());
                            reserva2 = null;
                            System.out.println("Reserva cancelada exitosamente.");
                         } else {
                            System.out.println("No hay reservas con ese nombre");
                        }
                        break;
                    case 4:     
                        salir = false;
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                        break;
                }
            }catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }    
    }
}
