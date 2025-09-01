import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigoP1 = sc.nextInt();
        int numeroP1 = sc.nextInt();
        double valorUnitarioP1 = sc.nextDouble();

        int codigoP2 = sc.nextInt();
        int numeroP2 = sc.nextInt();
        double valorUnitarioP2 = sc.nextDouble();

        double valor = (numeroP1 * valorUnitarioP1) + (numeroP2 * valorUnitarioP2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valor);
    }
}