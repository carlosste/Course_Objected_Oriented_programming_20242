package JuegoLucha;


import java . util . Scanner ;


 class JuegoLucha {
    private Personaje PJ1 ;
    private Personaje PJ2 ;
    private Scanner scanner ;
    
    // Constructor para inicializar los personajes
    public JuegoLucha ( String nombre1 , String nombre2 ) {
        PJ1 = new Tanque ( nombre1  ) ;
        PJ2 = new Asesino ( nombre2 ) ;
        scanner = new Scanner ( System . in ) ; 
    }   


    // Metodo para iniciar la pelea
    public void iniciarPelea () {
        System.out.println("Elige tu personaje: ");
        System.out.println("1. Tanque");
        System.out.println("2. Asesino");
        int opcion = scanner.nextInt();
        scanner.nextLine();
    
        Personaje jugador = (opcion == 1) ? PJ1 : PJ2;
        Personaje oponente = (opcion == 1) ? PJ1 : PJ2;


        while ( jugador . estaVivo () && oponente . estaVivo () ) {
            turno ( jugador, oponente ) ;
            if ( oponente . estaVivo () ) {
                turno ( oponente , jugador ) ;
            }
        }

    // Mostrar el resultado de la pelea
        if ( jugador . estaVivo () ) {
            System . out . println ( oponente . getNombre () + " ha ganado la pelea .");
        } else {
            System . out . println ( oponente. getNombre () + " ha ganado la pelea .");
        }
    }

    // Metodo que representa un turno de ataque
    private void turno ( Personaje atacante , Personaje defensor ) {
        System.out.println("Turno de " + atacante . getNombre () + " . Puntos de vida de " + defensor . getNombre () + ": " + defensor . getPuntosDeVida () ) ;
            System.out.println("Elige el tipo de ataque: ");
            System.out.println("1. Ataque basico");
            System.out.println("2. Ataque especial");
            int tipoAtaque = scanner.nextInt();
            scanner.nextLine();
        
        if ( tipoAtaque == 1) {
            atacante . atacar ( defensor ) ;
        } else {
            atacante . HabilidadEspecial ( defensor ) ;

        System.out.println(defensor . getNombre () + " tiene " + defensor . getPuntosDeVida () + " puntos de vida .") ;

        }


    }
    

    // Metodo principal que ejecuta el juego
    public static void main ( String [] args ) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al juego de lucha .") ;
        System.out.println("Eliga el nombre del jugador 1: ");
        String nombre1 = scanner.nextLine();
        
        System.out.println("Eliga el nombre del jugador 2: ");
        String nombre2 = scanner.nextLine();
             
  

    JuegoLucha juego = new JuegoLucha ( nombre1 , nombre2 ) ;
    juego . iniciarPelea () ;
    }
    
}