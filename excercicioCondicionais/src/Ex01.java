import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Digite um Número: ");
        n = sc.nextInt();

        if (n < 0) {
            System.out.printf("Você digitou: %d%nNEGATIVO", n);
        } else {
            System.out.printf("Você digitou: %d%nPOSITIVO", n);
        }

        sc.close();
    }

}
