package SecuenciasSelectivas;

import java.util.Scanner;

public class ejer11 {
    public static void main(String[] args) {
        //Bono antiguedad
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas años trabajo");
        int años = sc.nextInt();
        if (años == 1){
            System.out.println("Se le dara un bono de 100$");
        } else if (años == 2) {
            System.out.println("Se le dara un bono de 200$");
        } else if (años == 3) {
            System.out.println("Se le dara un bono de 300$");
        } else if (años == 4) {
            System.out.println("Se le dara un bono de 400$");
        } else if (años == 5) {
            System.out.println("Se le dara un bono de 500$");
        } else {
            System.out.println("Se le dara un bono de 1000$");
        }
    }
}
