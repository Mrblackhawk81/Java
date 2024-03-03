package SecuenciasSelectivas;

import java.util.Scanner;

public class ejer16 {
    public static void main(String[] args) {
        //Bono salario
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su salario");
        int salario = sc.nextInt();
        System.out.println("Ingrese la puntuacion del profesor (0:151)");
        int puntuacion = sc.nextInt();
        if (puntuacion <= 100){
            System.out.println("Usted mantiene su salario: " + salario);
        } else if (puntuacion <=150) {
            System.out.println("Su sueldo es el doble de su salario: " + salario * 2);
        } else {
            System.out.println("Su sueldo es el triple de su salario: " + salario * 3);
        }
    }
}
