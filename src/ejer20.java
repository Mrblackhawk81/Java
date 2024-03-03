import java.util.Scanner;

public class ejer20 {
    public static void main(String[] args) {
        //Promedio estudiante
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nota del primer parcial");
        double nota1 = sc.nextDouble();
        System.out.println("Ingrese su nota del segundo parcial");
        double nota2 = sc.nextDouble();
        System.out.println("Ingrese su nota del tercer parcial");
        double nota3 = sc.nextDouble();
        double promedio = (nota1 * 0.25 + nota2 * 0.25) + nota3 * 0.50;
        System.out.println("El promedio del eestudiante es de: " + promedio);
    }


}
