package SecuenciasSelectivas;

import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        //Votacion
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();

        if (edad>=18){
            System.out.println("Usted puede votar");
        } else {
            System.out.println("No tiene la edad para votar");
        }
    }
}
