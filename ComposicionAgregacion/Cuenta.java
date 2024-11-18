package ComposicionAgregacion;


public class Cuenta {
    private String nroCuenta;
    private String tipoCuenta;
    private Double saldo;

    public Cuenta(String nroCuenta, String tipoCuenta, Double saldo) {
        this.nroCuenta = nroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }


    public String getNroCuenta() {
        return nroCuenta;
    }


    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }


    public String getTipoCuenta() {
        return tipoCuenta;
    }


    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }


    public Double getSaldo() {
        return saldo;
    }


    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }



    @Override
    public String toString() {
        return "Cuenta [nroCuenta=" + nroCuenta + ", tipoCuenta=" + tipoCuenta + ", saldo=" + saldo + "]";
    }


    public boolean consignar(String nroCuenta, double monto ) {
        boolean flag = false;
        if (nroCuenta.equals("709876")) {
            saldo += monto;
            flag = true;
        }
        return flag;
    }

    public String consignarMsg(String nroCuenta, double monto ) {
        String msg= " ";
        if (nroCuenta.equals("709876")) {
            saldo += monto;
            msg= "Consignacion exitosa....  saldo actual:" + saldo;
        }else{
            msg= "Consignacion fallida....  saldo actual:" + saldo;
        }
        return msg;
    }

public boolean retirar(String nroCuenta, double monto ) {
        boolean flag = false;
        if (nroCuenta.equals("709876")) {
            saldo -= monto;
            flag = true;
        }
        return flag;
    }

    public String retirarMsg(String nroCuenta, double monto ) {
        String msg= " ";
        if (nroCuenta.equals("709876")) {
            saldo -= monto;
            msg= "Transaccion exitosa....  saldo actual:" + saldo;
        }else{
            msg= "Transaccion fallida....  saldo actual:" + saldo;
        }
        return msg;
    }

    public boolean transferir(String nroCuenta, String nroCuentaDestino, double monto ) {
        boolean flag = false;
        if (nroCuenta.equals("709876")) {
            saldo -= monto;
            flag = true;
        }
        return flag;
    }

        public String ConsultarSaldo(double nroCuenta) {
        System.out.println("su saldo actual es: " + saldo);


        return "su saldo actual es: " + saldo;}
}