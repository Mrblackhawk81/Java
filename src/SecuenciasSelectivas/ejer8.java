package SecuenciasSelectivas;

import java.util.Scanner;

public class ejer8 {
    public static void main(String[] args) {
        //Bono antiguedad
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese sus años de antiguedad");
        int años = sc.nextInt();
        System.out.println("Ingrese su sueldo");
        double sueldo = sc.nextDouble();
        double sueldoAños = 0.0;
        double sueldoMayor = 0.0;
        if (años > 2 && años < 5){
            sueldoAños = sueldo * 1.20;
        } else  {
            sueldoAños = sueldo * 1.30;
        }
        if (sueldo < 1000){
            sueldoMayor = sueldo * 1.25;
        } else if (sueldo > 1000 && sueldo <= 3500) {
            sueldoMayor = sueldo * 1.15;
        } else {
            sueldoMayor = sueldo * 1.10;
        }
        if (sueldoAños > sueldoMayor ){
            System.out.println("Su sueldo con el bono mayor por años es de: " + sueldoAños);
        } else {
            System.out.println("Su sueldo con el bono mayor por su sueldo es de: " + sueldoMayor);
        }

    }
}
