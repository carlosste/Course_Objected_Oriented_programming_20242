public class Estudiante extends Persona {

    public Estudiante(String nombre, int id, String rol) {
        super(nombre, id, rol);
    }


    public String valoracion(double nota) {

        if (nota >= 0.0 && nota <= 5.0) {
            if (nota < 3.0) {
                return "Perdiste la materia";
            } else if (nota >= 3.0 && nota < 4.5) {
                return "Felicidades, aprobaste";
            } else if (nota >= 4.5 && nota < 5.0) {
                return "Felicidades, aprobaste con honores, y tendras un descuento del 5%";
            } else {
                return "Excelente";
            }
        } else {
            return "Nota no válida";
        }
    } 
}