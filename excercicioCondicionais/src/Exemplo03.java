import java.util.Scanner;
import java.util.Locale;

public class Exemplo03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Valor de A: ");
        a = sc.nextInt();
        System.out.println("Valor de B: ");
        b = sc.nextInt();
        System.out.println("Valor de C: ");
        c = sc.nextInt();

        if (a < b && a < c) {
            System.out.println("MENOR = " + a);
        } else {
            if (b < c) {
                System.out.println("MENOR = " + b);
            } else {
                System.out.println("MENOR = " + c);
            }
        }

        sc.close();
    }

}
