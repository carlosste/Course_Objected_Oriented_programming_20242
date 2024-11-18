package ActividadFinal;
import java.util.Scanner;
import java.util.Random;

public class EjecutarAscensor {//simulacion de ejecutar el ascensor

    public static void main(String[] args) {
        SistemaControl sistema = new SistemaControl(5);
        Boton boton = new Boton("Ascensor");
        Puerta puerta = new Puerta();
        Random r = new Random(); //no encontre manera de usarlo correctamente
        Scanner sc = new Scanner(System.in);
        
        
        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Solicitar ascensor"  ); 
            System.out.println("2. Salir");
            int opcion = sc.nextInt();
            
            switch (opcion) {
            case 1:
            boton.presionar();
                while (true) {
                System.out.println("Seleccione el piso que desea ir:"  );
                System.out.println("1"   );                                            
                System.out.println("2"  );
                System.out.println("3"  );
                System.out.println("4"  );
                System.out.println("5"  );
                System.out.println("6.Cancelar");
              
                int subOpcion = sc.nextInt();
                
                boton.liberar();
                System.out.println("Ascensor en movimiento...");
                switch (subOpcion) {
                    case 1:
                    
                        sistema.recibirSolicitud(0," " );
                        System.out.println("Seleccione una opción:");
                        System.out.println("1. Bajar del ascensor");
                        System.out.println("2. ir a otro piso");
                
                        int subOpcion1 = sc.nextInt();
                        switch (subOpcion1) {
                            case 1:

                                System.out.println("Bajando del ascensor..." );
                                puerta.cerrarPuerta();
                            break;

                            case 2:
                                puerta.cerrarPuerta();
                            continue;
        
                            default:
                                System.out.println("Opción no válida. Intente nuevamente.");
                            break;
                        }
                    break;
                    case 2:
                        sistema.recibirSolicitud(1, "");
                        System.out.println("Llego al piso 1");
                        System.out.println("Seleccione una opción:");
                        System.out.println("1. Bajar del ascensor");
                        System.out.println("2. ir a otro piso");
                    
                        int subOpcion2 = sc.nextInt();
                        switch (subOpcion2) {
                            case 1:
                            System.out.println("Bajando del ascensor...");
                            puerta.cerrarPuerta();
                            break;

                            case 2:
                                    puerta.cerrarPuerta();
                            continue;
            
                            default:
                                    System.out.println("Opción no válida. Intente nuevamente.");
                            break;
                        }
                    break;
                    case 3:
                        sistema.recibirSolicitud(2, "");
                        System.out.println("Seleccione una opción:");
                        System.out.println("1. Bajar del ascensor");
                        System.out.println("2. ir a otro piso");

                        int subOpcion3 = sc.nextInt();
                        switch (subOpcion3) {
                            case 1:
                
                            System.out.println("Bajando del ascensor...");
                            puerta.cerrarPuerta();
                            break;

                            case 2:
                            puerta.cerrarPuerta();
                            continue;
            
                            default:
                            System.out.println("Opción no válida. Intente nuevamente.");
                            break;
                        }
                    break;
                    case 4:
                    sistema.recibirSolicitud(3, "");
                            System.out.println("Seleccione una opción:");
                            System.out.println("1. Bajar del ascensor");
                            System.out.println("2. ir a otro piso");
                            
                            int subOpcion4 = sc.nextInt();
                        switch (subOpcion4) {
                        case 1:
                        
                        System.out.println("Bajando del ascensor...");
                        puerta.cerrarPuerta();
                        break;

                        case 2:
                        puerta.cerrarPuerta();
                        continue;
                    
                        default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                            break;
                     }
                    break;
                    
                    
                    case 5:
                        sistema.recibirSolicitud(4, "");
                        System.out.println("Seleccione una opción:");
                        System.out.println("1. Bajar del ascensor");
                        System.out.println("2. ir a otro piso");
                    
                        int subOpcion5 = sc.nextInt();
                        switch (subOpcion5) {
                            case 1:
                
                                System.out.println("Bajando del ascensor...");
                                puerta.cerrarPuerta();
                            break;

                            case 2:
                                puerta.cerrarPuerta();
                            continue;
            
                            default:
                                System.out.println("Opción no válida. Intente nuevamente.");
                            break;
                    }
                    break;
                    case 6:
                        System.out.println("Cancelando solicitud...");
                        boton.liberar();
                    break;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                    continue;
                
                }
                break;
                }
            case 2:
                System.out.println("Terminando la simulación...");	
                sc.close();
                return;

            default:
                System.out.println("Opción no válida. Intente nuevamente.");
                break;
            }
        }
    }

   
    
}
