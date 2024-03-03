import java.util.Scanner;

public class ejer22 {
    public static void main(String[] args) {
        //Costo llamada
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tiempo de llamada en minutos");
        int minutos = sc.nextInt();
        System.out.println("Ingrese los segundos de la llamada");
        int segundos = sc.nextInt();
        double costoLlamada = 0.85;
        double total = minutos * 60 + segundos;
        double precio  = total / 60;
        System.out.println("el precio por la llamada es: " + precio * costoLlamada );
    }
}
