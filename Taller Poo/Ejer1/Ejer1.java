package Ejer1;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer1 {

    public static void main (String[] args) {

        CuentaBancaria cuentaBancaria1 = new CuentaBancaria ("Ronaldo", 100000, 1321364 );

        
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; 
 
        while (!salir) {
 
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar saldo");
            System.out.println("3. Retirar saldo");
            System.out.println("4. Consultar titular");
            System.out.println("5. Salir");

            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println(cuentaBancaria1.consultarSaldo());
                        break;
                    case 2:
                        System.out.println("Cuanto desea depositar en su cuenta: ");
                        double montod = sn.nextInt();
                        System.out.println(cuentaBancaria1.depositar(montod));
                        break;
                    case 3:
                        System.out.println("Cuanto desea retirar de su cuenta");
                        double montor = sn.nextInt();
                        System.out.println(cuentaBancaria1.retirar(montor));
                        break;
                    case 4:
                        System.out.println("El titular de la cuenta es: " + cuentaBancaria1.getTitular());
                        break;    
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }

    }

}