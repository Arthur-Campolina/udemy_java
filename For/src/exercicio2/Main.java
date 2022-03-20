package exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite quantos valores você quer:");
			int N = sc.nextInt();
			
			int somaIn = 0;
			int somaOut = 0;
			for(int i=1; i <= N; i++) {
				System.out.println("Digite um número:");
				int X = sc.nextInt();
				if (X >=10 && X <= 20) {
					somaIn += 1;
				} else {
					somaOut += 1;
				}
			}
			System.out.print(somaIn + " in.\n" + somaOut + " out.");
			sc.close();
	}

}
