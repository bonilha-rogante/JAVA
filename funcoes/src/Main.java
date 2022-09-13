import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Entre three numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int higher = max(a, b, c);
        showResult(higher);

        sc.close();

    }

    public static int max(int x, int y, int z) {
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

    public static void showResult(int value) {
        System.out.print("Higher = " + value);

    }

}
