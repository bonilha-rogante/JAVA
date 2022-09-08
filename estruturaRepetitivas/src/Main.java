import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura, comprimento, metroQuadrado, area, preco;

        System.out.print("Largura: ");
        largura = sc.nextDouble();
        System.out.print("Comprimento: ");
        comprimento = sc.nextDouble();
        System.out.println("Valor do Metro Quadrado. R$ ");
        metroQuadrado = sc.nextDouble();

        area = largura * comprimento;
        preco = area * metroQuadrado;

        System.out.printf("Area: %.2f.%nPreço R$ %.2f.", area, preco);

        sc.close();

    }
}
