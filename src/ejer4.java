import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        //Cobro estacionamiento
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas que estaba en el estacionamiento");
        double hora = sc.nextDouble();
        double precio = 10;
        System.out.println("El precio por uso del estacionaminento es de: "+ (hora*precio));
    }

}
