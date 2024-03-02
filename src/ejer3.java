import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args) {
        //Edad de las personas
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su año de nacimiento");
        int año = sc.nextInt();
        final int per = 2024;
        System.out.println("El solicitante tiene " + (per-año) + " años");
    }
}
