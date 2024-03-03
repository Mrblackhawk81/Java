package SecuenciasSelectivas;

import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        //Tarifa Estacionamiento
        Scanner sc = new Scanner(System.in);
        double tarifa1 = 5.00;
        double tarifa2 = 4.00;
        double tarifa3 = 3.00;
        double tarifa4 = 2.00;
        System.out.println("Ingrese las horas que uso el estacionamiento");
        int hora = sc.nextInt();
        double costoTotal;
        if (hora <= 2){
            costoTotal = hora * tarifa1;
            System.out.println("El precio por el uso del estacionamiento es de " + costoTotal );
        } else if (hora <= 5) {
            costoTotal = 2 * tarifa1 + (hora-2) * tarifa2;
            System.out.println("El precio por el uso del estacionamiento es de " + costoTotal);
        } else if (hora <= 9) {
            costoTotal = 2 * tarifa1 + 3 * tarifa2 + (hora - 5) * tarifa3 ;
            System.out.println("El precio por el uso del estacionamiento es de " + costoTotal );
        } else {
            costoTotal = 2 * tarifa1 + 3 * tarifa2 + 4 * tarifa3 + (hora - 9) * tarifa4  ;
            System.out.println("El precio por el uso del estacionamiento es de " + costoTotal );
        }
    }
}
