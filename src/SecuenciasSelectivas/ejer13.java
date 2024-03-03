package SecuenciasSelectivas;

import java.util.Scanner;

public class ejer13 {
    public static void main(String[] args) {
        //Viaje de estudios
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de estudiantes");
        int alumnos = sc.nextInt();
        int cuota1 = 20;
        int cuota2 = 35;
        int cuota3 = 40;
        int cuato4 = 70;
        if (alumnos > 100){
            System.out.println("El costo total de los pasajes sera de: " + alumnos * cuota1);
        } else if (alumnos >= 50 && alumnos <100) {
            System.out.println("El costo total de los pasajes sera de: " + alumnos * cuota2) ;
        } else if (alumnos >= 20 && alumnos < 49) {
            System.out.println("El costo total de los pasajes sera de: " + alumnos * cuota3);
        } else {
            System.out.println("El costo total de los pasajes sera de: " + alumnos * cuato4);
        }
    }
}
