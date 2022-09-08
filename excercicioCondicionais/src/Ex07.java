import java.util.Scanner;
import java.util.Locale;

public class Ex07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.println("Digite o valor de X: ");
        x = sc.nextDouble();
        System.out.println("Digite o valor de Y: ");
        y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("ORIGEM");
        } else if (x == 0.0) {
            System.out.println("EIXO Y");
        } else if (y == 0.0) {
            System.out.println("EIXO X");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }
        sc.close();
    }

}
