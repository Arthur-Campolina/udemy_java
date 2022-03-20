package exercício1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int key = 2002;
			int password = 0;
			while (password != key) {
				System.out.println("Invalid Password");
				password = sc.nextInt();
			}
			System.out.println("Access Allowed");
		
		
		sc.close();

	}

}
