package ComposicionAgregacion;
public class EjecutarComposicionAgregacion {

    public static void main(String[] args) {


        Cliente objCliente1 = new Cliente("1008909765", "pipe", "Perez");
        Cuenta objCuenta1 = new Cuenta("709876", "Ahorros", 150000.0);
        Cuenta objCuenta2 = new Cuenta("709877", "ahorros", 400000.0);
        Banco objBanco1 = new Banco("900345123", "Banco UCC" , objCuenta1);
        
       
        System.out.println(objBanco1);
        System.out.println(objBanco1.esCliente(objCliente1));
    
        //System.out.println("Transaccion: " + objCuenta1.consignarMsg(objCuenta1.getNroCuenta(), 150000.0));
        
        System.out.println(objCuenta1.consignarMsg(objCuenta1.getNroCuenta(), 150000.0));
        System.err.println(objCuenta1);
    } 

    
}
