package entites;

public class Employee {

	private int id;
	private String name;
	private double salary;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	
	public double getSalary() {
		return salary;
	}
	
		
	public double newSalary(double salary, double percentAumento) {
		return salary * (1 + percentAumento/100.0);
	}
	
	
}
