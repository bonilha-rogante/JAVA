import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x, in = 0, out = 0;

        System.out.println("Digite quantos número você deseja colocar.");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("%d valor: ", i);
            x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in += 1;
            } else {
                out += 1;
            }

        }
        System.out.printf("%d in %n", in);
        System.out.printf("%d out", out);
        sc.close();
    }
}
