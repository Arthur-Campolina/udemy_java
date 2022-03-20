import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			double l = sc.nextDouble();
			double h = sc.nextDouble();
			double sqrMetrePrice = sc.nextDouble();
			
			double a = l * h;
			double p = sqrMetrePrice * a;
			
			System.out.printf("The area of this lot is: %.2f%n", a);
			System.out.printf("The price is: %.2f", p);
		
		sc.close();
	}

}
