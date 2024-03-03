package SecuenciasSelectivas;

import java.util.Scanner;

public class ejer9 {
    public static void main(String[] args) {
        //Compañias Seguros
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tipo de poliza que quiere" +
                "\n A)Cobertura amplia " +
                "\n B)Daños a terceros");
        char opcion = sc.nextLine().charAt(0);
        double cuotaA = 1200.0;
        double cuotaB = 950.0;
        double alco = 0.10;
        double len = 0.05;
        double año = 0.20;
        double año2 = 0.10;
        double totalPrecio;
        double totalPrecio1;
        double totalPrecio2;
        double totalPrecio3;
        double totalPrecio4;
        if (opcion == 'A'){
            System.out.println("Tiene alguna habito al alcohol? S/N");
            char alcohol = sc.nextLine().charAt(0);
            if (alcohol == 'S'){
                totalPrecio1 = cuotaA * alco;
            } else {
                totalPrecio1 = 0;
            }

            System.out.println("Usa lentes? S/N");
            char lentes = sc.nextLine().charAt(0);
            if (lentes == 'S'){
                totalPrecio2 = cuotaA * len;
            } else {
                totalPrecio2 = 0;
            }

            System.out.println("Tiene alguna enfermedad? S/N");
            char enfermedad = sc.nextLine().charAt(0);
            if (enfermedad == 'S'){
                totalPrecio3 = cuotaA * len;
            } else {
                totalPrecio3 = 0;
            }

            System.out.println("Cuantos años tiene?");
            int AÑO = sc.nextInt();
            if (AÑO > 40){
                totalPrecio4 = cuotaA * año;
            } else {
                totalPrecio4 = cuotaA * año2;
            }
            totalPrecio = cuotaA + totalPrecio1 + totalPrecio2+ totalPrecio3 + totalPrecio4;
            System.out.println("El precio total a pagar es de: " + totalPrecio);

        } else if (opcion == 'B') {
            System.out.println("Tiene alguna habito al alcohol? S/N");
            char alcohol = sc.nextLine().charAt(0);
            if (alcohol == 'S'){
                totalPrecio1 = cuotaB * alco;
            } else {
                totalPrecio1 = 0;
            }

            System.out.println("Usa lentes? S/N");
            char lentes = sc.nextLine().charAt(0);
            if (lentes == 'S'){
                totalPrecio2 = cuotaB * len;
            } else {
                totalPrecio2 = 0;
            }

            System.out.println("Tiene alguna enfermedad? S/N");
            char enfermedad = sc.nextLine().charAt(0);
            if (enfermedad == 'S'){
                totalPrecio3 = cuotaB * len;
            } else {
                totalPrecio3 = 0;
            }

            System.out.println("Cuantos años tiene?");
            int AÑO = sc.nextInt();
            if (AÑO > 40){
                totalPrecio4 = cuotaB * año;
            } else {
                totalPrecio4 = cuotaB * año2;
            }
            totalPrecio = cuotaB + totalPrecio1 + totalPrecio2+ totalPrecio3 + totalPrecio4;
            System.out.println("El precio total a pagar es de: " + totalPrecio);

        }
    }
}
