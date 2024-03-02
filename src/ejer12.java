import java.util.Scanner;

public class ejer12 {
    public static void main(String[] args) {
        //Iva
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");
        double precio = sc.nextDouble();
        double descuento = precio - (precio*0.20);
        double iva = descuento * 1.15;
        System.out.println("El precio con descuento del 20% es de: " + descuento);
        System.out.println("El precio total a pagar mas el iva de 15% es de: " + iva);
    }
}
