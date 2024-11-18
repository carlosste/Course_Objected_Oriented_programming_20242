package JuegoLucha;


class Personaje {
    private String nombre ;
    private String clase;
    protected int puntosDeVida;



     // Constructor para inicializar los datos del personaje
    public Personaje ( String nombre) {
        this . nombre = nombre;
        this . clase = clase;   
        
         
        
    }
    
        

    public String getClase() {
        return clase;
    }


    public String getNombre() {
        return nombre;
    }


    public void atacar(Personaje oponente) {
   
    }


    public void HabilidadEspecial(Personaje oponente) {
       
    }




    // Metodo para recibir dano
     public void recibirDano(int dano ) {
            this . puntosDeVida -= dano ;
            if ( this . puntosDeVida< 0) {
            this . puntosDeVida = 0; 
            }
        }
        
    
    // Verifica si el personaje sigue vivo
     public boolean estaVivo () {
            return this . puntosDeVida > 0 ;
        }
       
        
     // Devuelve los puntos de vida actuales
        public int getPuntosDeVida () {
            return puntosDeVida ;
        }
        
    
    
}
    



    

