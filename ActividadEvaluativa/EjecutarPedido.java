package ActividadEvaluativa;


public class EjecutarPedido {
    

    public static void main(String[] args) {
        Foto[] f1 = new Foto[1];
        f1[0] = new Foto("foto1.jpg");

       
        Producto impresion1 = new Impresion("Negro", f1, 1);
        Producto camara1 = new Camara("Canon", "HZ04", 1);
        Producto producto1 = new Producto(1);
        Cliente cliente1 = new Cliente("123456789", "Juan Perez");
        
        Pedido pedido = new Pedido(cliente1, new Producto[]{impresion1, camara1, producto1}, new java.util.Date(), 123456789);
        
        System.out.println("Nombre del Cliente: " + pedido.getCliente().getNombre());
        System.out.println("Fecha de pedido: " + pedido.getFecha());
        System.out.println("Numero de tarjeta de credito: " + pedido.getNumeroTarjetaCredito());
        System.out.println("Camara:"+ " " + camara1.getModelo() + " " + camara1.getMarca() );
       for (Foto foto : f1){
        System.out.println("La impresion es:" + foto.print());
       }
        System.out.println("Su pedido ha sido realizado con exito");

    }
}
