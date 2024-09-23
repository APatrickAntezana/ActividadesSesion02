import java.util.Scanner;

public class Actividadsesion2_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese el exponente: ");
        double exponente = scanner.nextDouble();

        // Calcular la potencia (base^exponente)
        double resultado = Math.pow(base, exponente);


        System.out.printf("%.2f elevado a %.0f es: %.2f%n", base, exponente, resultado);

        scanner.close();
    }
}
