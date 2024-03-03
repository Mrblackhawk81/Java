import java.util.Scanner;

public class ejer15 {
    public static void main(String[] args) {
        //Potencia electrica
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la resistencia del circuito");
        double resistencia = sc.nextDouble();
        System.out.println("Ingrese la intensidad del circuito");
        double amperios = sc.nextDouble();
        double potencia = (resistencia * amperios) * amperios;
        System.out.println("La potencia del circuito es de: " + potencia + "W");
    }
}
