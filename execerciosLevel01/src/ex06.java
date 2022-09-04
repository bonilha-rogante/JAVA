import java.util.Locale;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, tri, cir, tra, qua, ret, pi = 3.14159;

        System.out.println("Digite o valor de A: ");
        A = sc.nextDouble();
        System.out.println("Digite o valor para B: ");
        B = sc.nextDouble();
        System.out.println("Digite o valor para C: ");
        C = sc.nextDouble();

        tri = A * C / 2;
        cir = pi * Math.pow(C, 2);
        tra = ((A + B) * C) / 2;
        qua = B * B;
        ret = A * B;

        System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n", tri, cir,
                tra, qua, ret);

        sc.close();

    }

}
