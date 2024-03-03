package SecuenciasSelectivas;

import java.util.Scanner;

public class ejer18 {
    public static void main(String[] args) {
        //Bono salario
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese sus año de antiguedad");
        int antiguedad = sc.nextInt();
        System.out.println("Ingrese su sueldo ");
        int sueldo = sc.nextInt();
        double total;
        if (antiguedad > 4 || sueldo < 2000){
            total = sueldo * 0.25;
            System.out.println("El bono que recibira de su sueldo es del 25% que es :" +total+
                               "\n Su sueldo total es: " + sueldo * 1.25);
        } else {
            total = sueldo * 0.20;
            System.out.println("El bono que recibira de su sueldo es del 20% que es :" +total+
                               "\n Su sueldo total es: " + sueldo * 1.20);
        }
    }
}
