package SecuenciasSelectivas;

import java.util.Scanner;

public class ejer5 {
    public static void main(String[] args) {
        //Menor de edad
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la primera persona y edad");
        String nombre1 = sc.next();
        int edad1 = sc.nextInt();
        System.out.println("Ingrese el nombre de la segunda persona y edad");
        String nombre2 = sc.next();
        int edad2 = sc.nextInt();
        System.out.println("Ingrese el nombre de la tercera persona y edad");
        String nombre3 = sc.next();
        int edad3 = sc.nextInt();
        if (edad1 < edad2 && edad1 < edad3) {
            System.out.println(nombre1 + " con " + edad1 + " años " + "es el menor de edad");
        } else if (edad2 < edad1 && edad2 < edad3) {
            System.out.println(nombre2 + " con " + edad2 + " años " + " es el menor de edad");
        } else {
            System.out.println(nombre3 + " con " + edad3 + " años " + "es el menor de edad");
        }
    }
}
