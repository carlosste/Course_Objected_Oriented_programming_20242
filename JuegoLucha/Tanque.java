package JuegoLucha;

public class Tanque {
    private String nombre;
   
    private int puntosDeVida;
    private final int MAX_DANO = 10;
    private final int MIN_DANO = 5;
    private final int MAX_DANO_ESPECIAL = 15;
    private final int MIN_DANO_ESPECIAL = 22;

    public Tanque(String nombre, int puntosDeVida) {
        super(nombre, puntosDeVida);
        
    }


    public void atacar ( Personaje oponente ) {
    if (this.clase == "Tanque" || this.clase == "tanque"){
        Random rand = new Random () ;
        int dano = rand . nextInt (( MAX_DANOT - MIN_DANOT ) + 1) + MIN_DANOT ; 
        oponente . recibirDano ( dano ) ;
        System . out . println ( this . nombre + " ataca a " + oponente . getNombre () + " causando " + dano + " puntos de daño .") ;
    }
}
