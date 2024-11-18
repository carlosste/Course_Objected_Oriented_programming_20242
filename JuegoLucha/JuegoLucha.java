package JuegoLucha;


import java . util . Scanner ;


 class JuegoLucha {
    private Personaje jugador1 ;
    private Personaje jugador2 ;
    
    
    // Constructor para inicializar los personajes
    public JuegoLucha ( String nombre1 , String nombre2, String clase1, String clase2 ) {
    jugador1 = new Personaje ( nombre1, clase1 ) ;
    jugador2 = new Personaje ( nombre2, clase2 ) ;
    }

    // Metodo para iniciar la pelea
    public void iniciarPelea () {
    System . out . println ("La pelea comienza entre " + jugador1.getNombre () + " y " + jugador2 . getNombre() + "...") ;

        while ( jugador1 . estaVivo () && jugador2 . estaVivo () ) {
        turno ( jugador1 , jugador2 ) ;
        if ( jugador2 . estaVivo () ) {
        turno ( jugador2 , jugador1 ) ;
    }
}

    // Mostrar el resultado de la pelea
    if ( jugador1 . estaVivo () ) {
    System . out . println ( jugador1 . getNombre () + " ha ganado la pelea .");
    } else {
    System . out . println ( jugador2 . getNombre () + " ha ganado la pelea .");
            }
    }

    // Metodo que representa un turno de ataque
    private void turno ( Personaje atacante , Personaje defensor ) {
    System . out . println (" Turno de " + atacante . getNombre() + ". Puntos de vida de " + defensor . getNombre() + ": " + defensor . getPuntosDeVida () ) ;
    atacante . atacar ( defensor ) ;
    System . out . println ( defensor . getNombre () + " ahora tiene " + defensor . getPuntosDeVida () + " puntos de vida .") ;
    }

    // Metodo principal que ejecuta el juego
    public static void main ( String [] args ) {

    System . out . print (" Introduce el nombre del jugador 2:") ;
    String nombre2 = scanner . nextLine () ;

    JuegoLucha juego = new JuegoLucha ( nombre1 , nombre2 ) ;
    juego . iniciarPelea () ;
    }
}
    