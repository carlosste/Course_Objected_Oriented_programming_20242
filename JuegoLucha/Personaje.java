package JuegoLucha;
import java . util . Random ;

class Personaje {
    private String nombre ;
    private String clase;
    private int puntosDeVidaA = 90;
    private int puntosDeVidaT = 115;
    
    private final int MAX_DANOA = 20;
    private final int MIN_DANOA = 12;
    
    private final int MAX_DANO_ESPECIALA = 25;
    private final int MIN_DANO_ESPECIALA = 30;
    
     // Constructor para inicializar los datos del personaje
     public Personaje ( String nombre, String clase, int puntosDeVida ) {
        this . nombre = nombre;
        this . clase = clase;   
        this . puntosDeVidaA = puntosDeVida;
        this . puntosDeVidaT = puntosDeVida; 
        
     }
    
     // Metodo para realizar un ataque a otro personaje
    public void atacar ( Personaje oponente ) { 
        if (this.clase == "Asesino" || this.clase == "asesino"){
            Random rand = new Random () ;
            int dano = rand . nextInt (( MAX_DANOA - MIN_DANOA ) + 1) + MIN_DANOA ; 
            oponente . recibirDano ( dano ) ;
            System . out . println ( this . nombre + " ataca a " + oponente . getNombre () + " causando " + dano + " puntos de daño .") ;
        }
        else if (this.clase == "Tanque" || this.clase == "tanque"){
            Random rand = new Random () ;
            int dano = rand . nextInt (( MAX_DANOT - MIN_DANOT ) + 1) + MIN_DANOT ; 
            oponente . recibirDano ( dano ) ;
            System . out . println ( this . nombre + " ataca a " + oponente . getNombre () + " causando " + dano + " puntos de daño .") ;
        }
    }
    

    public void HabilidadEspecial ( Personaje oponente){
        if (this.clase == "Asesino" || this.clase == "asesino"){
            Random rand = new Random ();
            int dano = rand.nextInt((MAX_DANO_ESPECIALA - MIN_DANO_ESPECIALA) + 1) + MIN_DANO_ESPECIALA;
            oponente.recibirDano(dano);
            System.out.println(this.nombre + " ataca a " + oponente.getNombre() + " con su habilidad especial causando " + dano + " puntos de daño.");
        }
        else if (this.clase == "Tanque" || this.clase == "tanque"){
        Random rand = new Random ();
        int dano = rand.nextInt((MAX_DANO_ESPECIALT - MIN_DANO_ESPECIALT) + 1) + MIN_DANO_ESPECIALT;
        oponente.recibirDano(dano);
        System.out.println(this.nombre + " ataca a " + oponente.getNombre() + " con su habilidad especial causando " + dano + " puntos de daño.");
    }

    // Metodo para recibir dano
     public void recibirDano ( int dano ) {
        if (this.clase == "Asesino" || this.clase == "asesino"){
            this . puntosDeVidaA -= dano ;
            if ( this . puntosDeVidaA < 0) {
            this . puntosDeVidaA = 0; 
            }
        }
        else if (this.clase == "Tanque" || this.clase == "tanque"){
            this . puntosDeVidaT -= dano;
            if ( this . puntosDeVidaT < 0) {
            this . puntosDeVidaT = 0; 
            }
        }
        }
    }
    // Verifica si el personaje sigue vivo
     public boolean estaVivo () {
        if (this.clase == "Asesino" || this.clase == "asesino"){
            return this . puntosDeVidaA > 0 ;
        }
        else if (this.clase == "Tanque" || this.clase == "tanque"){
            return this . puntosDeVidaT > 0 ;
            
        }
        
         // Devuelve el nombre del personaje
        public String getNombre () {
         return this . nombre ;
        }
        
     // Devuelve los puntos de vida actuales
        public int getPuntosDeVida () {
        if (this.clase == "Asesino" || this.clase == "asesino"){
            return this . puntosDeVidaA ;
        }
        else if (this.clase == "Tanque" || this.clase == "tanque"){
            return this . puntosDeVidaT ;
        }
    }
}


    

