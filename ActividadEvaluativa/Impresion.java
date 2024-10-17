package ActividadEvaluativa;

public class Impresion extends Producto{

    private String color;
    private Foto[] foto;
    
    public Impresion(String color, Foto[] foto, int numero) {
        super(numero);
        this.color = color;
        this.foto = foto;
    }

    public String getColor() {
        return color;
    }

    public Foto[] getFoto() {
        return foto;
    }
    
}
