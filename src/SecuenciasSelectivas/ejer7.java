package SecuenciasSelectivas;

import java.util.Scanner;

public class ejer7 {
    public static void main(String[] args) {
        //Beca estudiantes
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();
        System.out.println("Ingrese su promedio");
        double promedio = sc.nextDouble();
        if (edad > 18){
            if (promedio >= 9){
                System.out.println("Usted tiene acceso a una beca de 2000$");
            } else if (promedio >= 7.5) {
                System.out.println("Usted tiene acceso a una beca de 1000$");
            } else if (promedio < 7.5 && promedio >= 6.0) {
                System.out.println("Usted tiene acceso a una beca de 500$");
            } else {
                System.out.println("Mejore su promedio para acceder a una beca");  
            }
        } else {
            if (promedio >= 9){
                System.out.println("Usted tiene acceso a una beca de 3000$");
            } else if (promedio < 9 && promedio >= 8) {
                System.out.println("Usted tiene acceso a una beca de 2000$");
            } else if (promedio < 8 && promedio >= 6) {
                System.out.println("Usted tiene acceso a una beca de 100$");
            } else {
                System.out.println("Su promedio no cumple con el establecido pero queda invitado");
            }
        }
    }
}
