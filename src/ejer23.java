import java.util.Scanner;

public class ejer23 {
    public static void main(String[] args) {
        //Costo hotel
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cuantos dias estuvo hospedado");
        int dias = sc.nextInt();
        int precioDia = 120;
        System.out.println("El precio a pagar por los dias hospedados en el hotel es de: " + dias * precioDia);
    }
}
