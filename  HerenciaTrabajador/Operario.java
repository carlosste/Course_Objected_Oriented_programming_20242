public class Operario extends Trabajador{

        public final double VHORA = 100.0;
        private double horas;

        public Operario(int id, String nombre, String area, double horas) {
            super(id, nombre, area);
            this.horas = horas;
        
        }

        public double getHoras() {
            return horas;
        }

        public double salario() {
            return VHORA * horas;
        }





}

