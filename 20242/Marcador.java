public class Marcador {
    private String nombre;
    private String color;
    private double diametro;
    private boolean esBorrable;

    public Marcador(String nombre, String color, double diametro, boolean esBorrable) {
            this.nombre = nombre;
            this.color = color;
            this.diametro = diametro;
            this.esBorrable = esBorrable;
    }
    public void rayar(){
            System.out.println("Estoy rayando");
    }
    public String recargar(double cantidad){
            return "Recargando marcador con"+ cantidad +"ml";
     }
     public String toString(){
            return "(Marcador: "+nombre+" "+color+" "+diametro+" "+esBorrable+")";
     }

}