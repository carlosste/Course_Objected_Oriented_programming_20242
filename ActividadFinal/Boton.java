package ActividadFinal;

public class Boton {
    private boolean presionado;
    private String tipo;

    public Boton(String tipo){
        this.tipo = tipo;
        presionado = false;
    }
    
    public void presionar(){
        presionado = true;
        System.out.println("Boton  presionado " + " (emite luz y suena pitido)");
    }
    
    public void liberar(){
        presionado = false;
        System.out.println("Boton es liberado "+ " (deja de emitir luz y suena pitido)");
    }

}

