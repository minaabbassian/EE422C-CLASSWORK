package classwork5;

public class LegalSecretary extends Secretary {

	public LegalSecretary(int years) {
		super(years);
	}
	
	@Override
	public double getSalary() {
		return super.getSalary() + 5000 + getLongevityBonus();
	}
	
	public void file() {
		System.out.println("File, file, File, I love filing!");
	}
}
