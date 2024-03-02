import java.util.Scanner;

public class ejer10 {
    public static void main(String[] args) {
        //Metro cubico
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el total de metros cubicos usados");
        double agua = sc.nextDouble();
        System.out.println("El precio total a pagar por metro cubico es de: " + agua * 20);
    }

}
