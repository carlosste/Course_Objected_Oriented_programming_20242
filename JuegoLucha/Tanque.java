package JuegoLucha;

import java.util.Random;

public class Tanque  extends Personaje {
    private final int MAX_DANO = 10;
    private final int MIN_DANO = 5;
    private final int MAX_DANO_ESPECIAL = 15;
    private final int MIN_DANO_ESPECIAL = 22;

    public Tanque(String nombre) {
        super(nombre ); ;
        this.puntosDeVida = 120;
    }


    public void atacar ( Personaje oponente ) {
     if (this.getClase()== "Tanque" || this.getClase() == "tanque"){
        Random rand = new Random () ;
        int dano = rand . nextInt (( MAX_DANO- MIN_DANO ) + 1) + MIN_DANO ; 
        oponente . recibirDano ( dano ) ;
        System . out . println ( this .getClase() + " ataca a " + oponente . getNombre () + " causando " + dano + " puntos de daño .") ;
    }
  
    }

    public void HabilidadEspecial ( Personaje oponente){
        if (this.getClase() == "Tanque" || this.getClase() == "tanque"){
            Random rand = new Random ();
            int dano = rand.nextInt((MAX_DANO_ESPECIAL - MIN_DANO_ESPECIAL) + 1) + MIN_DANO_ESPECIAL;
            oponente.recibirDano(dano);
            System.out.println(this.getNombre() + " ataca a " + oponente.getNombre() + " con su habilidad especial causando " + dano + " puntos de daño.");
        }
    }

 
}