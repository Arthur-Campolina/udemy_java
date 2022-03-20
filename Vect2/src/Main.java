import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double sum = 0;

		System.out.print("Enter how many products you want to add: ");
		int n = sc.nextInt();
		Product[] arrayProduct = new Product[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Enter product's name: ");
			String name = sc.next();
			System.out.print("Enter product's price: ");
			double price = sc.nextDouble();
			arrayProduct[i] = new Product(name, price);
			sum += arrayProduct[i].getPrice();
		}

		double avg = sum / n;

		System.out.printf("Average price = %.2f.%n", avg);

		sc.close();
	}

}
