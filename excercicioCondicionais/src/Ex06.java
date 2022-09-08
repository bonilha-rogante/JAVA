import java.util.Scanner;
import java.util.Locale;

public class Ex06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n;

        System.out.println("Digite um valor: ");
        n = sc.nextDouble();

        if (n < 0 || n > 100) {
            System.out.println("FORA DE INTERVALO");
        } else if (n <= 25.00) {
            System.out.println("INTERVALO (0, 25)");
        } else if (n <= 50.00) {
            System.out.println("INTERVALO (26, 50)");
        } else if (n < 75.00) {
            System.out.println("INTERVALO (51, 75)");
        } else {
            System.out.println("INTERVALO (76, 100)");
        }

        sc.close();

    }

}
