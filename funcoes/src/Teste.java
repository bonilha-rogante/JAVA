import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.print("Digite 3 valores: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int maior = maxi(a, b, c);
        qual(maior);

        sc.close();

    }

    public static int maxi(int x, int y, int z) {
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

    public static void qual(int resultado) {
        System.out.println("Maior: " + resultado);
    }

}
