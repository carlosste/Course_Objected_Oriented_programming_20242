package JuegoLucha;

import java.util.Random;

public class Asesino extends Personaje {
   
    private  int MAX_DANO = 10;
    private  int MIN_DANO = 15;
    private  int MAX_DANO_ESPECIAL = 25;
    private  int MIN_DANO_ESPECIAL = 30;

    public Asesino ( String nombre) {
        super(nombre);
        this.puntosDeVida = 95;
    }

    public void atacar ( Personaje oponente ) { 
        if (this.getClase().equals("Asesino") || this.getClase().equals("asesino")){
            Random rand = new Random () ;
            int dano = rand . nextInt (( MAX_DANO - MIN_DANO ) + 1) + MIN_DANO ; 
            oponente . recibirDano ( dano ) ;
            System . out . println ( this . getNombre() + " ataca a " + oponente . getNombre () + " causando " + dano + " puntos de daño .") ;
        }
    }

    public void HabilidadEspecial ( Personaje oponente){
        if (this.getClase() == "Asesino" || this.getClase()== "asesino"){
            Random rand = new Random ();
            int dano = rand.nextInt((MAX_DANO_ESPECIAL - MIN_DANO_ESPECIAL) + 1) + MIN_DANO_ESPECIAL;
            oponente.recibirDano(dano);
            System.out.println(this.getNombre() + " ataca a " + oponente.getNombre() + " con su habilidad especial causando " + dano + " puntos de daño.");
        }
    }
}
