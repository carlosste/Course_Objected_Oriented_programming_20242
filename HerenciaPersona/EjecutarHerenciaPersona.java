public class EjecutarHerenciaPersona {
    

    public static void main(String[] args) {
        Persona objP1 = new Estudiante("Messi", "1", "Estudiante");
        Persona objP2 = new Estudiante("Cristiano", "2", "Estudiante");
        
        Persona objP3 = new Docente("Byron", 3, "Profesor" );
        Persona objP4 = new Docente("Harvin", 4, "Profesor" );
        
        System.out.println(objP1 instanceof Estudiante);
        System.out.println(objP2 instanceof Persona);
        
        Persona[] p = new Persona[4];
        p[0] = objP1;
        p[1] = objP2;
        p[2] = objP3;
        p[3] = objP4;
        
        for (int i = 0; i<p.length; i++) {
            System.out.println(p[i].getRol() + " "+ p[i].getNombre() + " "  + p[i].valoracion());
        }
    }
}
