import java.util.Scanner;
import java.util.Locale;

public class ex05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, qtd1, cod2, qtd2;
        double valor1, valor2, total;

        System.out.println("Qual o código do Primeiro produto: ");
        cod1 = sc.nextInt();
        System.out.println("Quantidade do Primeiro Produto: ");
        qtd1 = sc.nextInt();
        System.out.println("Qual o valor de cada peça: ");
        valor1 = sc.nextDouble();

        System.out.println("Qual o código do Segundo Produto: ");
        cod2 = sc.nextInt();
        System.out.println("Quantidade do Segundo Produto: ");
        qtd2 = sc.nextInt();
        System.out.println("Qual o valor de cada peça: ");
        valor2 = sc.nextDouble();

        total = ((qtd1 * valor1) + (qtd2 * valor2));

        System.out.printf("VALOR A PAGAR: R$ %.2f", total);

        sc.close();

    }

}
