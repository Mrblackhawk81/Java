import java.util.Scanner;

public class ejer13 {
    public static void main(String[] args) {
        //Ahorro
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su sueldo");
        double sueldo = sc.nextDouble();
        double por = (sueldo * 0.60) * 12;
        System.out.println("En un año ahorrara: "+ por);
    }
}
