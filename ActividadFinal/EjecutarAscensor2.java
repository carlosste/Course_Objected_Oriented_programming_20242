package ActividadFinal;

public class EjecutarAscensor2 {


    public static void main(String[] args) {
        SistemaControl sistema = new SistemaControl(5);
      
        //simulacion de ejecutar el ascensor
        sistema.recibirSolicitud(0,"Subir" );
        sistema.recibirSolicitud(4, "Subir");
        sistema.recibirSolicitud(1,"Bajar" );
        sistema.recibirSolicitud(2,"Subir" );
        sistema.recibirSolicitud(3,"Bajar" );

        sistema.sensorObstaculo();
        
    }
    
}
