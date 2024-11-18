package ActividadFinal;

public class Piso { // composicion con clase ascensor
    private int numero;
    private Boton botonBajar;
    private Boton botonSubir;

    public Piso( int numero) {
        this.numero = numero;
        this.botonBajar = new Boton("Bajar");
        this.botonSubir = new Boton("Subir");
    }

    public void solicitar (String direccion){
        if (direccion.equals("Subir")){
            botonSubir.presionar();
            System.out.println("solicitud de subir en piso " + numero);
            botonSubir.liberar();
           
        } else if(direccion.equals("Bajar")){
            botonBajar.presionar();
            System.out.println("solicitud de bajar en piso " + numero);
            botonBajar.liberar();
        }
    }

    public int getNumero(){
        return numero;
    }   
}
