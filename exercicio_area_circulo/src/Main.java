import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			double r = sc.nextDouble();
			double sqr = Math.pow(r, 2);
			double a = sqr * Math.PI; 
			System.out.printf("The circle area is: %.4f.", a);
					
		sc.close();
	}

}
