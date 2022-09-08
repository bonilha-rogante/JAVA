import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;

        System.out.print("Coordenada X: ");
        x = sc.nextInt();
        System.out.print("Coordenada Y: ");
        y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Q1");
            } else if (x < 0 && y > 0) {
                System.out.println("Q2");
            } else if (x < 0 && y < 0) {
                System.out.println("Q3");
            } else {
                System.out.println("Q4");
            }
            System.out.print("Coordenada X: ");
            x = sc.nextInt();
            System.out.print("Coordenada Y: ");
            y = sc.nextInt();
        }
        sc.close();
    }
}
