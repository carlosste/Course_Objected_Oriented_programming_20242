

import java.util.Scanner;


public class Ejer2 {
    
    public static void main (String[] args){
        
        LibroVirtual libroVirtual1 = new LibroVirtual ("Fisica" , "Juan A", 122, 10462, false);
        LibroVirtual libroVirtual2 = new LibroVirtual ("Computacion" , "alberto M", 170, 10463, false);
        LibroVirtual libroVirtual3 = new LibroVirtual ("astronomia" , "Felipe J", 212, 10464, false);
        LibroVirtual libroVirtual4 = new LibroVirtual ("Matematica basica" , "sebastian torres", 60, 10465, false);
    
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opciones;

        while (!salir) {
            System.out.println("1. Consultar libro");
            System.out.println("2. Solicitar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Disponibilidad");
            System.out.println("5. Salir");

            

                switch (opciones) {
                    case 1:
        
                        System.out.println("ingrese el numero del libro que desea consultar");  
                        int num = scanner.nextInt();
                       switch (num) {
                        case 1:
                        System.out.println(libroVirtual1.consultarLibro());
                        break;
                        System.out.println(libroVirtual2.consultarLibro());
                        case 2:
                        break;
                        System.out.println(libroVirtual3.consultarLibro());
                        case 3: 
                        break;
                        System.out.println(libroVirtual4.consultarLibro());
                        break;
                       }
                        

                    case 2:
                        System.out.println(libroVirtual2.prestarLibro());
                        break;
                    case 3:
                        System.out.println(libroVirtual3.devolverLibro());
                        break;
                    case 4:
                        System.out.println(libroVirtual4.disponibilidad());
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
            
            }       
        }
            
            
        }
    }

}




