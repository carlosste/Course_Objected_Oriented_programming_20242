

public class Persona {
    

    private String nombre;
    private int id;
    private String rol;


    public Persona(String nombre, int id, String rol) {
        this.nombre = nombre;
        this.id = id;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getRol() {
        return rol;
    }

}
