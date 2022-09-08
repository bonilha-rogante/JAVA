import java.util.Scanner;
import java.util.Locale;

public class Ex05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod, qtd;
        double hot = 4.00, sal = 4.50, ban = 5.00, tor = 2.00, ref = 1.50, total;

        System.out.println("Digite o Código do Item: ");
        cod = sc.nextInt();
        System.out.println("Digite a Quantidade: ");
        qtd = sc.nextInt();

        if (cod == 1) {
            total = hot * qtd;
        } else if (cod == 2) {
            total = sal * qtd;
        } else if (cod == 3) {
            total = ban * qtd;
        } else if (cod == 4) {
            total = tor * qtd;
        } else {
            total = ref * qtd;
        }

        System.out.printf("Total: R$ %.2f", total);

        sc.close();
    }

}
