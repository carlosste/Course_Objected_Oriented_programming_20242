package ActividadEvaluativa;

public class Camara extends Producto{

    private String marca;
    private String modelo;
    

    public Camara(String marca, String modelo,  int numero) {
        super(numero);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

}
