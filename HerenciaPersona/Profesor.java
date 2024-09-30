
public class Profesor extends Persona {

    public Profesor(String nombre, int id, String rol) {
        super(nombre, id, rol);
    }

    public String valoracion(double nota) {
        if (nota >= 0.0 && nota <= 5.0) {
            if (nota < 3.0) {
                return "Tuvo baja valorancion, se le descontara 5%";
            } else if (nota >= 3.0 && nota < 4.5) {
                return "Su valoración fue regular, no hay descuento ni tampoco hay bono";
            } else if (nota >= 4.5 && nota < 5.0) {
                return "Su valoración fue buena, se le bonificara con 5%";
            } else {
                return "Excelente";
            }
        } else {
            return "Nota no válida";
        }
        
    }
}
