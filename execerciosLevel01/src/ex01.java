import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        int a, b, soma;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Primeiro valor: ");
        a = sc.nextInt();
        System.out.println("Digite o Segundo valor: ");
        b = sc.nextInt();

        soma = a + b;
        System.out.printf("A soma entre %d e %d é igual a %d.", a, b, soma);

        sc.close();

    }
}
