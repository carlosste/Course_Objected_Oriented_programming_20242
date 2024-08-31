public class Ejetor{

    public static void main (String[] args) {
        Marcador objMarcador1 = new Marcador("charpie", "azul", 0.5, true);
        objMarcador1.rayar();
        System.out.println(objMarcador1.toString());
    }
}