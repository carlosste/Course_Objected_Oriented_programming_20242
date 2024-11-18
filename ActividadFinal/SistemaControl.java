package ActividadFinal;

import java.util.ArrayList;
import java.util.List;

public class SistemaControl { //composicion con clase Ascensor y Piso

    private Ascensor ascensor;
    private Puerta puerta;
    private List<Piso> pisos;

    public SistemaControl(int numeroPisos) {
        this.ascensor = new Ascensor();
        this.pisos = new ArrayList<>();
        for (int i = 0; i < numeroPisos; i++) {
            pisos.add(new Piso(i));
        }
    }
    
    public void recibirSolicitud(int piso , String direccion){
        pisos.get(piso).solicitar(direccion);
         controlMovimiento(piso); 
        
    }

    public void controlMovimiento(int pisoDestino){
        int pisoActual = ascensor.getPisoActual();
        if(pisoDestino > pisoActual){
            ascensor.cambioDireccion("Subiendo");
        } else if (pisoDestino < pisoActual){
            ascensor.cambioDireccion("Bajando");
        }
        ascensor.mover(pisoDestino);
    }


    public void sensorObstaculo(){
        puerta.sensorObstaculo();
    }



}


