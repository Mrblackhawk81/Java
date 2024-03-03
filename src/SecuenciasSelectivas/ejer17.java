package SecuenciasSelectivas;

import java.util.Scanner;

public class ejer17 {
    public static void main(String[] args) {
        //Compra paquete
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el monto de dinero que recibio para saber que paquete puede comprar");
        int dinero = sc.nextInt();
        if (dinero >= 50000){
            System.out.println("Paquete A: Television, un modular, tres pares de zapatos, cinco camisas y cinco pantalones");
        } else if (dinero >= 20000) {
            System.out.println("Paquete B: Grabadora, tres pares de zapatos, cinco pantalones y cinco pantalones");
        } else if (dinero >= 10000) {
            System.out.println("Paquete C: Dos pares de zapatos, tres camisas y tres pantalones");
        } else {
            System.out.println("Paquete D: Un par de zapatos, dos camisas y dos pantalones");
        }
    }
}
