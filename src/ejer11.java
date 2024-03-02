import java.util.Scanner;

public class ejer11 {
    public static void main(String[] args) {
        //Pago electricidad
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los KW usados");
        double elec = sc.nextDouble();
        final double precio = 0.82;
        System.out.println("El precio a pagar por la electricidad es de: " + elec * precio);

    }
}
