package ActividadEvaluativa;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pedido {


    private Cliente cliente;
    private Producto[] producto;
    private Date fecha;
    private int numeroTarjetaCredito;

    
    public Pedido(Cliente cliente, Producto[] producto, Date fecha, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.producto = producto;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProducto() {
        return producto;
    }

    public String getFecha() {
        SimpleDateFormat fch = new SimpleDateFormat("dd/MM/yyyy");
        return fch.format(fecha);
    }

    public int getNumeroTarjetaCredito() {
        return numeroTarjetaCredito;
    }
    
}