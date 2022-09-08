import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha;
        System.out.print("Digite sua Senha: ");
        senha = sc.nextInt();
        while (senha != 2002) {
            System.out.println("Senha Invalida");
            System.out.print("Digite sua Senha: ");
            senha = sc.nextInt();
        }
        System.out.println("Acesso Permitido");

        sc.close();
    }
}
