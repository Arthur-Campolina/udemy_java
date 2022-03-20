package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		List<Employee> list = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + ":");

			System.out.print("Id: ");
			Integer id = sc.nextInt();

			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			list.add(new Employee(id, name, salary));

		}

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		Integer id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This ID does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}

		System.out.println();
		System.out.println("List of employees: ");
		for (Employee obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int idEmployee = sc.nextInt();
		
		
		
		
		

		sc.close();
	}

	public static Integer poisitionId(List<Employee> list, int id) {
		for (Integer i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			} else {
				return null;
			}
		}
	}	
}
