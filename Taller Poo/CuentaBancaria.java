public class CuentaBancaria {

    private int numeroCuenta;
    private double saldo;
    private String titular;
   

    public CuentaBancaria(String titular, double saldo, int numeroCuenta) {
        
        
        this.titular = titular;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
        
    }   

    public String depositar(double cantidad){
        saldo += cantidad;
        return "Su saldo es de: " +saldo;
        
        
    }

    

    public String retirar(double cantidad){

        saldo -= cantidad;
        return "Su saldo es de: "+saldo;
    }

    public String consultarSaldo(){

        return "Su saldo actual es: " + saldo;
    } 


} 