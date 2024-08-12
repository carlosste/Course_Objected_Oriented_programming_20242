public class Ejecutar {
    public static void main(String[] args){
        System.out.println("programación orientada a objetos");

        //Comentarios de una linea
        /* 
         * comentario 
         * varias 
         * lineas
        */
        /* En java la asignacion es con el "="
         * a = 5
         * b = 10
         * nombre = "Cristiano"
         * "==" es de comparacion de si un valor es similar a otro
         * Tener cuidado que las variables tienen un tipo de dato
        */

        // https://www.dit.upm.es/~pepe/libros/vademecum.pdf 
        // https://docs.oracle.com/javase/tutorial/tutorialLearningPaths.html
        /*
         * Tipos de datos java
         * NUméricos --> (enteros) int, (reales) long, float, double
         * Logico (boolean)
         * cadena-char y string
         * 
         */

        /* Solución ejercicio 1.
            * Entrada: lado del cuadrado -> b
            * Proceso: AreaCuadrado -> b*b
            * Salida:  AreaCuadrado
        */
        int b = 2; //asignacion de variable
        int AreaCuadrado = b*b; //formula a realizar
        System.out.println( "Área del cuadrado = " + AreaCuadrado ); // mensaje de salida
        
        //Para conectar texto con variables se utiliza el signo (+)

        /* Solucion ejercicio 2.
         * Entrada: Radio del circulo: PI (constante)
         * Proceso: AreaCirculo = PI(r*r)
         * Salida:  AreaCirculo
         */

            //La Constante no cambia durante el proceso
        double r = 0.0; //variable
        final double PI = 3.1416; //final se usa para las constantes
        double  AreaCirculo = 0.0;
        r=3;
        // AreaCirculo = PI * (r * r); 
        AreaCirculo = Math.PI * Math.pow(r,2) ;
        
        System.out.println("El area del circulo es:" + AreaCirculo);    

         
        
        double c = 1.0 ;
        double f = 1.0 ;
        double gradosc = (f-32.0) / (9.0/5.0) ;
        double gradosf = (c * 9.0/5.0) + 32.0 ;
        
        System.out.println("Los grados centigrados a fahrenheit son: " + gradosf);
        System.out.println("Los grados fahrenheit a centigrados son: " + gradosc);
        

    }
}