public class EjecutarHerencia {
    
public static void main (String[] args){

    Trabajador  objT1 = new Vendedor(1, "Cristiano", "Textiles", 20.0 );
    Trabajador  objT2 = new Vendedor(2, "Messi", "Electrodomesticos", 10.0 );

    Trabajador  objT3 = new Operario(3, "Byron", "Dulceria", 200);
    Trabajador  objT4 = new Operario(4, "Harvin", "Comestibles", 300 );

    /*
    System.out.println("Salario de Vendedor: " + objT1.salario());
    System.out.println("Salario de Vendedor: " + objT2.salario());

    System.out.println("Salario de Operario: " + objT3.salario());
    System.out.println("Salario de Operario: " + objT4.salario());
    */

    System.out.println(objT1 instanceof Vendedor);
    System.out.println(objT2 instanceof Trabajador); 

    Trabajador[] t = new Trabajador[4];
    t[0] = objT1;
    t[1] = objT2;
    t[2] = objT3;
    t[3] = objT4;


    for (int i = 0; i<t.length; i++) {
        System.out.println(t[i].getArea() + " "+ t[i].getNombre() + " "  + t[i].salario());
    }






    }
}
    



