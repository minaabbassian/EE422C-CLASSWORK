package classwork7_lists;
import java.util.*;

public class CompareTest {

	public static void main(String[] args) {
		ArrayList<Employee> emps = new ArrayList<Employee>();
		Collections.sort(emps);
		
		Collections.sort(emps, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.name.compareTo(e2.name);
			}
		});
	}
}
