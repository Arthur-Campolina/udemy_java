import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] array = new double[n];
		double sum = 0;
		
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextDouble();
			sum += array[i];
		}
		
		double avg = sum / n;
		
		System.out.printf("Average = %.2f.%n", avg);
				
		sc.close();
	}

}
