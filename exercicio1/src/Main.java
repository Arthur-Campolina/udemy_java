import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		String product1 = "Computer";
		String product2 = "Office desk";
			
		int age = 30;
		int code = 5290;
			
		char gender = 'F';
			
		double price1 = 2100.00;
		double price2 = 650.50;
		double measure = 53.234576;
			
		System.out.printf("Products:%n%s, which price is $ %.2f.%n%s, which price is $ %.2f.%n", product1, price1, product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %s.%n", age, code, gender);
		System.out.println();
		System.out.printf("Measure with eight decimal numbers: %.8f.%nRounded (three decimal numbers): %.3f.%n", measure, measure);
		Locale.setDefault(Locale.US);
		System.out.printf("Us decimal dot: %.3f.", measure);
	}
}

