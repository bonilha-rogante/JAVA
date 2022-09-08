import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro número: ");
        a = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("Multiplos");
        } else {
            System.out.println("Não são Multiplos");
        }

        sc.close();

    }

}
