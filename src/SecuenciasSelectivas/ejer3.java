package SecuenciasSelectivas;

import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args) {
        //Regalo
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su presupuesto");
        double presu = sc.nextDouble();
        if (presu <= 10.00){
            System.out.println("Con su presupuesto puede comprar tarjetas");
        } else if (presu >= 11.00 && presu <= 100.00) {
            System.out.println("Con su presupuesto puede comprar chocolates");
        } else if (presu >= 101.00 && presu <= 250.00) {
            System.out.println("Con su presupuesto puede comprar flores");
        } else {
            System.out.println("Con su presupuesto puede comprar un anillo ");
        }
    }
}
