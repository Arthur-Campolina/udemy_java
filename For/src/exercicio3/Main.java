package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantos testes voc? quer:");
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			
			System.out.print("\nDigite 3 n?meos: ");
			
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			double n3 = sc.nextDouble();
			double resultado = (((n1*2) + (n2*3) + (n3*5)) / 10);
			
			System.out.printf("%.2f ", resultado);
			
			}
		
		sc.close();
	}

}
