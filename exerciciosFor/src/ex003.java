import java.util.Scanner;
import java.util.Locale;

public class ex003 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double a, b, c, media;

        System.out.println("Quantos testes deseja fazer?");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("%dº Sequência de Teste %n", i);
            System.out.printf("Primeiro valor: ");
            a = sc.nextDouble();
            System.out.printf("Segundo valor: ");
            b = sc.nextDouble();
            System.out.print("Terceiro valor: ");
            c = sc.nextDouble();
            media = (a * 2.0 + b * 3.0 + c * 5.0) / 10;
            System.out.printf("A média é %.1f.%n", media);
        }

        sc.close();

    }

}
