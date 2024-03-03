package SecuenciasSelectivas;

import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {
        //Sueldo Semanal
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las horas trabajadas");
        int horas = sc.nextInt();
        System.out.println("Ingrese el pago por hora");
        int sueldo = sc.nextInt();

        if (horas <= 40){
            System.out.println("Su sueldo sera por las horas trabajadas sera de " + horas*sueldo);
        } else {
            System.out.println("Sueldo por trabajar mas de 40 horas se duplica y seria " + (horas*sueldo)*2);
        }
    }
}
