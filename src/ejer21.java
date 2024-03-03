import java.util.Scanner;

public class ejer21 {
    public static void main(String[] args) {
        //Tiempo de vida
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los años que vivio la persona");
        int año = sc.nextInt();
        int meses = año * 12;
        double semanas = meses * 4.34424;
        double dias = semanas * 7;
        double horas = dias * 24;
        System.out.println("La persona vivio " + meses + " meses");
        System.out.println("La persona vivio " + semanas + " semanas");
        System.out.println("La persona vivio " + dias + " dias");
        System.out.println("La persona vivio " + horas + " horas");
    }
}
