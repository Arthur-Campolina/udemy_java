import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //associa obj Scanner ao teclado no modo console.
			
			String x;
			x = sc.next(); //perimite que uma palavra seja armazenada na variavel x.
			System.out.println("Você digitou: " + x);
			
		
		sc.close();
	}
}
