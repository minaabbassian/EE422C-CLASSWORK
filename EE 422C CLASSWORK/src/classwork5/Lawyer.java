package classwork5;

public class Lawyer extends Employee {
	
	public Lawyer() {
		super(0);
	}
	
	@Override
	public String getVacationForm() {
		return "pink";
	}
	
	@Override
	public int getVacationDays () {
		return 15;
	}
	
	public void sue() {
		System.out.println("See you in court, sucker!!! Bwahahahahah!!!");
	}

}
