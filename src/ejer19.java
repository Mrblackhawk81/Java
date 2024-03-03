import java.util.Scanner;
public class ejer19 {
    public static void main(String[] args) {
        //Area de un cuadrado
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del lado del cuadrado");
        int lado = sc.nextInt();
        int area = lado * lado;
        System.out.println("El area del cuadrado es de: " + area);

    }
}
