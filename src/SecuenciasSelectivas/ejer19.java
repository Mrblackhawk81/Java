package SecuenciasSelectivas;

import java.util.Scanner;

public class ejer19 {
    public static void main(String[] args) {
        //Vacuna
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();
        System.out.println("Ingrese su sexo (H/M)");
        String sexo = sc.next();
        if (edad > 70){
            System.out.println("Vacuna tipo C");
        } else if (edad >= 16 && edad <= 69 && sexo.equals("M")){
            System.out.println("Vacuna tipo B");
        } else if (edad >= 16 && edad <= 69 && sexo.equals("H")) {
            System.out.println("Vacuna tipo A");
        } else {
            System.out.println("Vacuna tipo A");
        }
    }
}
