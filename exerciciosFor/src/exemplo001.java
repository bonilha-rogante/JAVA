import java.util.Scanner;

public class exemplo001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, tab;

        System.out.println("Número: ");
        n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            tab = i * n;
            System.out.printf("%d X %d = %d%n", i, n, tab);
        }

        sc.close();
    }
}
