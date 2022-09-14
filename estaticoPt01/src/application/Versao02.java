package application;

import java.util.Scanner;
import utility.Calculator;
import java.util.Locale;

public class Versao02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o Raio: ");
        double raio = sc.nextDouble();

        double c = Calculator.circunferencia(raio);
        double v = Calculator.volume(raio);

        System.out.printf("Circunferência: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", Calculator.PI);

        sc.close();

    }

}
