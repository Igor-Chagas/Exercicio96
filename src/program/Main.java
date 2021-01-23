package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import entites.Employee;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Employee emp = new Employee();
		
		List<Integer> list = new ArrayList<>();
		
		List<Double> list2 = new ArrayList<>();
		
	
		
		System.out.print("How many employees will be registred? ");
		int n = sc.nextInt();
		Employee[] vect = new Employee[n];
		
				
		for (int i = 0; i < n; i++ ) {
		int a = i +1;
		System.out.println("Employee #" + a);
		System.out.print("ID: ");
		int id = sc.nextInt();
		list.add(id);
		System.out.print("Name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Salary: ");
		double salary = sc.nextDouble();
		list2.add(salary);
		vect[i]  = new Employee(id, name, salary);
		System.out.println();
		}
				
		System.out.print("Enter the employee id that will have salary increase : ");
		int idNum = sc.nextInt();
		if (list.indexOf(idNum) != -1) {
		double salary = vect[list.indexOf(idNum)].getSalary();
		System.out.print("Enter the percentage: ");
		double percentAumento = sc.nextDouble();
		emp.newSalary(salary, percentAumento);
		list2.remove(list.indexOf(idNum));
		list2.add(list.indexOf(idNum), emp.newSalary(salary, percentAumento));
				
		System.out.println();
		System.out.println("List of employees:");
		for (int i = 0; i < n; i++) {
		System.out.printf("%d, %s, %.2f\n",list.get(i) ,vect[i].getName(),list2.get(i));	
		}
		}		
				
		else {
		System.out.println("This id does not exist!");
		System.out.println();
		for (int i = 0; i < n; i++) {
		System.out.printf("%d, %s, %.2f\n",list.get(i) ,vect[i].getName(),vect[i].getSalary());
		}
		}
		sc.close();
	}
}
