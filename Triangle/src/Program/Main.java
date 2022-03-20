package Program;

import java.util.Locale;
import java.util.Scanner;

import Enetities.Triangle;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle a = new Triangle();
		Triangle b = new Triangle();
		
		System.out.println("Enter triangle X's measures: ");
		a.a = sc.nextDouble();
		a.b = sc.nextDouble();
		a.c = sc.nextDouble();
		System.out.println("Enter triangle Y's measures: ");
		b.a = sc.nextDouble();
		b.b = sc.nextDouble();
		b.c = sc.nextDouble();
		
		double areaA = a.area();
		double areaB = b.area();
		
		System.out.printf("Traingle X's area = %.4f%n", areaA);
		System.out.printf("Traingle Y's area = %.4f%n", areaB);
		
		if (areaA > areaB) {
			System.out.print("Laerger area = X"); 
		} else {
			System.out.print("Laerger area = Y");
		}
		sc.close();
	}

}
