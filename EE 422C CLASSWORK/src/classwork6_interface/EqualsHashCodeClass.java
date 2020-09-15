package classwork6_interface;

public class EqualsHashCodeClass {

	String name;
	String nickname;
	int age;
	
	//Go to Source
	//Generate hashcode() and equals()
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof EqualsHashCodeClass))
			return false;
		EqualsHashCodeClass other = (EqualsHashCodeClass) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
