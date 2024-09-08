public class LibroVirtual {

    private String nombre;
    private String autor;
    private int codigo;
    private int num;
    private boolean disponible;
    
    public LibroVirtual(String nombre, String autor, int codigo, int num, boolean disponible) {
        
        
        this.nombre = nombre;
        this.autor = autor;
        this.codigo = codigo;
        this.num = num;
        this.disponible = disponible;
    }   

    public String consultarLibro() {
        return "El libro que consulto es: "+nombre + " de " + autor + " codigo: " + codigo + " numero de pag. " + num;
    }

    public String prestarLibro() {
        return "El libro que va a prestar es: "+nombre;
    }

    public String devolverLibro() {
        return "El libro que va a devolver es: "+nombre;
    }
    public String disponibilidad() {
        if (disponible == false) {
            return "El libro esta disponible";
        } else {
                return "El libro no esta disponible";
        }
        
    }
    
}