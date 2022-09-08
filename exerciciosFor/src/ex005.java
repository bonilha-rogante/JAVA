import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, fat = 1;

        System.out.println("Qual o valor que deseja saber o fatorial?");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            fat *= i;
        }

        System.out.println(fat);
        sc.close();

    }

}
