import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double triangle = (a*c)/2;
			double circle = Math.PI * (c * c);
			double trapezium = (c/2)*(a+b);
			double square = b * b;
			double rectangle = a * b;
			
			System.out.printf("Triangle: %.2f cm2.%n", triangle);
			System.out.printf("Circle: %.2f cm2.%n", circle);
			System.out.printf("Trapezium: %.2f cm2.%n", trapezium);
			System.out.printf("Square: %.2f cm2.%n", square);
			System.out.printf("Rectangle: %.2f cm2.", rectangle);
		sc.close();
	}

}
