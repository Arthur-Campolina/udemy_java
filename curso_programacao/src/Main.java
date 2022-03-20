import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String nome = "Joana";
		int idade = 22;
		double renda = 45000.00;
		double y = 32.56678;
			
		System.out.printf("%.4f%n", y);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", y);
		System.out.println("A distância é: " + y + ".");
		System.out.printf("A distância é: %.2f km.%n", y);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n", nome, idade, renda);
	}

}
