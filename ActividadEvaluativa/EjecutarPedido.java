package ActividadEvaluativa;


public class EjecutarPedido {
    

    public static void main(String[] args) {
        Foto[] fotos = new Foto[1];
        fotos[0] = new Foto("foto1.jpg");
       
        Impresion impresion = new Impresion("Negro", fotos, 1);
        Camara camara = new Camara("Canon", "HZ04", 1);
        Producto producto = new Producto(1);
        Cliente cliente = new Cliente("123456789", "Juan Perez");
        
        Pedido pedido = new Pedido(cliente, new Producto[]{impresion, camara, producto}, new java.util.Date(), 123456789);
        
        System.out.println("Nombre del Cliente: " + pedido.getCliente().getNombre());
        System.out.println("Fecha de pedido: " + pedido.getFecha());
        System.out.println("Numero de tarjeta de credito: " + pedido.getNumeroTarjetaCredito());
        System.out.println("Producto:"+ "" + camara.getModelo() + " " + camara.getMarca());
        System.out.println("Color:"+ "" + impresion.getColor());
        System.out.println("Su pedido ha sido realizado con exito");

    }
}
