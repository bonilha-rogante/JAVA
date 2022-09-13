package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        int quantity;

        System.out.println("Enter Product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in Stock: ");
        product.quantity = sc.nextInt();

        System.out.printf("%nProduct data: " + product);

        System.out.printf("%nEnter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.printf("%nUpdate Data: " + product);

        System.out.printf("%nEnter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.printf("%nUpdate Data: " + product);

        sc.close();

    }
}
