import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int x = sc.nextInt();
		System.out.println((x >= 0) ? "positivo" : "negativo");

		sc.close();
	}
}
