import java.util.Scanner;

public class ejer7 {
    public static void main(String[] args) {
        //Costo viaje
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de km recorridos");
        double km = sc.nextDouble();
        final double precio = 50;
        double costoBoleto = km*precio;
        System.out.println("El precio por los kmn recorridos es de: "+ costoBoleto);
    }
}
