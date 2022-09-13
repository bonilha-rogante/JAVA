import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, mask = 0b100000;
        System.out.print("Digite um valor: ");
        n = sc.nextInt();

        if ((n & mask) != 0) {
            System.out.println("6Th bit is true!");
        } else {
            System.out.println("6Th bit is false!");
        }
        sc.close();
    }

}
