import java.util.Scanner;
import java.util.Locale;

public class ex004 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, a, b;
        double div;

        System.out.println("Quantos pares deseja analisar?");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("%dª Série de números %n", i);
            System.out.print("Digite o Primeiro Número: ");
            a = sc.nextInt();
            System.out.print("Digite o Segundo Número: ");
            b = sc.nextInt();

            if (b == 0) {
                System.out.printf("Divisão Impossível%n");
            } else {
                div = (double) a / b;
                System.out.printf("A divisão é: %.1f%n", div);
            }

        }
        sc.close();
    }

}
