package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.first = sc.nextDouble();
		student.second = sc.nextDouble();
		student.third = sc.nextDouble();
		String result = student.pass();
		
		System.out.print(result);
		
		sc.close();
	}

}
