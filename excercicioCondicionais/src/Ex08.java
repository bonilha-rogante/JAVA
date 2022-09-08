import java.util.Scanner;
import java.util.Locale;

public class Ex08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double sal, imp;

        System.out.print("Valor do Salário R$ ");
        sal = sc.nextDouble();

        if (sal <= 2000.00) {
            System.out.println("ISENTO");
        } else if (sal <= 3000.00) {
            imp = (sal - 2000.00) * 0.08;
            System.out.printf("R$ %.2f%n", imp);
        } else if (sal <= 4500.00) {
            imp = (sal - 3000.00) * 0.18 + 1000.00 * 0.08;
            System.out.printf("R$ %.2f%n", imp);
        } else {
            imp = sal * 28 / 100;
            imp = (sal - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
            System.out.printf("R$ %.2f%n", imp);
        }

        sc.close();
    }

}
