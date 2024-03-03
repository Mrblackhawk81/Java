package SecuenciasSelectivas;

import java.util.Scanner;

public class ejer10 {
    public static void main(String[] args) {
        //Vacaciones
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su presupuesto para el pasaje");
        double pasaje = sc.nextDouble();
        double kmRecorrido = 0.5;
        double mexico =  (kmRecorrido * 750) * 2;
        double PV = (kmRecorrido * 800) * 2;
        double acapulco = (kmRecorrido * 1200) * 2;
        double cancun = (kmRecorrido * 1800) * 2;

        if (pasaje >= 750 && pasaje <= 1800 ) {
            if (pasaje >= mexico) {
                System.out.println("Usted puede viajar a mexico");
            }
            if (pasaje >= PV) {
                System.out.println("Usted puede viajar a PV");
            }
            if (pasaje >= acapulco) {
                System.out.println("Usted puede viajar a acapulco");
            }
            if (pasaje >= cancun) {
                System.out.println("Usted puede viajar a cancun");
            }
        } else {
            System.out.println("Su presupuesto no alcanza el establecido");
        }
    }
}
