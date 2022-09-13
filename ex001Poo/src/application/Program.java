package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Rectangle;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle retangulo = new Rectangle();

        System.out.print("Largura: ");
        retangulo.width = sc.nextDouble();
        System.out.print("Altura: ");
        retangulo.height = sc.nextDouble();

        System.out.printf("Area = %.2f", retangulo.area());
        System.out.printf("%nPerimeter = %.2f", retangulo.perimeter());
        System.out.printf("%nDiagonal = %.2f", retangulo.diagonal());

        sc.close();
    }
}
