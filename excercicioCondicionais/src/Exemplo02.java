import java.util.Scanner;
import java.util.Locale;

public class Exemplo02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, delta, r1, r2;

        System.out.println("Valor de A: ");
        A = sc.nextDouble();
        System.out.println("Valor de B: ");
        B = sc.nextDouble();
        System.out.println("Valor de C: ");
        C = sc.nextDouble();

        delta = (Math.pow(B, 2)) - 4.0 * A * C;

        if (A == 0 || delta < 0) {
            System.out.println("Impossível Calcular");
        } else {
            r1 = (-B + Math.sqrt(delta)) / (2.0 * A);
            r2 = (-B - Math.sqrt(delta)) / (2.0 * A);
            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("R2 = %.5f", r2);
        }

        sc.close();

    }

}
