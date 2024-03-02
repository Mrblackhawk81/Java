import java.util.Scanner;

public class ejer8 {
    public static void main(String[] args) {
        //Velocidad Constante
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la distancia de la ciudad en km");
        double distancia = sc.nextDouble();
        System.out.println("Ingrese la velocidad en km");
        double velocidad = sc.nextDouble();
        double tiempo = distancia / velocidad;
        System.out.println("el tiempo en que llegara a su destino en horas es de:" + tiempo);
    }
}
