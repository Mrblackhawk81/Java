import java.util.Scanner;

public class ejer6 {
    public static void main(String[] args) {
        //Teorema de pitagoras
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el lado A");
        double a = sc.nextDouble();
        System.out.println("Ingrese el lado B");
        double b = sc.nextDouble();
        double rel = (a*a) + (b*b);
        double rel2 = Math.sqrt(rel);
        System.out.println("La hipotenusa del triangulo es de: " + rel2);
    }
}
