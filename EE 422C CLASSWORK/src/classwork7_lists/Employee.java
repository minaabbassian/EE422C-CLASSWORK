package classwork7_lists;

public class Employee implements Comparable<Employee> {
	public Employee(int i, String name) {
		salary = i;
		this.name = name;
	}

	int salary = 45000;
	String name;

	@Override
	public int compareTo(Employee o) {
		return salary - o.salary;
	}
	
	@Override 
	public String toString () {
		return "" + salary;
	}

}
