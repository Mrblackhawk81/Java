import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        //Area de un triangulo
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base del triangulo");
        double base = sc.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        double altura = sc.nextDouble();
        double area = base * altura / 2;
        System.out.println("El area del triangulo es de: " + area);
    }
}
