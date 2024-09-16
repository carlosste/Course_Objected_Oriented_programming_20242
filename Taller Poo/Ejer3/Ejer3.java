package Ejer3;


import java.util.InputMismatchException;
    import java.util.Scanner;

public class Ejer3 {
    
    public static void main (String[] args) {
        
        ManejoInventario producto1 = new ManejoInventario("Coca-Cola", 123, 100, 2000);
        
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; 
        
        while (!salir) {
 
            System.out.println("1. Vender producto");
            System.out.println("2. Comprar producto");
            System.out.println("3. Saber cantidad en stock");
            System.out.println("4. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Cuantas unidades desea vender: ");
                        int cantidadv = sn.nextInt();
                        System.out.println(producto1.vender(cantidadv));
                        break;
                    case 2:
                        System.out.println("Cuantas unidades desea comprar: ");
                        int cantidadc = sn.nextInt();
                        System.out.println(producto1.comprar(cantidadc));
                        break;
                    case 3:
                        System.out.println("La cantidad en stock es: " + producto1.getCantidadStock());
                        break;
                    case 4:
                    salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }
}
