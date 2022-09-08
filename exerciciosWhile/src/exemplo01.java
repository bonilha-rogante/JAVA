import java.util.Scanner;

public class exemplo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;

        System.out.println("Qual o valor de X: ");
        x = sc.nextInt();
        System.out.println("Qual o valor de Y: ");
        y = sc.nextInt();

        while (x != y) {
            if (x > y) {
                System.out.println("Decrescente");
            } else {
                System.out.println("Crescente");
            }
            System.out.print("Qual o valor de X: ");
            x = sc.nextInt();
            System.out.print("Qual o valor de Y: ");
            y = sc.nextInt();
        }

        sc.close();
    }
}
