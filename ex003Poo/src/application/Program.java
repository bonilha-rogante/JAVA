package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Student;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student st = new Student();

        System.out.print("Nome: ");
        st.name = sc.nextLine();
        System.out.print("Nota: ");
        st.n1 = sc.nextDouble();
        st.n2 = sc.nextDouble();
        st.n3 = sc.nextDouble();

        System.out.printf("Final Grade: %.2f%n", st.notaFinal());

        if (st.notaFinal() < 60) {
            System.out.println("Failed");
            System.out.printf("Missing %.2f Points%n", st.missingPoints());
        } else {
            System.out.println("Pass");
        }

        sc.close();
    }
}
