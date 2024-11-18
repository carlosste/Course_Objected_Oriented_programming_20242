package ActividadFinal;

public class Ascensor {//Composicion con la clase Puerta y la clase Boton 


    private int pisoActual;
    private Puerta puerta;
    private boolean enMovimiento;
    private String direccion;
    
    public Ascensor() {
        this.pisoActual = 1;
        this.puerta = new Puerta();
        this.enMovimiento = false;
        this.direccion = "Sin direccion";

    }

    public void mover(int pisoDestino){
        if(pisoDestino != pisoActual){
            enMovimiento = true;
            direccion = pisoDestino > pisoActual ? "Subiendo" : "Bajando";
            pisoActual = pisoDestino;
            enMovimiento = false;
            System.out.println("El ascensor llego al piso " + pisoActual);
            puerta.abrirPuerta();
        }
    }

    public void cambioDireccion(String nuevaDireccion){
        if (!enMovimiento){
            direccion = nuevaDireccion;
        }
    }

    public void detener(){
        enMovimiento = false;
        direccion = "detenido";
        puerta.abrirPuerta();
    }

    

    public String getDireccion(){
        return direccion;
    }

    public int getPisoActual(){
        return pisoActual;
    }   

}
