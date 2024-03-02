import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {
        //Conversor de dinero
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor en bolivianos ");
        double dinero = sc.nextDouble();
        double dolar = 1 * dinero / 6.91;
        System.out.println("el valor de los pesos bolivianos convertido al dolar es de: " + dolar);
    }
}
