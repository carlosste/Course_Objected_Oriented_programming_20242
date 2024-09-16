package Ejer2;


import java.util.Scanner;


public class Ejer2 {
    
    public static void main (String[] args){
        
        LibroVirtual libroVirtual1 = new LibroVirtual ("Fisica" , "Juan A", 10462, 120, false);
        LibroVirtual libroVirtual2 = new LibroVirtual ("Computacion" , "alberto M", 10463, 170, false);
        LibroVirtual libroVirtual3 = new LibroVirtual ("astronomia" , "Felipe J", 10464, 212 , false);
        LibroVirtual libroVirtual4 = new LibroVirtual ("Matematica basica" , "sebastian torres", 10465, 65, false);
    
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opciones;

        while (!salir) {
            System.out.println("1. Consultar libro");
            System.out.println("2. Solicitar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Disponibilidad");
            System.out.println("5. Salir");
        

            

                switch (opciones = scanner.nextInt()) {
                    case 1:
        
                        System.out.println("ingrese el numero del libro que desea consultar hay 4 opciones"); 
                        System.out.println("1." + libroVirtual1.getNombre());
                        System.out.println("2." + libroVirtual2.getNombre());
                        System.out.println("3." + libroVirtual3.getNombre());
                        System.out.println("4." + libroVirtual4.getNombre()); 
                        int num = scanner.nextInt();
                       switch (num) {
                        case 1:
                        System.out.println(libroVirtual1.consultarLibro());
                        break;
                        case 2:
                        System.out.println(libroVirtual2.consultarLibro());
                        break;
                        case 3: 
                        System.out.println(libroVirtual3.consultarLibro());
                        break;  
                        case 4:
                        System.out.println(libroVirtual4.consultarLibro());
                        break;
                       }
                       break;
                        

                    case 2:
                        System.out.println("Ingrese el numero del libro que desea solicitar");
                        
                        int num2 = scanner.nextInt();
                        switch (num2) {
                            case 1:
                            System.out.println(libroVirtual1.prestarLibro());
                            break;
                            case 2:
                            System.out.println(libroVirtual2.prestarLibro());
                            break;
                            case 3:
                            System.out.println(libroVirtual3.prestarLibro());
                            break;
                            case 4:
                            System.out.println(libroVirtual4.prestarLibro());
                            break;
                        }
                        break;
                    case 3:
                        System.out.println("ingrese el numero del libro que desea devolver");
                        int num3 = scanner.nextInt();
                        switch (num3) {
                            case 1:
                            System.out.println(libroVirtual1.devolverLibro());
                            break;
                            case 2:
                            System.out.println(libroVirtual2.devolverLibro());
                            break;
                            case 3:
                            System.out.println(libroVirtual3.devolverLibro());
                            break;
                            case 4:
                            System.out.println(libroVirtual4.devolverLibro());
                            break;
                        }
                        break;
                    case 4:
                        System.out.println("ingrese el numero de libro que desea saber su disponibilidad");
                        int num4 = scanner.nextInt();
                        switch(num4) {
                            case 1:
                            System.out.println(libroVirtual1.disponibilidad());
                            break;
                            case 2:
                            System.out.println(libroVirtual2.disponibilidad());
                            break;
                            case 3:
                            System.out.println(libroVirtual3.disponibilidad());
                            break;
                            case 4:
                            System.out.println(libroVirtual4.disponibilidad());
                            break;
                        }
                        break;
                    case 5:
                         salir = true;
                        break;
                        default:
                        System.out.println("Solo números entre 1 y 5");
                    
                       
            }
            
        } 
        
    }

}




