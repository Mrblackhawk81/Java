package SecuenciasSelectivas;

import java.util.Scanner;

public class ejer14 {
    public static void main(String[] args) {
        //Calificacion
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su calificaion (10:0)");
        int nota = sc.nextInt();
        if (nota == 10){
            System.out.println("Su califacacion es: A");
        } else if (nota == 9) {
            System.out.println("Su calificacion es: B");
        } else if (nota == 8) {
            System.out.println("Su calificaion es: C");
        } else if (nota < 8 && nota > 5) {
            System.out.println("Su calificaion es: D");
        } else {
            System.out.println("Su califacion es: F");
        }
    }
}
