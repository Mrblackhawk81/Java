import java.util.Scanner;

public class ejer5 {
    public static void main(String[] args) {
        //Calcular m2
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base de la supeficie del lado a pintar");
        double base = sc.nextDouble();
        System.out.println("Ingrese la altura de la superficie");
        double altura = sc.nextDouble();
        double precio = 25 * (base*altura);
        System.out.println("El precio por el area solicitada es de: " +precio);
    }
}
