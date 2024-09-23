import java.util.Scanner;

public class Actividadsesion2_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        // Calcular el área y la circunferencia del círculo
        double area = Math.PI * Math.pow(radio, 2);
        double circunferencia = 2 * Math.PI * radio;

        System.out.printf("Área del círculo: %.2f%n", area);
        System.out.printf("Circunferencia del círculo: %.2f%n", circunferencia);

        scanner.close();
    }
}
