import java.util.Scanner;
import java.util.Locale;

public class ex04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, h;
        double valor, sal;

        System.out.println("Digite seu R.A: ");
        n = sc.nextInt();
        System.out.println("Digite suas horas trabalhadas: ");
        h = sc.nextInt();
        System.out.println("Digite o valor de sua hora: ");
        valor = sc.nextDouble();

        sal = valor * h;

        System.out.printf("Matrícula: %d.%nSalario: US$ %.2f.", n, sal);

        sc.close();

    }

}
