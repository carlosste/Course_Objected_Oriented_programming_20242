public class Vendedor extends Trabajador{

    public final double VENTA = 12000.0;
    private double comision;

    public Vendedor(int id, String nombre, String area, double comision) {
        super(id, nombre, area);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }
    public double salario() {
        return (VENTA * (comision/100))+ VENTA;
    }
}
