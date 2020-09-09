package classwork5;

public class EmployeeMain {
	public static void main (String [] args) {
		Employee e1 = new Employee(2);
		System.out.println(e1.getSalary()); 
		Lawyer l1 = new Lawyer();
		System.out.println(l1.getSalary()); 
		
		System.out.println(e1.getVacationDays());
		System.out.println(l1.getVacationDays());
		
		// e1.sue();
		l1.sue();
		
		LegalSecretary ls1 = new LegalSecretary(6);
		System.out.println(ls1.getSalary());
		
		System.out.println(l1.getYears());
		System.out.println(ls1.getYears());
		
		System.out.println(Employee.dollarsToRupees(1000));
		System.out.println(e1.noOfEmployees);


	}
}
