import java.util.Scanner;
import java.util.Locale;

public class Ex04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int horaInicio, horaFinal, total;

        System.out.println("Hora do Início: ");
        horaInicio = sc.nextInt();
        System.out.println("Hora do Final: ");
        horaFinal = sc.nextInt();

        if (horaInicio < horaFinal) {
            total = horaFinal - horaInicio;
        } else {
            total = 24 - horaInicio + horaFinal;
        }

        System.out.printf("O jogo durou %d Horas", total);

        sc.close();

    }

}
