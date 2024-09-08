package Ejer4;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejer4 {


    public static void main(String[] args) {
        
        GestionPerfumes perfume1 = new GestionPerfumes("Dior", "Sauvage", 100, 978000);
        GestionPerfumes perfume2 = new GestionPerfumes("Erus", "Versace", 125, 920000);
        
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir) {
            
            System.out.println("1. Precio de los perfumes");
            System.out.println("2. Aplicar perfume");
            System.out.println("3. Salir");


            try {
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                   
                    case 1:
                        System.out.println("De que perfume desea saber el precio: 1. Dior 2. Versace");
                        int num = sn.nextInt();
                        switch (opcion) {
                            case 1:
                                System.out.println("El precio del perfume Dior es: " + perfume1.precioPerfume());
                                break;
                        case 2:
                                System.out.println("El precio del perfume Versace es: " + perfume2.precioPerfume());
                                break;
                        }
                        
                      break;
                    case 2:
                        System.out.println("Que perfume desea aplicar: 1. Dior 2. Versace");
                        int num2 = sn.nextInt();
                        switch (num2) {
                            case 1:
                            System.out.println("Cuantas unidades en ml desea aplicar: ");
                            double aplicado = sn.nextDouble();
                            System.out.println( perfume1.aplicarPerfume(aplicado));
                            System.out.println(Double.parseDouble(perfume1.precioPerfume()) * aplicado / 100);
                            
                            break;
                            case 2:
                            System.out.println("Cuantas unidades en ml desea aplicar: ");
                            double aplicado2 = sn.nextDouble();
                            System.out.println(perfume2.aplicarPerfume(aplicado2));
                            System.out.println(Double.parseDouble(perfume2.precioPerfume()) * aplicado2 / 100);
                            break;
                        }
                        
                    case 3:
                        salir = false;
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
