import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, quad, cubo;

        System.out.println("Digite quantas linhas deseja");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            quad = i * i;
            cubo = i * i * i;
            System.out.printf("%d %d %d %n", i, quad, cubo);

        }
        sc.close();
    }
}
