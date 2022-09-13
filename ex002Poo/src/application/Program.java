package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Employee;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee funcionario = new Employee();
        double percentage;

        System.out.print("Name: ");
        funcionario.name = sc.nextLine();
        System.out.printf("Gross salary: ");
        funcionario.grossSalary = sc.nextDouble();
        System.out.printf("Tax: ");
        funcionario.tax = sc.nextDouble();

        System.out.printf("Employee: %s, $%.2f%n", funcionario.name, funcionario.netSalary());
        System.out.printf("Whitch percentage to increase salary? ");
        percentage = sc.nextDouble();
        funcionario.increaseSalary(percentage);

        System.out.printf("%nUpdated data: " + funcionario);

        sc.close();

    }
}
