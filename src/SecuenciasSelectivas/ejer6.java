package SecuenciasSelectivas;

import java.util.Scanner;

public class ejer6 {
    public static void main(String[] args) {
        //Costo y descuento
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio del articulo");
        double precio = sc.nextDouble();
        double costoTotal;
        if (precio >= 200){
            costoTotal = precio - (precio * 0.15);
            System.out.println("El precio total a pagar con un descuuento del 15% es de: "+ costoTotal);
        } else if (precio > 100) {
            costoTotal = precio - (precio * 0.12);
            System.out.println("El precio total a pagar con un descuuento del 12% es de: "+ costoTotal);
        } else {
            costoTotal = precio -(precio * 0.10);
            System.out.println("El precio total a pagar con un descuuento del 10% es de: "+ costoTotal);
        }
    }
}
