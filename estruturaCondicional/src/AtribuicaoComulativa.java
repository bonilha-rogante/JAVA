import java.util.Scanner;
import java.util.Locale;

public class AtribuicaoComulativa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos;
        double conta = 50.00;

        System.out.println("Quantos minutos você ficou: ");
        minutos = sc.nextInt();

        if (minutos > 100) {
            conta += (minutos - 100) * 2;
        }
        System.out.printf("Valor da conta: R$ %.2f", conta);
        sc.close();
    }

}