import java.util.Scanner;

public class exemplo002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, min, max, soma = 0;
        System.out.println("Digite o primeiro Valor: ");
        x = sc.nextInt();
        System.out.println("Digite o segundo Valor:");
        y = sc.nextInt();

        if (x < y) {
            min = x;
            max = y;
        } else {
            max = x;
            min = y;
        }

        for (int i = min + 1; i < max; i++) {
            if (i % 2 != 0) {
                soma = soma + i;
            }
        }
        System.out.println(soma);
        sc.close();
    }

}
