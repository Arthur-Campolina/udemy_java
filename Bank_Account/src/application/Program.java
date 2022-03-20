package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is ther a inicial deposit (y/n): ");
		char question = sc.next().charAt(0);
		if (question != 'n') {
			System.out.print("Enter inicial deposit: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(accountNumber, name, initialDeposit);
		} else {
			account = new Account(accountNumber, name);
			
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit: ");
		double deposit = sc.nextDouble();
		System.out.println("Updated account data:");
		account.newDeposit(deposit);
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter withdrawal: ");
		double withdrawal = sc.nextDouble();
		System.out.println("Updated account data:");
		account.newWithdrawal(withdrawal);
		System.out.println(account);
		
		sc.close();
	}
}
