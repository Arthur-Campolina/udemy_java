import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			int employeeN = sc.nextInt();
			double workedHours = sc.nextDouble();
			double wage = sc.nextDouble();
			
			double salary = wage * workedHours;
			
			System.out.printf("Employee's number: %d.%n", employeeN);
			System.out.printf("Employee's salary: %.2f.", salary);
		
		sc.close();
	}
}
