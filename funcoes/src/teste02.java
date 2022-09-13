import java.util.Scanner;

public class teste02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.print("Digite 3 valores: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int maior = maxim(a, b, c);
        mostra(maior);

        sc.close();
    }

    public static int maxim(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }

        return aux;
    }

    public static void mostra(int valor) {
        System.out.print("Maior: " + valor);
    }

}
