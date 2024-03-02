import java.util.Scanner;

public class ejer9 {
    public static void main(String[] args) {
        //Tarifa llamada
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tiempo de la llamada en (minutos)");
        double min = sc.nextDouble();
        System.out.println("segundos");
        int segundos = sc.nextInt();
        double costo = 3;
        double con = min * 60 + segundos;
        double res = con / 60;
        System.out.println("El costo por los minutos de llamada usados es de: "+ res * costo);
    }
}
