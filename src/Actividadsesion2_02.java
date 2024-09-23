import java.util.Scanner;

public class Actividadsesion2_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        double numero = scanner.nextDouble();

        // Calcular la raíz cuadrada del número
        double raizCuadrada = Math.sqrt(numero);

        System.out.printf("La raíz cuadrada de %.2f es: %.2f%n", numero, raizCuadrada);

        scanner.close();
    }
}
