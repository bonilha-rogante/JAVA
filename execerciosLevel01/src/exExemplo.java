import java.util.Scanner;
import java.util.Locale;

public class exExemplo {
    public static void main(String[] args) {
        double l, a, valor, area, preco;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a Largura: ");
        l = sc.nextDouble();
        System.out.println("Digite a Altura: ");
        a = sc.nextDouble();
        System.out.println("Qual o valor do m²: ");
        valor = sc.nextDouble();

        area = l * a;
        preco = area * valor;

        System.out.printf("O terreno tem %.2f M²%nO seu valor é de R$ %.2f", area, preco);

        sc.close();

    }
}
