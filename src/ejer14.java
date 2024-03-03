import java.util.Scanner;

public class ejer14 {
    public static void main(String[] args) {
        //Gastos
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los dias totales del viaje");
        int dia = sc.nextInt();
        System.out.println("Ingrese en precio del hotel por dia");
        double precioHotel = sc.nextDouble();
        System.out.println("Ingrese el precio de la comida por dia");
        double precioComida = sc.nextDouble();
        final double pesoDiario = 100.00;
        double precioTotal = (precioHotel + precioComida + pesoDiario) * dia;
        System.out.println("El precio total a pagar con todos los gastos es de: " + precioTotal);



    }

}
