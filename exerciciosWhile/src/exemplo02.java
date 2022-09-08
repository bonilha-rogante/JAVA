import java.util.Scanner;
import java.util.Locale;

public class exemplo02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idade, soma = 0, cont = 0;
        double media;

        System.out.print("Digite a idade: ");
        idade = sc.nextInt();

        while (idade >= 0) {
            soma += idade;
            cont += 1;
            media = soma / 2;
            System.out.print("Digite a idade: ");
            idade = sc.nextInt();
        }
        if (cont > 0) {
            media = (double) soma / cont;
            System.out.printf("%.2f%n", media);
        } else {
            System.out.print("Impossível Calcular");
        }

        sc.close();

    }
}
