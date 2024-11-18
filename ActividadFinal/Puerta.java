package ActividadFinal;


import java.util.Random;
public class Puerta {

    private boolean abierta;
    private boolean sensor;

    public Puerta() {
        this.abierta = abierta;
        this.sensor = sensor;
    }

    public boolean puertaAbierta() {
        return abierta;
        
    }


    public void abrirPuerta() {
        abierta = true;
        System.out.println("La puerta esta abierta (emite sonido)");
        
    }

    
    public void cerrarPuerta() {
            abierta = false;
            System.out.println("La puerta esta cerrada (emite sonido )");
    
    }
    public  boolean sensorObstaculo(){
        sensor = true;
        System.out.println("Obstaculo detectado, la puerta no se puede cerrar" + " (emite sonido de alerta)" + "Intentando cerrar puerta nuevamente");
        return sensor;
    }
}
