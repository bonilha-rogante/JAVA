import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0, gasolina = 0, diesel = 0, cod;
        System.out.print("Digite o Código do combustível: ");
        cod = sc.nextInt();
        while (cod != 4) {
            if (cod == 1) {
                alcool += 1;
            } else if (cod == 2) {
                gasolina += 1;
            } else if (cod == 3) {
                diesel += 1;
            }
            System.out.print("Digite o Código do combustível: ");
            cod = sc.nextInt();
        }
        System.out.println("Muito Obrigado!");
        System.out.printf("Alcool: %d%n", alcool);
        System.out.printf("Gasolina: %d%n", gasolina);
        System.out.printf("Diesel: %d%n", diesel);
        sc.close();
    }
}
