package SecuenciasSelectivas;

import java.util.Scanner;

public class ejer12 {
    public static void main(String[] args) {
        //Sueldo semanal
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las horas trabajadas");
        int horas = sc.nextInt();
        System.out.println("Ingrese su sueldo por hora");
        int sueldoHora = sc.nextInt();
        int sueldoTotal;

        if (horas >= 41 && horas <= 45){
            sueldoTotal = (horas - 40) * sueldoHora * 2;
            System.out.println("su sueldo es de: " + ((40 * sueldoHora) + sueldoTotal));
        } else if (horas > 45 && horas <= 50) {
            sueldoTotal = (horas - 45) * sueldoHora * 3 + 30;
            System.out.println("Su sueldo es de: " + ((40 * sueldoHora)+ sueldoTotal));
        } else if (horas < 41) {
            System.out.println("Su sueldo es de: "+ horas * sueldoHora);
        } else {
            System.out.println("No esta permitido trabajar mas de 50 horas");
        }
    }
}
