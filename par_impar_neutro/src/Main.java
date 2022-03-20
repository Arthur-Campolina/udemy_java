import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
			System.out.println("Digite um número:");
			int x = sc.nextInt();
			
			if (x%2 == 0 && x != 0) {
				System.out.println("Par!");
			} else if (x%2 != 0 && x != 0) {
				System.out.println("Impar!");
			} else {
				System.out.println("Neutro");
			}
			
		sc.close();
	}

}
