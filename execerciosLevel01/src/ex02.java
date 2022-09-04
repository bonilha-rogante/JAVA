import java.util.Scanner;
import java.util.Locale;

public class ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio, area, pi = 3.14159;

        System.out.println("Digite o valor do raio: ");
        raio = sc.nextDouble();

        area = pi * Math.pow(raio, 2);

        System.out.printf("A Área de um círculo de raio %.2f. É de %.4f.", raio, area);

        sc.close();

    }

}
