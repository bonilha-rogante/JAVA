import java.util.Scanner;
import java.util.Locale;

public class Exemplo01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, notaFinal;

        System.out.println("Primeira Nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Segunda Nota: ");
        nota2 = sc.nextDouble();

        notaFinal = nota1 + nota2;

        if (notaFinal < 60.00) {
            System.out.println("REPROVADO");
        } else {
            System.out.println("APROVADO!");
        }

        System.out.printf("NOTA FINAL = %.2f", notaFinal);

        sc.close();
    }
}
