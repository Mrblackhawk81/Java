package SecuenciasSelectivas;

import java.util.Scanner;

public class ejer20 {
    public static void main(String[] args) {
        //Fabrica de pantalones
        Scanner sc = new Scanner(System.in);
        System.out.println("Que modelo es? (A/B)");
        String modelo = sc.next();
        System.out.println("Ingrese la talla del pantalon (30,32 o 36)");
        int tallaPantalon = sc.nextInt();
        System.out.println("Ingrese la cantidad de tela que se usara en el corte");
        double cantidadTela = sc.nextDouble();
        System.out.println("Costo del metro de tela");
        double costoTela = sc.nextDouble();
        double modeloA = 1.80; // cargo 80% tela/mano de obra
        double modeloB = 1.95; // cargo 95% tela/mano de obra
        double talla3236 = 1.04; // cargo 4% mano de obra
        double cargoFinal = 1.30; // cargo 30% ganancia tienda
        double costoA = (1.50 * costoTela) * modeloA;
        double costoB = (1.80 * costoTela) * modeloB;
        if (tallaPantalon == 32){
            costoA = costoA * talla3236;
        } else if (tallaPantalon == 34) {
            costoB = costoA * talla3236;
        }
    }
}
